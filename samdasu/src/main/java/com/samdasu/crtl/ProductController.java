package com.samdasu.crtl;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.samdasu.dto.Product;
import com.samdasu.service.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController {
	
	private static final Logger log = LoggerFactory.getLogger(ProductController.class);
	
	
	@Autowired
	private ProductService productService;
	
	private String uploadLoc = "/resources/upload/";
	
	@GetMapping("/list")
	public String getProducts(Model model) {
		List<Product> productList = productService.getProducts();
		model.addAttribute(productList);
		return "product/list";
	}
	
	@GetMapping("/up")
	public String inProduct(Model model) {
		List<Product> productList = productService.getProducts();
		model.addAttribute("productList",productList);
		return "product/up";
	}
	
	@PostMapping("/up")
	public String insProduct(Model model ,
			 @RequestParam("cate") String cate,
			 @RequestParam("pname") String pname,
			 @RequestParam("pcomment") String pcomment,
			 @RequestParam("pprice") int pprice,
			 @RequestParam("img") MultipartFile img,
			 @RequestParam("img2") MultipartFile img2,
			 @RequestParam("img3") MultipartFile img3 ,
			 HttpServletRequest request, HttpServletResponse response
			) {
		String uploadDir = request.getServletContext().getRealPath(uploadLoc);
		log.info("uploadDir : {}",uploadDir);
		File dir = new File(uploadDir);
		
		String imgName="", imgName2="" , imgName3="";
		
		if(!dir.exists()) {
			log.info("만듦");
			dir.mkdirs();
		}
		
		try {
			if(!img.isEmpty()) {
				imgName = saveFile(img , uploadDir);
			}
			if(!img2.isEmpty()) {
				imgName2 = saveFile(img2, uploadDir);
			}
			if(!img3.isEmpty()) {
				imgName3 = saveFile(img3, uploadDir);
			}
		} catch (IOException e) {
			log.error("예외 : {}" , e);
		}
		
		Product product = new Product();
		product.setCate(cate);
		product.setPname(pname);
		product.setPcomment(pcomment);
		product.setPprice(pprice);
		product.setImg(imgName);
		product.setImg2(imgName2);
		product.setImg3(imgName3);
		
		productService.insProduct(product);
		return "redirect:/product/list";
	}
	
	public String saveFile(MultipartFile file, String uploadDir) throws IOException {
		String originalFilename = file.getOriginalFilename();
		String newFilename = UUID.randomUUID().toString() + "_" + originalFilename;
		File serverFile = new File(uploadDir + newFilename);
		log.info("저장파일 : {}",serverFile);
		file.transferTo(serverFile);
		return newFilename;
	}
	
}

package com.samdasu.crtl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.samdasu.dto.Free;
import com.samdasu.service.FreeService;

@Controller
@RequestMapping("/free")
public class FreeController {
	
	@Autowired
	private FreeService freeService;
	
	
	@GetMapping("/list")
	public String getfrees(Model model) {
		List<Free> freeList = freeService.getFrees();
		model.addAttribute("freeList" , freeList);
		return "free/freeList";
	}
	
	@GetMapping("/one")
	public String getfree(Model model , HttpServletRequest request) {
		int num = Integer.parseInt(request.getParameter("num"));
		Free free = freeService.getFree(num);
		model.addAttribute("free",free);
		return "free/one";
	}
	
	@GetMapping("/insfree")
	public String insfree() {
		return "free/ins";
	}
	
	@PostMapping("/insfree")
	public void insFree(Model model , @ModelAttribute("free") Free free) {	
		freeService.insFree(free);
	}
	
	@GetMapping("/upfree")
	public String upFree(Model model , HttpServletRequest request) {
		int num = Integer.parseInt(request.getParameter("num"));
		Free free = freeService.getFree(num);
		model.addAttribute("free",free);
		return "free/up";
	}
	
	@PostMapping("/upfree")
	public void upFree(Model model , @ModelAttribute("free") Free free) {
		freeService.upFree(free);
	}
	
	@GetMapping("/delfree")
	public void delfree(Model model , @RequestParam("num") int num) {
		freeService.delFree(num);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

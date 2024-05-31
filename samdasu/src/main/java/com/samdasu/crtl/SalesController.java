package com.samdasu.crtl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.samdasu.dto.Sales;
import com.samdasu.service.SalesService;

@Controller
@RequestMapping("/sales")
public class SalesController {
	
	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private SalesService salesService;
	
	@GetMapping
	public String getAllSaless(Model model) {
		List<Sales> salesList = salesService.getAllSaless();
		model.addAttribute("salesList",salesList);
		return "sales/list";
	}
}

package com.samsung.ssh.main.controller;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.samsung.ssh.company.service.SearchCompanyService;

@Controller
public class MainController {
	
	Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Resource(name="companyService")
	SearchCompanyService companyService;
	
	// 메인 페이지
	@RequestMapping(value = "/main/main.do")
	public String main_main(Model model, 
			@RequestParam(value="company_name_keyword", required = false) String company_name_keyword) throws Exception {
		
		model.addAttribute("searchCompanyList",companyService.searchCompanyList(company_name_keyword));
		
		return "/main/main_main";
	}
}

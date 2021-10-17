package com.samsung.ssh.company.contoller;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.samsung.ssh.company.service.CompanyService;

@Controller
public class CompanyController {
	
Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Resource(name="companyService")
	CompanyService companyService;
	
	@PostMapping(value = "/company/search.do")
	public String search_company(Model model, RedirectAttributes ridirectAttr,
			@RequestParam(value="company_name_keyword", required = false) String company_name_keyword) throws Exception {
		log.debug("1 - company_name_keyword:"+company_name_keyword);
		ridirectAttr.addAttribute("company_name_keyword",company_name_keyword);
		log.debug("model.addAttribute");
		return "redirect:/company/search_result.do";
	}
	
	@GetMapping(value = "/company/search_result.do")
	public String search_company_result(Model model, 
			@RequestParam(value="company_name_keyword", required = false) String company_name_keyword) throws Exception {
		
		model.addAttribute("searchCompanyList",companyService.searchCompanyList(company_name_keyword));
		log.debug("/company/search_result.do: "+company_name_keyword);
		return "/company/search_company_result";
	}


}

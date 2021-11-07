package com.samsung.ssh.company.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.samsung.ssh.company.dao.SearchCompanyDAO;

@Service("searchCompanyService")
public class SearchCompanyService {
	
	Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Resource(name = "searchCompanyDAO")
	SearchCompanyDAO searchCompanyDAO;
	
	public List<Map<String, Object>> searchCompanyList(String company_name_keyword) throws Exception {
		return searchCompanyDAO.searchCompanyList(company_name_keyword);
	}
	
}

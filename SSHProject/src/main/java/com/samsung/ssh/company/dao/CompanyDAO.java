package com.samsung.ssh.company.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.samsung.ssh.common.dao.AbstractDAO;


@Repository("companyDAO")
public class CompanyDAO extends AbstractDAO {
	
	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> searchCompanyList(String company_name_keyword) throws Exception {
		return (List<Map<String, Object>>) selectList("company.searchCompanyList", company_name_keyword);
	}
}

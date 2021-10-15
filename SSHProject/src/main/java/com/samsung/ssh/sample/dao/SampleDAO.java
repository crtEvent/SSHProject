package com.samsung.ssh.sample.dao;

import org.springframework.stereotype.Repository;

import com.samsung.ssh.common.dao.AbstractDAO;

@Repository("sampleDAO")
public class SampleDAO extends AbstractDAO{
	
	public String getTime() {
		return (String) selectOne("sample.selectNow");
	}

}

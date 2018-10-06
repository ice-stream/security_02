package com.yhhz.service;

import java.util.List;
import java.util.Map;

import com.yhhz.pojo.PageResult;
import com.yhhz.pojo.SecurityVisitor;

public interface VisitorSv {

	List<SecurityVisitor> getAll();


	List<SecurityVisitor> findAll();


	PageResult findPage(int pageNum,int pageSize);


	void add(SecurityVisitor securityVisitor);


	void update(SecurityVisitor securityVisitor);


	SecurityVisitor findOne(Long id);


	void delete(Long[] ids);


	PageResult findPage(SecurityVisitor securityVisitor, int pageNum,int pageSize);

	List<Map> selectOptionList();




}

package com.yhhz.service;

import java.util.List;
import java.util.Map;

import com.yhhz.pojo.PageResult;
import com.yhhz.pojo.SecurityAtt;

public interface AttendanceSv {

	
	
	/**
	 * ��ѯ����Ա��
	 * @return
	 */


	public List<SecurityAtt> findAll();

	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum,int pageSize);

	public void add(SecurityAtt securityAtt);

	public void update(SecurityAtt securityAtt);

	public SecurityAtt findOne(Long id);

	public void delete(Long[] ids);

	public List<Map> selectOptionList();

	public PageResult findPage(SecurityAtt securityAtt,  int pageNum,int pageSize);
	

	
	
	
	
	
	
	
	
	
}

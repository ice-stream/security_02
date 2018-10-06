package com.yhhz.service.impl;

import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.yhhz.mapper.SecurityAttMapper;
import com.yhhz.pojo.PageResult;
import com.yhhz.pojo.SecurityAtt;
import com.yhhz.service.AttendanceSv;

@Service
public class AttendanceImpl  implements AttendanceSv{

	 @Autowired
	 SecurityAttMapper   securityAttDao;

	@Override
	public List<SecurityAtt> findAll() {
		return securityAttDao.selectAll();
	}

	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<SecurityAtt> page=   (Page<SecurityAtt>) securityAttDao.selectAll();
		return new PageResult(page.getTotal(), page.getResult());
	}

	@Override
	public void add(SecurityAtt securityAtt) {
		// TODO Auto-generated method stub
		securityAttDao.insert(securityAtt);		
	}

	@Override
	public void update(SecurityAtt securityAtt) {
		// TODO Auto-generated method stub
		securityAttDao.updateByPrimaryKeySelective(securityAtt);
	}

	@Override
	public SecurityAtt findOne(Long id) {
		// TODO Auto-generated method stub
		return securityAttDao.selectByPrimaryKey(id);
	}

	@Override
	public void delete(Long[] ids) {
		// TODO Auto-generated method stub
		for(Long attId:ids){
			securityAttDao.deleteByPrimaryKey(attId);
		}	
	}

	@Override
	public List<Map> selectOptionList() {

		return securityAttDao.selectOptionList();
	}

	@Override
	public PageResult findPage(SecurityAtt securityAtt, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		Page<SecurityAtt> page=   (Page<SecurityAtt>) securityAttDao.selectAll();
		
		
		return new PageResult(page.getTotal(), page.getResult());

	}

	
	


	


	
}

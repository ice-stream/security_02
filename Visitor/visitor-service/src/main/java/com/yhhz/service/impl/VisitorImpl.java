package com.yhhz.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.yhhz.mapper.SecurityVisitorMapper;
import com.yhhz.pojo.PageResult;

import com.yhhz.pojo.SecurityVisitor;
import com.yhhz.pojo.SecurityVisitor;
import com.yhhz.service.VisitorSv;

@Service
public class VisitorImpl  implements VisitorSv{
	
	
	
	
	@Autowired
	private SecurityVisitorMapper  visitorDao;
	
	

	@Override
	public List<SecurityVisitor> getAll() {
		// TODO Auto-generated method stub
		return visitorDao.selectAll();
	}



	@Override
	public List<SecurityVisitor> findAll() {
		// TODO Auto-generated method stub
		return visitorDao.selectAll();
	}



	


	@Override
	public void add(SecurityVisitor securityVisitor) {
		// TODO Auto-generated method stub
		 visitorDao.insertSelective(securityVisitor);
	}



	@Override
	public void update(SecurityVisitor securityVisitor) {
		// TODO Auto-generated method stub
		visitorDao.updateByPrimaryKey(securityVisitor);
	}



	@Override
	public SecurityVisitor findOne(Long id) {
		// TODO Auto-generated method stub
		return visitorDao.selectByPrimaryKey(id);
	}



	@Override
	public void delete(Long[] ids) {
		// TODO Auto-generated method stub
		for(Long vtId:ids){
			visitorDao.deleteByPrimaryKey(vtId);
		}	
	}






	@Override
	public List<Map> selectOptionList() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<SecurityVisitor> page=   (Page<SecurityVisitor>)visitorDao.selectAll();
		return new PageResult(page.getTotal(), page.getResult());
	}



	@Override
	public PageResult findPage(SecurityVisitor securityVisitor, int pageNum, int pageSize) {
           PageHelper.startPage(pageNum, pageSize);
		
		Page<SecurityVisitor> page=   (Page<SecurityVisitor>) visitorDao.selectAll();
		
		
		return new PageResult(page.getTotal(), page.getResult());

	}




	
	
	
	
}

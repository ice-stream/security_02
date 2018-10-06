package com.yhhz.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.yhhz.mapper.FaceLibraryMapper;
import com.yhhz.pojo.FaceLibrary;
import com.yhhz.pojo.PageResult;

import com.yhhz.service.FaceLibrarySv;



@Service
public class FaceLibraryImpl implements FaceLibrarySv {

	
	@Autowired
	FaceLibraryMapper   faceLibraryDao;

	@Override
	public List<FaceLibrary> findAll() {
		// TODO Auto-generated method stub
		return faceLibraryDao.selectAll();
	}

	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(FaceLibrary securityAtt) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(FaceLibrary faceLibrary) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public FaceLibrary findOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long[] ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public PageResult findPage(FaceLibrary faceLibrary, int pageNum, int pageSize) {
       PageHelper.startPage(pageNum, pageSize);
		
		Page<FaceLibrary> page=   (Page<FaceLibrary>) faceLibraryDao.selectAll();
		
		System.out.println(page);
		return new PageResult(page.getTotal(), page.getResult());
	}

	@Override
	public List<Map> selectOptionList() {
		// TODO Auto-generated method stub
		return null;
	}
	

	
	
	
}

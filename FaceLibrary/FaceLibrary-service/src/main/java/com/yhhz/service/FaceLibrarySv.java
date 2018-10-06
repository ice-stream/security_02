package com.yhhz.service;

import java.util.List;
import java.util.Map;

import com.yhhz.pojo.FaceLibrary;
import com.yhhz.pojo.PageResult;

public interface FaceLibrarySv   {

	
	

	public List<FaceLibrary> findAll();

	public PageResult findPage(int pageNum,int pageSize);

	public void add(FaceLibrary securityAtt);

	public void update(FaceLibrary faceLibrary);

	public FaceLibrary findOne(Long id);

	public void delete(Long[] ids);

	public PageResult findPage(FaceLibrary securityAtt, int pageNum,int pageSize);

	public List<Map> selectOptionList();
	
	
	
	
	
}

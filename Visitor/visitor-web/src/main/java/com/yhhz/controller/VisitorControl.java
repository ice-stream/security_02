package com.yhhz.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yhhz.pojo.PageResult;
import com.yhhz.pojo.Result;
import com.yhhz.pojo.SecurityVisitor;
import com.yhhz.pojo.SecurityVisitor;

import com.yhhz.service.VisitorSv;
import com.yhhz.util.Msg;

@RestController
@RequestMapping("/visitor")
public class VisitorControl {
	
	@Autowired
	private VisitorSv visitorSv;
	

	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<SecurityVisitor> findAll(){	
		
		return visitorSv.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return visitorSv.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param brand
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody SecurityVisitor securityVisitor){
		try {
			visitorSv.add(securityVisitor);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param brand
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody SecurityVisitor securityVisitor){
		try {
			visitorSv.update(securityVisitor);
			return new Result(true, "修改成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "修改失败");
		}
	}	
	
	/**
	 * 获取实体
	 * @param id
	 * @return
	 */
	@RequestMapping("/findOne")
	public SecurityVisitor findOne(Long id){
		return visitorSv.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Long [] ids){
		try {
			
			visitorSv.delete(ids);
			return new Result(true, "删除成功"); 
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "删除失败");
		}
	}
	
		/**
	 * 查询+分页
	 * @param brand
	 * @param page
	 * @param rows
	 * @return
	 */
	@RequestMapping("/search")
	public PageResult search(@RequestBody SecurityVisitor securityVisitor, int page, int rows  ){
	
	
		return visitorSv.findPage(securityVisitor, page, rows);		
	}
	
	
	@RequestMapping("/selectOptionList")
	public List<Map> selectOptionList() {
		return visitorSv.selectOptionList();
	}
	
	
	

}

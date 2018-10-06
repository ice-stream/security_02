package com.yhhz.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yhhz.pojo.PageResult;
import com.yhhz.pojo.Result;
import com.yhhz.pojo.SecurityAtt;
import com.yhhz.service.AttendanceSv;
import com.yhhz.util.Msg;

/**
 * @author Alan
 *
 */
@RestController
@RequestMapping("/attendance")
public class AttendanceControl {

	
	@Autowired
	AttendanceSv attendanceSv;
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<SecurityAtt> findAll(){	
		
		return attendanceSv.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return attendanceSv.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param attendance
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody SecurityAtt securityAtt){
		try {
			attendanceSv.add(securityAtt);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param attendance
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody SecurityAtt SecurityAtt){
		try {
			attendanceSv.update(SecurityAtt);
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
	public SecurityAtt findOne(Long id){
		return attendanceSv.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Long [] ids){
		try {
			
			attendanceSv.delete(ids);
			return new Result(true, "删除成功"); 
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "删除失败");
		}
	}
	
		/**
	 * 查询+分页
	 * @param attendance
	 * @param page
	 * @param rows
	 * @return
	 */
	@RequestMapping("/search")
	public PageResult search(@RequestBody SecurityAtt securityAtt, int page, int rows  ){
	

		
		return attendanceSv.findPage(securityAtt, page, rows);		
	}
	
	
	@RequestMapping("/selectOptionList")
	public List<Map> selectOptionList() {
		return attendanceSv.selectOptionList();
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

package com.yhhz.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yhhz.pojo.FaceLibrary;
import com.yhhz.pojo.PageResult;
import com.yhhz.pojo.Result;
import com.yhhz.service.FaceLibrarySv;
import com.yhhz.service.FaceLibrarySv;
import com.yhhz.util.Msg;

@RestController
@RequestMapping("/face")
public class FaceLibrarControl {


	@Autowired
	FaceLibrarySv faceLibrarySv;
	@Autowired
	private HttpServletResponse response;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")

	public List<FaceLibrary> findAll(){	
		
		return faceLibrarySv.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	@CrossOrigin(origins="http://localhost:9101")
	public PageResult  findPage(int page,int rows){	
		
		return faceLibrarySv.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param brand
	 * @return
	 */
	@RequestMapping("/add")
	@CrossOrigin(origins="http://localhost:9101")
	public Result add(@RequestBody FaceLibrary faceLibrary){
		try {
			faceLibrarySv.add(faceLibrary);
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
	@CrossOrigin(origins="http://localhost:9101")
	public Result update(@RequestBody FaceLibrary FaceLibrary){
		try {
			faceLibrarySv.update(FaceLibrary);
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
	public FaceLibrary findOne(Long id){
		return faceLibrarySv.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	@CrossOrigin(origins="http://localhost:9101")
	public Result delete(Long [] ids){
		try {
			
			faceLibrarySv.delete(ids);
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
	@CrossOrigin(origins="http://localhost:9101")
	public PageResult search(@RequestBody FaceLibrary faceLibrary, int page, int rows  ){
	
	
		return faceLibrarySv.findPage(faceLibrary, page, rows);		
	}
	
	
	@RequestMapping("/selectOptionList")
	public List<Map> selectOptionList() {
		return faceLibrarySv.selectOptionList();
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

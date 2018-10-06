package com.yhhz.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.yhhz.pojo.SecurityAtt;

public interface SecurityAttMapper {
    int deleteByPrimaryKey(Long attId);

    int insert(SecurityAtt record);

    int insertSelective(SecurityAtt record);

    SecurityAtt selectByPrimaryKey(Long attId);

    int updateByPrimaryKeySelective(SecurityAtt record);

    int updateByPrimaryKey(SecurityAtt record);

	List<SecurityAtt> selectAll();



	List<Map> selectOptionList();
	
	
	
	
}
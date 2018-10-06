package com.yhhz.mapper;

import java.util.List;

import com.yhhz.pojo.FaceLibrary;

public interface FaceLibraryMapper {
    int deleteByPrimaryKey(Long flId);

    int insert(FaceLibrary record);

    int insertSelective(FaceLibrary record);

    FaceLibrary selectByPrimaryKey(Long flId);

    int updateByPrimaryKeySelective(FaceLibrary record);

    int updateByPrimaryKey(FaceLibrary record);
    
    
    List<FaceLibrary> selectAll();

	int deleteBatch(List<Long> del_ids);
    
    
    
    
    
    
}
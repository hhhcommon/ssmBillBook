package com.copasso.billbook.dao;

import com.copasso.billbook.bean.BUser;
import com.copasso.billbook.bean.BUserCriteria;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface BUserMapper {
    long countByExample(BUserCriteria example);

    int deleteByExample(BUserCriteria example);

    int deleteByPrimaryKey(String id);

    int insert(BUser record);

    int insertSelective(BUser record);

    List<BUser> selectByExample(BUserCriteria example);

    BUser selectByPrimaryKey(String id);

    BUser selectByUserName(String username);

    int updateByExampleSelective(@Param("record") BUser record, @Param("example") BUserCriteria example);

    int updateByExample(@Param("record") BUser record, @Param("example") BUserCriteria example);

    int updateByPrimaryKeySelective(BUser record);

    int updateByPrimaryKey(BUser record);
}
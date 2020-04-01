package com.copasso.billbook.dao;

import com.copasso.billbook.bean.BSort;
import com.copasso.billbook.bean.BSortCriteria;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BSortMapper {
    long countByExample(BSortCriteria example);

    int deleteByExample(BSortCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(BSort record);

    int insertSelective(BSort record);

    List<BSort> selectByExample(BSortCriteria example);

    //通过用户id查询用户的支出账单分类，包含系统自带
    List<BSort> selectOutByUserId(String userid);

    //通过用户id查询用户的收入账单分类，包含系统自带
    List<BSort> selectInByUserId(String userid);

    BSort selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BSort record, @Param("example") BSortCriteria example);

    int updateByExample(@Param("record") BSort record, @Param("example") BSortCriteria example);

    int updateByPrimaryKeySelective(BSort record);

    int updateByPrimaryKey(BSort record);
}
package com.copasso.billbook.dao;

import com.copasso.billbook.bean.BPay;
import com.copasso.billbook.bean.BPayCriteria;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BPayMapper {
    long countByExample(BPayCriteria example);

    int deleteByExample(BPayCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(BPay record);

    int insertSelective(BPay record);

    List<BPay> selectByExample(BPayCriteria example);

    //通过用户id查询用户的支付方式，包含系统自带
    List<BPay> selectByUserId(String userid);

    BPay selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BPay record, @Param("example") BPayCriteria example);

    int updateByExample(@Param("record") BPay record, @Param("example") BPayCriteria example);

    int updateByPrimaryKeySelective(BPay record);

    int updateByPrimaryKey(BPay record);
}
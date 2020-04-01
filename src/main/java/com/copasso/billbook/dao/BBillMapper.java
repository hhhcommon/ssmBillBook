package com.copasso.billbook.dao;

import com.copasso.billbook.bean.BBill;
import com.copasso.billbook.bean.BBillCriteria;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface BBillMapper {
    long countByExample(BBillCriteria example);

    int deleteByExample(BBillCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(BBill record);

    int insertSelective(BBill record);

    List<BBill> selectByExample(BBillCriteria example);

    List<BBill> selectByUserId(String userid);

    List<BBill> selectBillsByUserIdWithSortYMD(String userid, String yearmonthday);

    List<BBill> selectBillsByUserIdYMD(String userid, String yearmonthday);

    List<BBill> selectOutBillsByUserIdAndSortIdWithSortYM(String userid, Integer sortid, String yearmonth);

    List<BBill> selectInBillsByUserIdAndSortIdWithSortYM(String userid, Integer sortid, String yearmonth);

    String getTotalIncomeByUserIdWithYearMonth(String userid, String yearmonth);

    String getTotalOutcomeByUserIdWithYearMonth(String userid, String yearmonth);

    String getTotalIncomeByUserIdWithSortIdYM(String userid, Integer sortid, String yearmonth);

    String getTotalOutcomeByUserIdWithSortIdYM(String userid, Integer sortid, String yearmonth);

    String getTotalIncomeByUserIdWithPayIdYM(String userid, Integer payid, String yearmonth);

    String getTotalOutcomeByUserIdWithPayIdYM(String userid, Integer payid, String yearmonth);

    String getTotalIncomeByUserIdWithYearMonthDay(String userid, String yearmonthday);

    String getTotalOutcomeByUserIdWithYearMonthDay(String userid, String yearmonthday);

    BBill selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BBill record, @Param("example") BBillCriteria example);

    int updateByExample(@Param("record") BBill record, @Param("example") BBillCriteria example);

    int updateByPrimaryKeySelective(BBill record);

    int updateByPrimaryKey(BBill record);
}
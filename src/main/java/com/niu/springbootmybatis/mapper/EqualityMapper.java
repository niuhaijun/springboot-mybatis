package com.niu.springbootmybatis.mapper;

import com.niu.springbootmybatis.model.Equality;
import com.niu.springbootmybatis.model.EqualityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface EqualityMapper {
    int countByExample(EqualityExample example);

    int deleteByExample(EqualityExample example);

    int deleteByPrimaryKey(String uuid);

    int insert(Equality record);

    int insertSelective(Equality record);

    List<Equality> selectByExampleWithRowbounds(EqualityExample example, RowBounds rowBounds);

    List<Equality> selectByExample(EqualityExample example);

    Equality selectByPrimaryKey(String uuid);

    int updateByExampleSelective(@Param("record") Equality record, @Param("example") EqualityExample example);

    int updateByExample(@Param("record") Equality record, @Param("example") EqualityExample example);

    int updateByPrimaryKeySelective(Equality record);

    int updateByPrimaryKey(Equality record);

    /**
     * 在mybatis中测试常量相等
     */
    List<Equality> testEquals(Equality record);
}
package com.niu.springbootmybatis.typehandlers;

import com.niu.springbootmybatis.model.enums.Status;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;
import org.apache.ibatis.type.TypeHandler;

/**
 * 参考链接
 *
 * https://my.oschina.net/fengwenyi/blog/1834812
 *
 *
 * @Author: niuhaijun
 * @Date: 2019-08-20 15:27
 * @Version 1.0
 */
// 指定JavaType
@MappedTypes({Status.class})

// 指定jdbcType,可以忽略
// @MappedJdbcTypes(JdbcType.VARCHAR)
public class StatusTypeHandler implements TypeHandler<Status> {


  /**
   * 将 javaType 转化为 jdbcType
   *
   * 用于定义在Mybatis设置参数时,该如何把Java类型的参数转换为对应的数据库类型
   */
  @Override
  public void setParameter(PreparedStatement preparedStatement, int i, Status status, JdbcType jdbcType) throws SQLException {
    preparedStatement.setInt(i, status.getCode());
  }

  /**
   * 将 jdbcType  转化为 javaType
   *
   * 用于在Mybatis获取数据结果集时，如何把数据库类型转换为对应的Java类型
   */
  @Override
  public Status getResult(ResultSet resultSet, String s) throws SQLException {
    Integer code = resultSet.getInt(s);
    return Status.getStatusByCode(code);
  }

  /**
   * 将 jdbcType  转化为 javaType
   *
   * 用于在Mybatis通过字段位置获取字段数据时,把数据库类型转换为对应的Java类型
   */
  @Override
  public Status getResult(ResultSet resultSet, int i) throws SQLException {
    Integer code = resultSet.getInt(i);
    return Status.getStatusByCode(code);
  }

  /**
   * 将 jdbcType  转化为 javaType
   *
   * 用于Mybatis在调用存储过程后，把数据库类型的数据转换为对应的Java类型
   */
  @Override
  public Status getResult(CallableStatement callableStatement, int i) throws SQLException {
    Integer code = callableStatement.getInt(i);
    return Status.getStatusByCode(code);
  }
}
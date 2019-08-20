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
   * @param preparedStatement
   * @param i
   * @param status
   * @param jdbcType
   * @throws SQLException
   */
  @Override
  public void setParameter(PreparedStatement preparedStatement, int i, Status status, JdbcType jdbcType) throws SQLException {
    preparedStatement.setInt(i, status.getCode());
  }

  /**
   * 将 jdbcType  转化为 javaType
   *
   *
   *
   * @param resultSet
   * @param s
   * @return
   * @throws SQLException
   */
  @Override
  public Status getResult(ResultSet resultSet, String s) throws SQLException {
    Integer code = resultSet.getInt(s);
    return Status.getStatusByCode(code);
  }

  /**
   * 将 jdbcType  转化为 javaType
   *
   * @param resultSet
   * @param i
   * @return
   * @throws SQLException
   */
  @Override
  public Status getResult(ResultSet resultSet, int i) throws SQLException {
    Integer code = resultSet.getInt(i);
    return Status.getStatusByCode(code);
  }

  /**
   * 将 jdbcType  转化为 javaType
   *
   * 用于存储过程
   *
   * @param callableStatement
   * @param i
   * @return
   * @throws SQLException
   */
  @Override
  public Status getResult(CallableStatement callableStatement, int i) throws SQLException {
    Integer code = callableStatement.getInt(i);
    return Status.getStatusByCode(code);
  }
}
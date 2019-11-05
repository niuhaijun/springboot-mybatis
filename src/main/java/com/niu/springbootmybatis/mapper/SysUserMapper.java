package com.niu.springbootmybatis.mapper;

import com.niu.springbootmybatis.model.SysUser;
import com.niu.springbootmybatis.model.SysUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface SysUserMapper {
    int countByExample(SysUserExample example);

    int deleteByExample(SysUserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    List<SysUser> selectByExampleWithBLOBsWithRowbounds(SysUserExample example, RowBounds rowBounds);

    List<SysUser> selectByExampleWithBLOBs(SysUserExample example);

    List<SysUser> selectByExampleWithRowbounds(SysUserExample example, RowBounds rowBounds);

    List<SysUser> selectByExample(SysUserExample example);

    SysUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysUser record, @Param("example") SysUserExample example);

    int updateByExampleWithBLOBs(@Param("record") SysUser record, @Param("example") SysUserExample example);

    int updateByExample(@Param("record") SysUser record, @Param("example") SysUserExample example);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKeyWithBLOBs(SysUser record);

    int updateByPrimaryKey(SysUser record);

    Long sumByExample(SysUserExample example);

    void batchInsert(@Param("items") List<SysUser> items);
}
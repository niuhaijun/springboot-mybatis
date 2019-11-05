package com.niu.springbootmybatis.mapper;

import com.niu.springbootmybatis.model.SysRolePrivilege;
import com.niu.springbootmybatis.model.SysRolePrivilegeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface SysRolePrivilegeMapper {
    int countByExample(SysRolePrivilegeExample example);

    int deleteByExample(SysRolePrivilegeExample example);

    int insert(SysRolePrivilege record);

    int insertSelective(SysRolePrivilege record);

    List<SysRolePrivilege> selectByExampleWithRowbounds(SysRolePrivilegeExample example, RowBounds rowBounds);

    List<SysRolePrivilege> selectByExample(SysRolePrivilegeExample example);

    int updateByExampleSelective(@Param("record") SysRolePrivilege record, @Param("example") SysRolePrivilegeExample example);

    int updateByExample(@Param("record") SysRolePrivilege record, @Param("example") SysRolePrivilegeExample example);

    Long sumByExample(SysRolePrivilegeExample example);

    void batchInsert(@Param("items") List<SysRolePrivilege> items);
}
package com.niu.springbootmybatis.mapper;

import com.niu.springbootmybatis.model.RepalceDeadLock;
import com.niu.springbootmybatis.model.RepalceDeadLockExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface RepalceDeadLockMapper {
    int countByExample(RepalceDeadLockExample example);

    int deleteByExample(RepalceDeadLockExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RepalceDeadLock record);

    int insertSelective(RepalceDeadLock record);

    List<RepalceDeadLock> selectByExampleWithRowbounds(RepalceDeadLockExample example, RowBounds rowBounds);

    List<RepalceDeadLock> selectByExample(RepalceDeadLockExample example);

    RepalceDeadLock selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RepalceDeadLock record, @Param("example") RepalceDeadLockExample example);

    int updateByExample(@Param("record") RepalceDeadLock record, @Param("example") RepalceDeadLockExample example);

    int updateByPrimaryKeySelective(RepalceDeadLock record);

    int updateByPrimaryKey(RepalceDeadLock record);

    int replace(@Param("repalceDeadLockList") List<RepalceDeadLock> repalceDeadLockList);
}
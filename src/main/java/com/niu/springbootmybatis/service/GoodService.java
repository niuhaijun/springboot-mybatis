package com.niu.springbootmybatis.service;

import com.github.pagehelper.PageInfo;
import com.niu.springbootmybatis.controller.param.GoodPara;
import com.niu.springbootmybatis.controller.param.UserPara;
import com.niu.springbootmybatis.controller.vo.GoodVO;
import com.niu.springbootmybatis.controller.vo.UserVO;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author: niuhaijun
 * @Date: 2019-04-11 15:14
 * @Version 1.0
 */
@Transactional
public interface GoodService {

  Integer add(GoodPara goodPara);

  Integer update(GoodPara goodPara);

  Integer logicDelete(GoodPara goodPara);

  Integer delete(GoodPara goodPara);

  List<GoodVO> select(GoodPara goodPara);

  PageInfo<GoodVO> pagedSelect(GoodPara goodPara);

}

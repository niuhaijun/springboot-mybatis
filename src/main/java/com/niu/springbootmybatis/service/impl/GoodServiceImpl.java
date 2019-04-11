package com.niu.springbootmybatis.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.niu.springbootmybatis.controller.param.GoodPara;
import com.niu.springbootmybatis.controller.vo.GoodVO;
import com.niu.springbootmybatis.mapper.GoodMapper;
import com.niu.springbootmybatis.model.Good;
import com.niu.springbootmybatis.model.GoodExample;
import com.niu.springbootmybatis.service.GoodService;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: niuhaijun
 * @Date: 2019-04-11 15:14
 * @Version 1.0
 */
@Service
public class GoodServiceImpl implements GoodService {

  @Autowired
  private GoodMapper goodMapper;

  @Override
  public Integer add(GoodPara goodPara) {

    Date date = new Date();
    goodPara.setCreateTime(date);
    goodPara.setUpdateTime(date);

    Good good = new Good();
    BeanUtils.copyProperties(goodPara, good);
    return goodMapper.insertSelective(good);
  }

  @Override
  public Integer update(GoodPara goodPara) {

    goodPara.setUpdateTime(new Date());
    Good good = new Good();
    BeanUtils.copyProperties(goodPara, good);

    GoodExample example = new GoodExample();
    example.createCriteria().andIdEqualTo(goodPara.getId());
    return goodMapper.updateByExampleSelective(good, example);
  }

  @Override
  public Integer logicDelete(GoodPara goodPara) {

    Good good = new Good();
    good.setUsed(0);
    good.setUpdateTime(new Date());

    GoodExample example = new GoodExample();
    example.createCriteria().andIdEqualTo(goodPara.getId());

    return goodMapper.updateByExampleSelective(good, example);
  }

  @Override
  public Integer delete(GoodPara goodPara) {

    return goodMapper.deleteByPrimaryKey(goodPara.getId());
  }

  @Override
  public List<GoodVO> select(GoodPara goodPara) {

    GoodExample example = new GoodExample();
    example.createCriteria().andUsedEqualTo(1);

    List<Good> userList = goodMapper.selectByExample(example);
    List<GoodVO> result = new ArrayList<>(userList.size());
    userList.forEach(t -> {
      GoodVO goodVO = new GoodVO();
      BeanUtils.copyProperties(t, goodVO);
      result.add(goodVO);
    });

    return result;
  }

  @Override
  public PageInfo<GoodVO> pagedSelect(GoodPara goodPara) {

    GoodExample example = new GoodExample();
    example.createCriteria().andUsedEqualTo(1);

    /**
     * 将参数传给这个方法就可以实现物理分页了，非常简单。
     */
    PageHelper.startPage(goodPara.getPageNum(), goodPara.getPageSize());
    List<GoodVO> result = select(goodPara);
    return new PageInfo<>(result);
  }

}

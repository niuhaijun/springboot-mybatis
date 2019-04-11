package com.niu.springbootmybatis.service.impl;

import com.niu.springbootmybatis.controller.param.DataParam;
import com.niu.springbootmybatis.controller.vo.DataVO;
import com.niu.springbootmybatis.mapper.DataMapper;
import com.niu.springbootmybatis.service.DataService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: niuhaijun
 * @Date: 2019-04-08 19:40
 * @Version 1.0
 */
@Service
public class DataServiceImpl implements DataService {


  @Autowired
  private DataMapper dataMapper;

  @Override
  public List<DataVO> analysisData(DataParam dataParam) {

    return dataMapper.analysisData(dataParam);
  }
}

package com.hualan.sfzy.service.impl;


import com.hualan.sfzy.model.entity.FmClassify;
import com.hualan.sfzy.mapper.FmClassifyMapper;
import com.hualan.sfzy.service.FmClassifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * FM分类服务实现类
 */
@Service
public class FmClassifyServiceImpl implements FmClassifyService {

    @Autowired
    private FmClassifyMapper fmClassifyMapper;

    @Override
    public int deleteMultiple(Integer[] ids) {
        return fmClassifyMapper.deleteMultiple(ids);
    }

    @Override
    public int insertSelective(FmClassify record) {
        return fmClassifyMapper.insertSelective(record);
    }

    @Override
    public FmClassify selectByPrimaryKey(Integer id) {
        return fmClassifyMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(FmClassify record) {
        return fmClassifyMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return fmClassifyMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<FmClassify> selectByClassifyName(String classifyName) {
        return fmClassifyMapper.selectByClassifyName(classifyName);
    }
}
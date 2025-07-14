package com.hualan.sfzy.service.impl;


import com.hualan.sfzy.model.entity.Fm;
import com.hualan.sfzy.mapper.FmMapper;
import com.hualan.sfzy.service.FmService;
import com.hualan.sfzy.model.vo.FmQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * FM服务实现类
 */
@Service
public class FmServiceImpl implements FmService {

    @Autowired
    private FmMapper fmMapper;

    @Override
    public int insertSelective(Fm record) {
        return fmMapper.insertSelective(record);
    }

    @Override
    public Fm selectByPrimaryKey(Integer id) {
        return fmMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Fm record) {
        return fmMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int deleteLogic(Integer id) {
        return fmMapper.deleteLogic(id);
    }

    @Override
    public int deleteMultiple(Integer[] ids) {
        return fmMapper.deleteMultiple(ids);
    }

    @Override
    public List<Fm> selectMultiple(FmQuery query) {
        return fmMapper.selectMultiple(query);
    }
}
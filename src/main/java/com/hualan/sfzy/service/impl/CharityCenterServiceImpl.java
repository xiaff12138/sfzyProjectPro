package com.hualan.sfzy.service.impl;

import com.hualan.sfzy.model.entity.CharityCenter;
import com.hualan.sfzy.mapper.CharityCenterMapper;
import com.hualan.sfzy.service.CharityCenterService;
import com.hualan.sfzy.model.vo.CharityCenterQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 公益中心服务实现类
 */
@Service
public class CharityCenterServiceImpl implements CharityCenterService {

    @Autowired
    private CharityCenterMapper charityCenterMapper;

    @Override
    public int insertSelective(CharityCenter record) {
        return charityCenterMapper.insertSelective(record);
    }

    @Override
    public CharityCenter selectByPrimaryKey(Integer id) {
        return charityCenterMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(CharityCenter record) {
        return charityCenterMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int deleteLogic(Integer id) {
        return charityCenterMapper.deleteLogic(id);
    }

    @Override
    public int deleteMultiple(Integer[] ids) {

        return charityCenterMapper.deleteMultiple(ids);

    }

    @Override
    public List<CharityCenter> selectMultiple(CharityCenterQuery query) {
        return charityCenterMapper.selectMultiple(query);
    }
}
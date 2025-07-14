package com.hualan.sfzy.service.impl;


import com.hualan.sfzy.model.entity.ConsultReservation;
import com.hualan.sfzy.mapper.ConsultReservationMapper;
import com.hualan.sfzy.service.ConsultReservationService;
import com.hualan.sfzy.model.vo.ConsultReservationQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 咨询预约服务实现类
 */
@Service
public class ConsultReservationServiceImpl implements ConsultReservationService {

    @Autowired
    private ConsultReservationMapper consultReservationMapper;

    @Override
    public int insertSelective(ConsultReservation record) {
        return consultReservationMapper.insertSelective(record);
    }

    @Override
    public ConsultReservation selectByPrimaryKey(Integer id) {
        return consultReservationMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(ConsultReservation record) {
        return consultReservationMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int deleteLogic(Integer id) {
        return consultReservationMapper.deleteLogic(id);
    }

    @Override
    public int deleteMultiple(Integer[] ids) {
        return consultReservationMapper.deleteMultiple(ids);
    }

    @Override
    public List<ConsultReservation> selectMultiple(ConsultReservationQuery query) {
        return consultReservationMapper.selectMultiple(query);
    }
}
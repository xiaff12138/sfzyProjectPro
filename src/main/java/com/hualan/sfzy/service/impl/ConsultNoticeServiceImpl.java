package com.hualan.sfzy.service.impl;


import com.hualan.sfzy.model.entity.ConsultNotice;
import com.hualan.sfzy.mapper.ConsultNoticeMapper;
import com.hualan.sfzy.service.ConsultNoticeService;
import com.hualan.sfzy.model.vo.ConsultNoticeQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 咨询通知服务实现类
 */
@Service
public class ConsultNoticeServiceImpl implements ConsultNoticeService {

    @Autowired
    private ConsultNoticeMapper consultNoticeMapper;

    @Override
    public int insertSelective(ConsultNotice record) {
        return consultNoticeMapper.insertSelective(record);
    }

    @Override
    public ConsultNotice selectByPrimaryKey(Integer id) {
        return consultNoticeMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(ConsultNotice record) {
        return consultNoticeMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int deleteLogic(Integer id) {
        return consultNoticeMapper.deleteLogic(id);
    }

    @Override
    public int deleteMultiple(Integer[] ids) {

        return consultNoticeMapper.deleteMultiple(ids);
    }


    @Override
    public List<ConsultNotice> selectMultiple(ConsultNoticeQuery query) {
        return consultNoticeMapper.selectMultiple(query);
    }
}
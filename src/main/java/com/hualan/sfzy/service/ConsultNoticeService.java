package com.hualan.sfzy.service;


import com.hualan.sfzy.model.entity.ConsultNotice;
import com.hualan.sfzy.model.vo.ConsultNoticeQuery;

import java.util.List;

/**
 * 咨询通知服务接口
 */
public interface ConsultNoticeService {

    /**
     * 新增咨询通知
     */
    int insertSelective(ConsultNotice record);

    /**
     * 根据ID查询咨询通知
     */
    ConsultNotice selectByPrimaryKey(Integer id);

    /**
     * 根据ID更新咨询通知
     */
    int updateByPrimaryKeySelective(ConsultNotice record);

    /**
     * 根据ID逻辑删除咨询通知
     */
    int deleteLogic(Integer id);

    /**
     * 批量逻辑删除咨询通知
     */
    int deleteMultiple(Integer[] ids);

    /**
     * 多条件查询咨询通知
     */
    List<ConsultNotice> selectMultiple(ConsultNoticeQuery query);
}
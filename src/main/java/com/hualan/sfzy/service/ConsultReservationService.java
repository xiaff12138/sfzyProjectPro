package com.hualan.sfzy.service;


import com.hualan.sfzy.model.entity.ConsultReservation;
import com.hualan.sfzy.model.vo.ConsultReservationQuery;

import java.util.List;

/**
 * 咨询预约服务接口
 */
public interface ConsultReservationService {

    /**
     * 新增咨询预约
     */
    int insertSelective(ConsultReservation record);

    /**
     * 根据ID查询咨询预约
     */
    ConsultReservation selectByPrimaryKey(Integer id);

    /**
     * 根据ID更新咨询预约
     */
    int updateByPrimaryKeySelective(ConsultReservation record);

    /**
     * 根据ID逻辑删除咨询预约
     */
    int deleteLogic(Integer id);

    /**
     * 批量逻辑删除咨询预约
     */
    int deleteMultiple(Integer[] ids);



    /**
     * 多条件查询咨询预约
     */
    List<ConsultReservation> selectMultiple(ConsultReservationQuery query);
}
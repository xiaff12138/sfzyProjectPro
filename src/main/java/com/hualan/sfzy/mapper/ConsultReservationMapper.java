package com.hualan.sfzy.mapper;



import com.hualan.sfzy.model.entity.ConsultReservation;
import com.hualan.sfzy.model.vo.ConsultReservationQuery;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
* @author 夏俊丰
* @description 针对表【consult_reservation】的数据库操作Mapper
* @createDate 2025-07-05 17:57:34
* @Entity com.hualan.domain.ConsultReservation
*/
@Mapper
public interface ConsultReservationMapper {

    int insertSelective(ConsultReservation record);

    ConsultReservation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ConsultReservation record);

    int deleteLogic(Integer id);//逻辑删除

    int deleteMultiple (Integer[] ids);//批量逻辑删除

    List<ConsultReservation> selectMultiple(ConsultReservationQuery query);//多表联查

}

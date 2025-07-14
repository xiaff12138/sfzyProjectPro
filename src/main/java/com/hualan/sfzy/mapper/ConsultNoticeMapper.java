package com.hualan.sfzy.mapper;


import com.hualan.sfzy.model.entity.ConsultNotice;
import com.hualan.sfzy.model.vo.ConsultNoticeQuery;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;

/**
* @author 夏俊丰
* @description 针对表【consult_notice】的数据库操作Mapper
* @createDate 2025-07-03 19:43:53
* @Entity com.hualan.domain.ConsultNotice
*/
@Mapper
public interface ConsultNoticeMapper {

    int insertSelective(ConsultNotice record);//插入数据

    ConsultNotice selectByPrimaryKey(Integer id);//查询数据

    int updateByPrimaryKeySelective(ConsultNotice record);//更新数据

    int deleteLogic(Integer id);//逻辑删除

    int deleteMultiple (Integer[] ids);//批量逻辑删除

    List<ConsultNotice> selectMultiple(ConsultNoticeQuery query);//多表联查
}

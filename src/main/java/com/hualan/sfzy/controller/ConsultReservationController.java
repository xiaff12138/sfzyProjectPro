package com.hualan.sfzy.controller;


import com.hualan.sfzy.model.entity.ConsultReservation;
import com.hualan.sfzy.service.ConsultReservationService;
import com.hualan.sfzy.model.vo.ConsultReservationQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 咨询预约控制器
 */
@RestController
@RequestMapping("/consultReservation")
public class ConsultReservationController {

    @Autowired
    private ConsultReservationService consultReservationService;

    /**
     * 添加咨询预约
     * @param consultReservation 咨询预约信息
     * @return 操作结果
     */
    @PostMapping("/add")
    public ResponseEntity<Map<String, Object>> add(@RequestBody ConsultReservation consultReservation) {
        Map<String, Object> result = new HashMap<>();
        try {
            int rows = consultReservationService.insertSelective(consultReservation);
            if (rows > 0) {
                result.put("success", true);
                result.put("message", "预约成功");
            } else {
                result.put("success", false);
                result.put("message", "预约失败");
            }
        } catch (Exception e) {
            result.put("success", false);
            result.put("message", "预约失败: " + e.getMessage());
        }
        return ResponseEntity.ok(result);
    }

    /**
     * 根据ID查询咨询预约
     * @param id 咨询预约ID
     * @return 咨询预约信息
     */
    @GetMapping("/get/{id}")
    public ResponseEntity<Map<String, Object>> getById(@PathVariable Integer id) {
        Map<String, Object> result = new HashMap<>();
        try {
            ConsultReservation consultReservation = consultReservationService.selectByPrimaryKey(id);
            if (consultReservation != null) {
                result.put("success", true);
                result.put("data", consultReservation);
            } else {
                result.put("success", false);
                result.put("message", "未找到相关预约信息");
            }
        } catch (Exception e) {
            result.put("success", false);
            result.put("message", "查询失败: " + e.getMessage());
        }
        return ResponseEntity.ok(result);
    }

    /**
     * 更新咨询预约
     * @param consultReservation 咨询预约信息
     * @return 操作结果
     */
    @PutMapping("/update")
    public ResponseEntity<Map<String, Object>> update(@RequestBody ConsultReservation consultReservation) {
        Map<String, Object> result = new HashMap<>();
        try {
            int rows = consultReservationService.updateByPrimaryKeySelective(consultReservation);
            if (rows > 0) {
                result.put("success", true);
                result.put("message", "更新成功");
            } else {
                result.put("success", false);
                result.put("message", "更新失败");
            }
        } catch (Exception e) {
            result.put("success", false);
            result.put("message", "更新失败: " + e.getMessage());
        }
        return ResponseEntity.ok(result);
    }

    /**
     * 删除咨询预约
     * @param id 咨询预约ID
     * @return 操作结果
     */
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Map<String, Object>> delete(@PathVariable Integer id) {
        Map<String, Object> result = new HashMap<>();
        try {
            int rows = consultReservationService.deleteLogic(id);
            if (rows > 0) {
                result.put("success", true);
                result.put("message", "取消预约成功");
            } else {
                result.put("success", false);
                result.put("message", "取消预约失败");
            }
        } catch (Exception e) {
            result.put("success", false);
            result.put("message", "取消预约失败: " + e.getMessage());
        }
        return ResponseEntity.ok(result);
    }

    /**
     * 批量删除咨询预约
     * @param ids 咨询预约ID数组
     * @return 操作结果
     */
    @DeleteMapping("/batchDelete")
    public ResponseEntity<Map<String, Object>> batchDelete(@RequestBody Integer[] ids) {
        Map<String, Object> result = new HashMap<>();
        try {
            int rows = consultReservationService.deleteMultiple(ids);
            if (rows > 0) {
                result.put("success", true);
                result.put("message", "批量取消预约成功");
            } else {
                result.put("success", false);
                result.put("message", "批量取消预约失败");
            }
        } catch (Exception e) {
            result.put("success", false);
            result.put("message", "批量取消预约失败: " + e.getMessage());
        }
        return ResponseEntity.ok(result);
    }

    /**
     * 多条件查询咨询预约
     * @param query 查询参数
     * @return 咨询预约列表
     */
    @PostMapping("/list")
    public ResponseEntity<Map<String, Object>> list(@RequestBody ConsultReservationQuery query) {
        Map<String, Object> result = new HashMap<>();
        try {
            List<ConsultReservation> list = consultReservationService.selectMultiple(query);
            result.put("success", true);
            result.put("data", list);
        } catch (Exception e) {
            result.put("success", false);
            result.put("message", "查询失败: " + e.getMessage());
        }
        return ResponseEntity.ok(result);
    }
}
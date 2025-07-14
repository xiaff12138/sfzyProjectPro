package com.hualan.sfzy.controller;


import com.hualan.sfzy.model.entity.ConsultNotice;
import com.hualan.sfzy.service.ConsultNoticeService;
import com.hualan.sfzy.model.vo.ConsultNoticeQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 咨询通知控制器
 */
@RestController
@RequestMapping("/consultNotice")
public class ConsultNoticeController {

    @Autowired
    private ConsultNoticeService consultNoticeService;

    /**
     * 添加咨询通知
     * @param consultNotice 咨询通知信息
     * @return 操作结果
     */
    @PostMapping("/add")
    public ResponseEntity<Map<String, Object>> add(@RequestBody ConsultNotice consultNotice) {
        Map<String, Object> result = new HashMap<>();
        try {
            int rows = consultNoticeService.insertSelective(consultNotice);
            if (rows > 0) {
                result.put("success", true);
                result.put("message", "添加成功");
            } else {
                result.put("success", false);
                result.put("message", "添加失败");
            }
        } catch (Exception e) {
            result.put("success", false);
            result.put("message", "添加失败: " + e.getMessage());
        }
        return ResponseEntity.ok(result);
    }

    /**
     * 根据ID查询咨询通知
     * @param id 咨询通知ID
     * @return 咨询通知信息
     */
    @GetMapping("/get/{id}")
    public ResponseEntity<Map<String, Object>> getById(@PathVariable Integer id) {
        Map<String, Object> result = new HashMap<>();
        try {
            ConsultNotice consultNotice = consultNoticeService.selectByPrimaryKey(id);
            if (consultNotice != null) {
                result.put("success", true);
                result.put("data", consultNotice);
            } else {
                result.put("success", false);
                result.put("message", "未找到相关信息");
            }
        } catch (Exception e) {
            result.put("success", false);
            result.put("message", "查询失败: " + e.getMessage());
        }
        return ResponseEntity.ok(result);
    }

    /**
     * 更新咨询通知
     * @param consultNotice 咨询通知信息
     * @return 操作结果
     */
    @PutMapping("/update")
    public ResponseEntity<Map<String, Object>> update(@RequestBody ConsultNotice consultNotice) {
        Map<String, Object> result = new HashMap<>();
        try {
            int rows = consultNoticeService.updateByPrimaryKeySelective(consultNotice);
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
     * 删除咨询通知
     * @param id 咨询通知ID
     * @return 操作结果
     */
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Map<String, Object>> delete(@PathVariable Integer id) {
        Map<String, Object> result = new HashMap<>();
        try {
            int rows = consultNoticeService.deleteLogic(id);
            if (rows > 0) {
                result.put("success", true);
                result.put("message", "删除成功");
            } else {
                result.put("success", false);
                result.put("message", "删除失败");
            }
        } catch (Exception e) {
            result.put("success", false);
            result.put("message", "删除失败: " + e.getMessage());
        }
        return ResponseEntity.ok(result);
    }

    /**
     * 批量删除咨询通知
     * @param ids 咨询通知ID数组
     * @return 操作结果
     */
    @DeleteMapping("/batchDelete")
    public ResponseEntity<Map<String, Object>> batchDelete(@RequestBody Integer[] ids) {
        Map<String, Object> result = new HashMap<>();
        try {
            int rows = consultNoticeService.deleteMultiple(ids);
            if (rows > 0) {
                result.put("success", true);
                result.put("message", "批量删除成功");
            } else {
                result.put("success", false);
                result.put("message", "批量删除失败");
            }
        } catch (Exception e) {
            result.put("success", false);
            result.put("message", "批量删除失败: " + e.getMessage());
        }
        return ResponseEntity.ok(result);
    }

    /**
     * 多条件查询咨询通知
     * @param query 查询参数
     * @return 咨询通知列表
     */
    @PostMapping("/list")
    public ResponseEntity<Map<String, Object>> list(@RequestBody ConsultNoticeQuery query) {
        Map<String, Object> result = new HashMap<>();
        try {
            List<ConsultNotice> list = consultNoticeService.selectMultiple(query);
            result.put("success", true);
            result.put("data", list);
        } catch (Exception e) {
            result.put("success", false);
            result.put("message", "查询失败: " + e.getMessage());
        }
        return ResponseEntity.ok(result);
    }
}
package com.hualan.sfzy.controller;


import com.hualan.sfzy.model.entity.CharityCenter;
import com.hualan.sfzy.service.CharityCenterService;
import com.hualan.sfzy.model.vo.CharityCenterQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 公益中心控制器
 */
@RestController
@RequestMapping("/charityCenter")
public class CharityCenterController {

    @Autowired
    private CharityCenterService charityCenterService;

    /**
     * 添加公益中心信息
     * @param charityCenter 公益中心信息
     * @return 操作结果
     */
    @PostMapping("/add")
    public ResponseEntity<Map<String, Object>> add(@RequestBody CharityCenter charityCenter) {
        Map<String, Object> result = new HashMap<>();
        try {
            int rows = charityCenterService.insertSelective(charityCenter);
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
     * 根据ID查询公益中心信息
     * @param id 公益中心ID
     * @return 公益中心信息
     */
    @GetMapping("/get/{id}")
    public ResponseEntity<Map<String, Object>> getById(@PathVariable Integer id) {
        Map<String, Object> result = new HashMap<>();
        try {
            CharityCenter charityCenter = charityCenterService.selectByPrimaryKey(id);
            if (charityCenter != null) {
                result.put("success", true);
                result.put("data", charityCenter);
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
     * 更新公益中心信息
     * @param charityCenter 公益中心信息
     * @return 操作结果
     */
    @PutMapping("/update")
    public ResponseEntity<Map<String, Object>> update(@RequestBody CharityCenter charityCenter) {
        Map<String, Object> result = new HashMap<>();
        try {
            int rows = charityCenterService.updateByPrimaryKeySelective(charityCenter);
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
     * 删除公益中心信息
     * @param id 公益中心ID
     * @return 操作结果
     */
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Map<String, Object>> delete(@PathVariable Integer id) {
        Map<String, Object> result = new HashMap<>();
        try {
            int rows = charityCenterService.deleteLogic(id);
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
     * 批量删除公益中心信息
     * @param ids 公益中心ID数组
     * @return 操作结果
     */
    @DeleteMapping("/batchDelete")
    public ResponseEntity<Map<String, Object>> batchDelete(@RequestBody Integer[] ids) {
        Map<String, Object> result = new HashMap<>();
        try {
            int rows = charityCenterService.deleteMultiple(ids);
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
     * 多条件查询公益中心信息
     * @param query 查询参数
     * @return 公益中心信息列表
     */
    @PostMapping("/list")
    public ResponseEntity<Map<String, Object>> list(@RequestBody CharityCenterQuery query) {
        Map<String, Object> result = new HashMap<>();
        try {
            List<CharityCenter> list = charityCenterService.selectMultiple(query);
            result.put("success", true);
            result.put("data", list);
            result.put("total", list.size());
        } catch (Exception e) {
            result.put("success", false);
            result.put("message", "查询失败: " + e.getMessage());
        }
        return ResponseEntity.ok(result);
    }
}
package com.hualan.sfzy.controller;


import com.hualan.sfzy.model.entity.Fm;
import com.hualan.sfzy.service.FmService;

import com.hualan.sfzy.model.vo.FmQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * FM控制器
 */
@RestController
@RequestMapping("/fm")
public class FmController {

    @Autowired
    private FmService fmService;

    /**
     * 添加FM信息
     * @param fm FM信息
     * @return 操作结果
     */
    @PostMapping("/add")
    public ResponseEntity<Map<String, Object>> add(@RequestBody Fm fm) {
        Map<String, Object> result = new HashMap<>();
        try {
            int rows = fmService.insertSelective(fm);
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
     * 根据ID查询FM信息
     * @param id FM ID
     * @return FM信息
     */
    @GetMapping("/get/{id}")
    public ResponseEntity<Map<String, Object>> getById(@PathVariable Integer id) {
        Map<String, Object> result = new HashMap<>();
        try {
            Fm fm = fmService.selectByPrimaryKey(id);
            if (fm != null) {
                result.put("success", true);
                result.put("data", fm);
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
     * 更新FM信息
     * @param fm FM信息
     * @return 操作结果
     */
    @PutMapping("/update")
    public ResponseEntity<Map<String, Object>> update(@RequestBody Fm fm) {
        Map<String, Object> result = new HashMap<>();
        try {
            int rows = fmService.updateByPrimaryKeySelective(fm);
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
     * 删除FM信息
     * @param id FM ID
     * @return 操作结果
     */
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Map<String, Object>> delete(@PathVariable Integer id) {
        Map<String, Object> result = new HashMap<>();
        try {
            int rows = fmService.deleteLogic(id);
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
     * 批量删除FM信息
     * @param ids FM ID数组
     * @return 操作结果
     */
    @DeleteMapping("/batchDelete")
    public ResponseEntity<Map<String, Object>> batchDelete(@RequestBody Integer[] ids) {
        Map<String, Object> result = new HashMap<>();
        try {
            int rows = fmService.deleteMultiple(ids);
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
     * 多条件查询FM信息
     * @param query 查询参数
     * @return FM信息列表
     */
    @PostMapping("/list")
    public ResponseEntity<Map<String, Object>> list(@RequestBody FmQuery query) {
        Map<String, Object> result = new HashMap<>();
        try {
            List<Fm> list = fmService.selectMultiple(query);
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
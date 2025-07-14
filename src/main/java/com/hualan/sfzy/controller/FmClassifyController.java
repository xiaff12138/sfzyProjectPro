package com.hualan.sfzy.controller;


import com.hualan.sfzy.model.entity.FmClassify;
import com.hualan.sfzy.service.FmClassifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * FM分类控制器
 */
@RestController
@RequestMapping("/fmClassify")
public class FmClassifyController {

    @Autowired
    private FmClassifyService fmClassifyService;

    /**
     * 添加FM分类
     * @param fmClassify FM分类信息
     * @return 操作结果
     */
    @PostMapping("/add")
    public ResponseEntity<Map<String, Object>> add(@RequestBody FmClassify fmClassify) {
        Map<String, Object> result = new HashMap<>();
        try {
            int rows = fmClassifyService.insertSelective(fmClassify);
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
     * 根据ID查询FM分类
     * @param id FM分类ID
     * @return FM分类信息
     */
    @GetMapping("/get/{id}")
    public ResponseEntity<Map<String, Object>> getById(@PathVariable Integer id) {
        Map<String, Object> result = new HashMap<>();
        try {
            FmClassify fmClassify = fmClassifyService.selectByPrimaryKey(id);
            if (fmClassify != null) {
                result.put("success", true);
                result.put("data", fmClassify);
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
     * 根据分类名查询FM分类
     * @param classifyName 分类名
     * @return FM分类信息
     */
    @GetMapping("/getByName")
    public ResponseEntity<Map<String, Object>> getByName(@RequestParam String classifyName) {
        Map<String, Object> result = new HashMap<>();
        try {
            List<FmClassify> fmClassify = fmClassifyService.selectByClassifyName(classifyName);

            if (fmClassify != null) {
                result.put("success", true);
                result.put("data", fmClassify);
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
     * 更新FM分类
     * @param fmClassify FM分类信息
     * @return 操作结果
     */
    @PutMapping("/update")
    public ResponseEntity<Map<String, Object>> update(@RequestBody FmClassify fmClassify) {
        Map<String, Object> result = new HashMap<>();
        try {
            int rows = fmClassifyService.updateByPrimaryKeySelective(fmClassify);
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
     * 删除FM分类
     * @param id FM分类ID
     * @return 操作结果
     */
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Map<String, Object>> delete(@PathVariable Integer id) {
        Map<String, Object> result = new HashMap<>();
        try {
            int rows = fmClassifyService.deleteByPrimaryKey(id);
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
     * 批量删除FM分类
     * @param ids FM分类ID数组
     * @return 操作结果
     */
    @DeleteMapping("/batchDelete")
    public ResponseEntity<Map<String, Object>> batchDelete(@RequestBody Integer[] ids) {
        Map<String, Object> result = new HashMap<>();
        try {
            int rows = fmClassifyService.deleteMultiple(ids);
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
}
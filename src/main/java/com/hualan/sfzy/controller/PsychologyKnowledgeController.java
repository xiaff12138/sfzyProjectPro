package com.hualan.sfzy.controller;


import com.hualan.sfzy.model.entity.PsychologyKnowledge;
import com.hualan.sfzy.service.PsychologyKnowledgeService;
import com.hualan.sfzy.model.vo.PsychologyKnowledgeQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 心理知识控制器
 */
@RestController
@RequestMapping("/psychologyKnowledge")
public class PsychologyKnowledgeController {

    @Autowired
    private PsychologyKnowledgeService psychologyKnowledgeService;

    /**
     * 添加心理知识
     * @param psychologyKnowledge 心理知识信息
     * @return 操作结果
     */
    @PostMapping("/add")
    public ResponseEntity<Map<String, Object>> add(@RequestBody PsychologyKnowledge psychologyKnowledge) {
        Map<String, Object> result = new HashMap<>();
        try {
            int rows = psychologyKnowledgeService.insertSelective(psychologyKnowledge);
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
     * 根据ID查询心理知识
     * @param id 心理知识ID
     * @return 心理知识信息
     */
    @GetMapping("/get/{id}")
    public ResponseEntity<Map<String, Object>> getById(@PathVariable Integer id) {
        Map<String, Object> result = new HashMap<>();
        try {
            PsychologyKnowledge psychologyKnowledge = psychologyKnowledgeService.selectByPrimaryKey(id);
            if (psychologyKnowledge != null) {
                result.put("success", true);
                result.put("data", psychologyKnowledge);
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
     * 更新心理知识
     * @param psychologyKnowledge 心理知识信息
     * @return 操作结果
     */
    @PutMapping("/update")
    public ResponseEntity<Map<String, Object>> update(@RequestBody PsychologyKnowledge psychologyKnowledge) {
        Map<String, Object> result = new HashMap<>();
        try {
            int rows = psychologyKnowledgeService.updateByPrimaryKeySelective(psychologyKnowledge);
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
     * 删除心理知识
     * @param id 心理知识ID
     * @return 操作结果
     */
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Map<String, Object>> delete(@PathVariable Integer id) {
        Map<String, Object> result = new HashMap<>();
        try {
            int rows = psychologyKnowledgeService.deleteLogic(id);
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
     * 批量删除心理知识
     * @param ids 心理知识ID数组
     * @return 操作结果
     */
    @DeleteMapping("/batchDelete")
    public ResponseEntity<Map<String, Object>> batchDelete(@RequestBody Integer[] ids) {
        Map<String, Object> result = new HashMap<>();
        try {
            int rows = psychologyKnowledgeService.deleteMultiple(ids);
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
     * 多条件查询心理知识
     * @param query 查询参数
     * @return 心理知识列表
     */
    @PostMapping("/list")
    public ResponseEntity<Map<String, Object>> list(@RequestBody PsychologyKnowledgeQuery query) {
        Map<String, Object> result = new HashMap<>();
        try {
            List<PsychologyKnowledge> list = psychologyKnowledgeService.selectMultiple(query);
            result.put("success", true);
            result.put("data", list);
        } catch (Exception e) {
            result.put("success", false);
            result.put("message", "查询失败: " + e.getMessage());
        }
        return ResponseEntity.ok(result);
    }
}
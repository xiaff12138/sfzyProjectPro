package com.hualan.sfzy.controller;

import com.hualan.sfzy.model.entity.ArticleClassify;
import com.hualan.sfzy.service.ArticleClassifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 文章分类控制器
 */
@RestController
@RequestMapping("/articleClassify")
public class ArticleClassifyController {

    @Autowired
    private ArticleClassifyService articleClassifyService;

    /**
     * 添加文章分类
     * @param articleClassify 文章分类信息
     * @return 操作结果
     */
    @PostMapping("/add")
    public ResponseEntity<Map<String, Object>> add(@RequestBody ArticleClassify articleClassify) {
        Map<String, Object> result = new HashMap<>();
        try {
            int rows = articleClassifyService.insert(articleClassify);
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
     * 根据ID查询文章分类
     * @param id 文章分类ID
     * @return 文章分类信息
     */
    @GetMapping("/get/{id}")
    public ResponseEntity<Map<String, Object>> getById(@PathVariable Integer id) {
        Map<String, Object> result = new HashMap<>();
        try {
            ArticleClassify articleClassify = articleClassifyService.selectByPrimaryKey(id);
            if (articleClassify != null) {
                result.put("success", true);
                result.put("data", articleClassify);
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
     * 根据分类名查询文章分类
     * @param classifyName 分类名
     * @return 文章分类信息
     */
    @GetMapping("/getByName")
    public ResponseEntity<Map<String, Object>> getByName(@RequestParam String classifyName) {
        Map<String, Object> result = new HashMap<>();
        try {
            List<ArticleClassify> articleClassify = articleClassifyService.selectByClassifyName(classifyName);
            if (articleClassify != null) {
                result.put("success", true);
                result.put("data", articleClassify);
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
     * 更新文章分类
     * @param articleClassify 文章分类信息
     * @return 操作结果
     */
    @PutMapping("/update")
    public ResponseEntity<Map<String, Object>> update(@RequestBody ArticleClassify articleClassify) {
        Map<String, Object> result = new HashMap<>();
        try {
            int rows = articleClassifyService.updateByPrimaryKeySelective(articleClassify);
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
     * 删除文章分类
     * @param id 文章分类ID
     * @return 操作结果
     */
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Map<String, Object>> delete(@PathVariable Integer id) {
        Map<String, Object> result = new HashMap<>();
        try {
            int rows = articleClassifyService.deleteByPrimaryKey(id);
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
     * 批量删除文章分类
     * @param ids 文章分类ID数组
     * @return 操作结果
     */
    @DeleteMapping("/batchDelete")
    public ResponseEntity<Map<String, Object>> batchDelete(@RequestBody Integer[] ids) {
        Map<String, Object> result = new HashMap<>();
        try {
            int rows = articleClassifyService.deleteMultiple(ids);
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
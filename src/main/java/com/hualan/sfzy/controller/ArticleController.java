package com.hualan.sfzy.controller;


import com.hualan.sfzy.model.entity.Article;

import com.hualan.sfzy.service.ArticleService;
import com.hualan.sfzy.model.vo.ArticleQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @PostMapping("/add")
    public ResponseEntity<Map<String, Object>> add(@RequestBody Article article) {
        Map<String, Object> result = new HashMap<>();
        try {
            int rows = articleService.insert(article);
            if (rows > 0) {
                result.put("success", true);
                result.put("message", "添加成功");
            } else {
                result.put("success", false);
                result.put("message", "添加失败");
            }
        } catch (Exception e) {
            result.put("success", false);
        }
        return ResponseEntity.ok(result);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Map<String, Object>> delete(@PathVariable Integer id) {
        Map<String, Object> result = new HashMap<>();
        try {
            int rows = articleService.deleteByPrimaryKey(id);
            if (rows > 0) {
                result.put("success", true);
                result.put("message", "删除成功");
            } else {
                result.put("success", false);
                result.put("message", "删除失败");
            }

        } catch (Exception e) {
            result.put("success", false);

        }
        return ResponseEntity.ok(result);
    }

    @DeleteMapping("/deleteMultiple")
    public ResponseEntity<Map<String, Object>> deleteMultiple(@RequestBody Integer[] ids){
        Map<String, Object> result = new HashMap<>();
        try {
            int rows = articleService.deleteMultiple(ids);
            if (rows > 0) {
                result.put("success", true);
                result.put("message", "批量删除成功");
            } else {
                result.put("success", false);
                result.put("message", "批量删除失败");
            }
        }catch (Exception e){
            result.put("success", false);
        }
        return ResponseEntity.ok(result);
    }

    @PutMapping("/update")
    public ResponseEntity<Map<String, Object>> update(@RequestBody Article  article) {
        Map<String, Object> result = new HashMap<>();
        try {
            int rows = articleService.updateByPrimaryKeySelective(article);
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

    @GetMapping("/find/{id}")
    public ResponseEntity<Map<String, Object>> findById(@PathVariable Integer id) {
        Map<String, Object> result = new HashMap<>();
        try {
           Article article = articleService.selectByPrimaryKey(id);
           if (article != null) {
               result.put("success", true);
               result.put("data", article);
           }else {
               result.put("success", false);
               result.put("message", "未找到相关信息");
           }
        } catch (Exception e) {
            result.put("success", false);
            result.put("message", "查询失败: " + e.getMessage());
        }
        return ResponseEntity.ok(result);

    }

    @GetMapping("/findMultiple")
    public ResponseEntity<Map<String, Object>> findMultiple(@RequestBody ArticleQuery query){
        Map<String, Object> result = new HashMap<>();
        try {
            List<Article> articles = articleService.selectMultiple(query);
            if (articles != null && articles.size() > 0) {
                result.put("success", true);
                result.put("data", articles);
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
}
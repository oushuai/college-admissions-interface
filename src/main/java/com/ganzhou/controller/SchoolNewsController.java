package com.ganzhou.controller;

import java.util.List;

import com.ganzhou.domain.SchoolNews;
import com.ganzhou.service.ISchoolNewsService;
import com.ganzhou.utils.AjaxResult;
import com.ganzhou.utils.page.TableDataInfo;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Controller
 * 
 * @author xiaoou
 * @date 2021-01-06
 */
@Controller
@RequestMapping("/system/news")
public class SchoolNewsController extends BaseController
{
    private String prefix = "system/news";

    @Autowired
    private ISchoolNewsService schoolNewsService;

    @GetMapping()
    public String news()
    {
        return prefix + "/news";
    }

    /**
     * 查询列表
     */
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(SchoolNews schoolNews) throws Exception {
        startPage();
        List<SchoolNews> list = schoolNewsService.selectSchoolNewsList(schoolNews);
        return getDataTable(list);
    }

    /**
     * 新增
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存
     */
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(SchoolNews schoolNews)
    {
        return toAjax(schoolNewsService.insertSchoolNews(schoolNews));
    }

    /**
     * 修改
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Integer id, ModelMap mmap)
    {
        SchoolNews schoolNews = schoolNewsService.selectSchoolNewsById(id);
        mmap.put("schoolNews", schoolNews);
        return prefix + "/edit";
    }

    /**
     * 修改保存
     */
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(SchoolNews schoolNews)
    {
        return toAjax(schoolNewsService.updateSchoolNews(schoolNews));
    }

    /**
     * 删除
     */
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(schoolNewsService.deleteSchoolNewsByIds(ids));
    }
}

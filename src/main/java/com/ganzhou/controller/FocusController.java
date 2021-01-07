package com.ganzhou.controller;

import java.util.List;

import com.ganzhou.domain.Focus;
import com.ganzhou.service.IFocusService;
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
@RequestMapping("/system/focus")
public class FocusController extends BaseController
{
    private String prefix = "system/focus";

    @Autowired
    private IFocusService focusService;

    @GetMapping()
    public String focus()
    {
        return prefix + "/focus";
    }

    /**
     * 查询列表
     */
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Focus focus) throws Exception {
        startPage();
        List<Focus> list = focusService.selectFocusList(focus);
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
    public AjaxResult addSave(Focus focus)
    {
        return toAjax(focusService.insertFocus(focus));
    }

    /**
     * 修改
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        Focus focus = focusService.selectFocusById(id);
        mmap.put("focus", focus);
        return prefix + "/edit";
    }

    /**
     * 修改保存
     */
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Focus focus)
    {
        return toAjax(focusService.updateFocus(focus));
    }

    /**
     * 删除
     */
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(focusService.deleteFocusByIds(ids));
    }
}

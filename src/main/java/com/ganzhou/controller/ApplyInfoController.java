package com.ganzhou.controller;

import java.util.List;

import com.ganzhou.domain.ApplyInfo;
import com.ganzhou.service.IApplyInfoService;
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
@RequestMapping("/system/info")
public class ApplyInfoController extends BaseController
{
    private String prefix = "system/info";

    @Autowired
    private IApplyInfoService applyInfoService;

    @GetMapping()
    public String info()
    {
        return prefix + "/info";
    }

    /**
     * 查询列表
     */
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(ApplyInfo applyInfo) throws Exception {
        startPage();
        List<ApplyInfo> list = applyInfoService.selectApplyInfoList(applyInfo);
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
    public AjaxResult addSave(ApplyInfo applyInfo)
    {
        return toAjax(applyInfoService.insertApplyInfo(applyInfo));
    }

    /**
     * 修改
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        ApplyInfo applyInfo = applyInfoService.selectApplyInfoById(id);
        mmap.put("applyInfo", applyInfo);
        return prefix + "/edit";
    }

    /**
     * 修改保存
     */
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(ApplyInfo applyInfo)
    {
        return toAjax(applyInfoService.updateApplyInfo(applyInfo));
    }

    /**
     * 删除
     */
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(applyInfoService.deleteApplyInfoByIds(ids));
    }
}

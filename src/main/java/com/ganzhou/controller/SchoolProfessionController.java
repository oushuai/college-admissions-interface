package com.ganzhou.controller;

import java.util.List;

import com.ganzhou.domain.SchoolProfession;
import com.ganzhou.service.ISchoolProfessionService;
import com.ganzhou.utils.AjaxResult;
import com.ganzhou.utils.page.TableDataInfo;
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
@RequestMapping("/system/profession")
public class SchoolProfessionController extends BaseController
{
    private String prefix = "system/profession";

    @Autowired
    private ISchoolProfessionService schoolProfessionService;

    @GetMapping()
    public String profession()
    {
        return prefix + "/profession";
    }

    /**
     * 查询列表
     */
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(SchoolProfession schoolProfession) throws Exception {
        startPage();
        List<SchoolProfession> list = schoolProfessionService.selectSchoolProfessionList(schoolProfession);
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
    public AjaxResult addSave(SchoolProfession schoolProfession)
    {
        return toAjax(schoolProfessionService.insertSchoolProfession(schoolProfession));
    }

    /**
     * 修改
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        SchoolProfession schoolProfession = schoolProfessionService.selectSchoolProfessionById(id);
        mmap.put("schoolProfession", schoolProfession);
        return prefix + "/edit";
    }

    /**
     * 修改保存
     */
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(SchoolProfession schoolProfession)
    {
        return toAjax(schoolProfessionService.updateSchoolProfession(schoolProfession));
    }

    /**
     * 删除
     */
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(schoolProfessionService.deleteSchoolProfessionByIds(ids));
    }
}

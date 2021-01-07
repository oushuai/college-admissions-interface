package com.ganzhou.controller;

import java.util.List;

import com.ganzhou.domain.Profession;
import com.ganzhou.service.IProfessionService;
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
public class ProfessionController extends BaseController
{
    private String prefix = "system/profession";

    @Autowired
    private IProfessionService professionService;

    @GetMapping()
    public String profession()
    {
        return prefix + "/profession";
    }

    /**
     * 查询列表
     */
    @ResponseBody
    public TableDataInfo list(Profession profession)
    {
        startPage();
        List<Profession> list = professionService.selectProfessionList(profession);
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
    public AjaxResult addSave(Profession profession)
    {
        return toAjax(professionService.insertProfession(profession));
    }

    /**
     * 修改
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        Profession profession = professionService.selectProfessionById(id);
        mmap.put("profession", profession);
        return prefix + "/edit";
    }

    /**
     * 修改保存
     */
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Profession profession)
    {
        return toAjax(professionService.updateProfession(profession));
    }

    /**
     * 删除
     */
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(professionService.deleteProfessionByIds(ids));
    }
}

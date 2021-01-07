package com.ganzhou.controller;

import java.util.List;

import com.ganzhou.domain.QuestionAnswer;
import com.ganzhou.service.IQuestionAnswerService;
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
@RequestMapping("/system/answer")
public class QuestionAnswerController extends BaseController
{
    private String prefix = "system/answer";

    @Autowired
    private IQuestionAnswerService questionAnswerService;

    @GetMapping()
    public String answer()
    {
        return prefix + "/answer";
    }

    /**
     * 查询列表
     */
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(QuestionAnswer questionAnswer) throws Exception {
        startPage();
        List<QuestionAnswer> list = questionAnswerService.selectQuestionAnswerList(questionAnswer);
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
    public AjaxResult addSave(QuestionAnswer questionAnswer)
    {
        return toAjax(questionAnswerService.insertQuestionAnswer(questionAnswer));
    }

    /**
     * 修改
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        QuestionAnswer questionAnswer = questionAnswerService.selectQuestionAnswerById(id);
        mmap.put("questionAnswer", questionAnswer);
        return prefix + "/edit";
    }

    /**
     * 修改保存
     */
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(QuestionAnswer questionAnswer)
    {
        return toAjax(questionAnswerService.updateQuestionAnswer(questionAnswer));
    }

    /**
     * 删除
     */
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(questionAnswerService.deleteQuestionAnswerByIds(ids));
    }
}

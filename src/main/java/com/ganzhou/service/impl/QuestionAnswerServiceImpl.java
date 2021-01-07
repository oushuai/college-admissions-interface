package com.ganzhou.service.impl;

import java.util.List;

import com.ganzhou.utils.text.Convert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ganzhou.mapper.QuestionAnswerMapper;
import com.ganzhou.domain.QuestionAnswer;
import com.ganzhou.service.IQuestionAnswerService;

/**
 * Service业务层处理
 * 
 * @author xiaoou
 * @date 2021-01-06
 */
@Service
public class QuestionAnswerServiceImpl implements IQuestionAnswerService 
{
    @Autowired
    private QuestionAnswerMapper questionAnswerMapper;

    /**
     * 查询
     * 
     * @param id ID
     * @return
     */
    @Override
    public QuestionAnswer selectQuestionAnswerById(Long id)
    {
        return questionAnswerMapper.selectQuestionAnswerById(id);
    }

    /**
     * 查询列表
     * 
     * @param questionAnswer
     * @return
     */
    @Override
    public List<QuestionAnswer> selectQuestionAnswerList(QuestionAnswer questionAnswer)
    {
        return questionAnswerMapper.selectQuestionAnswerList(questionAnswer);
    }

    /**
     * 新增
     * 
     * @param questionAnswer
     * @return 结果
     */
    @Override
    public int insertQuestionAnswer(QuestionAnswer questionAnswer)
    {
        return questionAnswerMapper.insertQuestionAnswer(questionAnswer);
    }

    /**
     * 修改
     * 
     * @param questionAnswer
     * @return 结果
     */
    @Override
    public int updateQuestionAnswer(QuestionAnswer questionAnswer)
    {
        return questionAnswerMapper.updateQuestionAnswer(questionAnswer);
    }

    /**
     * 删除对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteQuestionAnswerByIds(String ids)
    {
        return questionAnswerMapper.deleteQuestionAnswerByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除信息
     * 
     * @param id ID
     * @return 结果
     */
    @Override
    public int deleteQuestionAnswerById(Long id)
    {
        return questionAnswerMapper.deleteQuestionAnswerById(id);
    }
}

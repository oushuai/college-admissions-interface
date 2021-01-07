package com.ganzhou.mapper;

import java.util.List;
import com.ganzhou.domain.QuestionAnswer;

/**
 * Mapper接口
 * 
 * @author xiaoou
 * @date 2021-01-06
 */
public interface QuestionAnswerMapper 
{
    /**
     * 查询
     * 
     * @param id ID
     * @return
     */
    public QuestionAnswer selectQuestionAnswerById(Long id);

    /**
     * 查询列表
     * 
     * @param questionAnswer
     * @return 集合
     */
    public List<QuestionAnswer> selectQuestionAnswerList(QuestionAnswer questionAnswer);

    /**
     * 新增
     * 
     * @param questionAnswer
     * @return 结果
     */
    public int insertQuestionAnswer(QuestionAnswer questionAnswer);

    /**
     * 修改
     * 
     * @param questionAnswer
     * @return 结果
     */
    public int updateQuestionAnswer(QuestionAnswer questionAnswer);

    /**
     * 删除
     * 
     * @param id ID
     * @return 结果
     */
    public int deleteQuestionAnswerById(Long id);

    /**
     * 批量删除
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteQuestionAnswerByIds(String[] ids);
}

package com.ganzhou.service.impl;

import java.util.List;

import com.ganzhou.utils.text.Convert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ganzhou.mapper.SchoolNewsMapper;
import com.ganzhou.domain.SchoolNews;
import com.ganzhou.service.ISchoolNewsService;

/**
 * Service业务层处理
 * 
 * @author xiaoou
 * @date 2021-01-06
 */
@Service
public class SchoolNewsServiceImpl implements ISchoolNewsService 
{
    @Autowired
    private SchoolNewsMapper schoolNewsMapper;

    /**
     * 查询
     * 
     * @param id ID
     * @return
     */
    @Override
    public SchoolNews selectSchoolNewsById(Integer id)
    {
        return schoolNewsMapper.selectSchoolNewsById(id);
    }

    /**
     * 查询列表
     * 
     * @param schoolNews
     * @return
     */
    @Override
    public List<SchoolNews> selectSchoolNewsList(SchoolNews schoolNews)
    {
        return schoolNewsMapper.selectSchoolNewsList(schoolNews);
    }

    /**
     * 新增
     * 
     * @param schoolNews
     * @return 结果
     */
    @Override
    public int insertSchoolNews(SchoolNews schoolNews)
    {
        return schoolNewsMapper.insertSchoolNews(schoolNews);
    }

    /**
     * 修改
     * 
     * @param schoolNews
     * @return 结果
     */
    @Override
    public int updateSchoolNews(SchoolNews schoolNews)
    {
        return schoolNewsMapper.updateSchoolNews(schoolNews);
    }

    /**
     * 删除对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteSchoolNewsByIds(String ids)
    {
        return schoolNewsMapper.deleteSchoolNewsByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除信息
     * 
     * @param id ID
     * @return 结果
     */
    @Override
    public int deleteSchoolNewsById(Integer id)
    {
        return schoolNewsMapper.deleteSchoolNewsById(id);
    }
}

package com.ganzhou.service;

import java.util.List;
import com.ganzhou.domain.SchoolNews;

/**
 * Service接口
 * 
 * @author xiaoou
 * @date 2021-01-06
 */
public interface ISchoolNewsService 
{
    /**
     * 查询
     * 
     * @param id ID
     * @return
     */
    public SchoolNews selectSchoolNewsById(Integer id);

    /**
     * 查询列表
     * 
     * @param schoolNews
     * @return 集合
     */
    public List<SchoolNews> selectSchoolNewsList(SchoolNews schoolNews);

    /**
     * 新增
     * 
     * @param schoolNews
     * @return 结果
     */
    public int insertSchoolNews(SchoolNews schoolNews);

    /**
     * 修改
     * 
     * @param schoolNews
     * @return 结果
     */
    public int updateSchoolNews(SchoolNews schoolNews);

    /**
     * 批量删除
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteSchoolNewsByIds(String ids);

    /**
     * 删除信息
     * 
     * @param id ID
     * @return 结果
     */
    public int deleteSchoolNewsById(Integer id);
}

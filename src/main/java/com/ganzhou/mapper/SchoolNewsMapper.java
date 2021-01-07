package com.ganzhou.mapper;

import java.util.List;
import com.ganzhou.domain.SchoolNews;

/**
 * Mapper接口
 * 
 * @author xiaoou
 * @date 2021-01-06
 */
public interface SchoolNewsMapper 
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
     * 删除
     * 
     * @param id ID
     * @return 结果
     */
    public int deleteSchoolNewsById(Integer id);

    /**
     * 批量删除
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteSchoolNewsByIds(String[] ids);
}

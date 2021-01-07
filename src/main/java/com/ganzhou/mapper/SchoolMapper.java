package com.ganzhou.mapper;

import java.util.List;
import com.ganzhou.domain.School;

/**
 * Mapper接口
 * 
 * @author xiaoou
 * @date 2021-01-06
 */
public interface SchoolMapper 
{
    /**
     * 查询
     * 
     * @param id ID
     * @return
     */
    public School selectSchoolById(String id);

    /**
     * 查询列表
     * 
     * @param school
     * @return 集合
     */
    public List<School> selectSchoolList(School school);

    /**
     * 新增
     * 
     * @param school
     * @return 结果
     */
    public int insertSchool(School school);

    /**
     * 修改
     * 
     * @param school
     * @return 结果
     */
    public int updateSchool(School school);

    /**
     * 删除
     * 
     * @param id ID
     * @return 结果
     */
    public int deleteSchoolById(String id);

    /**
     * 批量删除
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteSchoolByIds(String[] ids);
}

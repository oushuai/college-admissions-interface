package com.ganzhou.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ganzhou.mapper.SchoolMapper;
import com.ganzhou.domain.School;
import com.ganzhou.service.ISchoolService;
import com.ruoyi.common.core.text.Convert;

/**
 * Service业务层处理
 * 
 * @author xiaoou
 * @date 2021-01-06
 */
@Service
public class SchoolServiceImpl implements ISchoolService 
{
    @Autowired
    private SchoolMapper schoolMapper;

    /**
     * 查询
     * 
     * @param id ID
     * @return
     */
    @Override
    public School selectSchoolById(String id)
    {
        return schoolMapper.selectSchoolById(id);
    }

    /**
     * 查询列表
     * 
     * @param school
     * @return
     */
    @Override
    public List<School> selectSchoolList(School school)
    {
        return schoolMapper.selectSchoolList(school);
    }

    /**
     * 新增
     * 
     * @param school
     * @return 结果
     */
    @Override
    public int insertSchool(School school)
    {
        return schoolMapper.insertSchool(school);
    }

    /**
     * 修改
     * 
     * @param school
     * @return 结果
     */
    @Override
    public int updateSchool(School school)
    {
        return schoolMapper.updateSchool(school);
    }

    /**
     * 删除对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteSchoolByIds(String ids)
    {
        return schoolMapper.deleteSchoolByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除信息
     * 
     * @param id ID
     * @return 结果
     */
    @Override
    public int deleteSchoolById(String id)
    {
        return schoolMapper.deleteSchoolById(id);
    }
}

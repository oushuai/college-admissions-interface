package com.ganzhou.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ganzhou.mapper.SchoolProfessionMapper;
import com.ganzhou.domain.SchoolProfession;
import com.ganzhou.service.ISchoolProfessionService;
import com.ruoyi.common.core.text.Convert;

/**
 * Service业务层处理
 * 
 * @author xiaoou
 * @date 2021-01-06
 */
@Service
public class SchoolProfessionServiceImpl implements ISchoolProfessionService 
{
    @Autowired
    private SchoolProfessionMapper schoolProfessionMapper;

    /**
     * 查询
     * 
     * @param id ID
     * @return
     */
    @Override
    public SchoolProfession selectSchoolProfessionById(Long id)
    {
        return schoolProfessionMapper.selectSchoolProfessionById(id);
    }

    /**
     * 查询列表
     * 
     * @param schoolProfession
     * @return
     */
    @Override
    public List<SchoolProfession> selectSchoolProfessionList(SchoolProfession schoolProfession)
    {
        return schoolProfessionMapper.selectSchoolProfessionList(schoolProfession);
    }

    /**
     * 新增
     * 
     * @param schoolProfession
     * @return 结果
     */
    @Override
    public int insertSchoolProfession(SchoolProfession schoolProfession)
    {
        return schoolProfessionMapper.insertSchoolProfession(schoolProfession);
    }

    /**
     * 修改
     * 
     * @param schoolProfession
     * @return 结果
     */
    @Override
    public int updateSchoolProfession(SchoolProfession schoolProfession)
    {
        return schoolProfessionMapper.updateSchoolProfession(schoolProfession);
    }

    /**
     * 删除对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteSchoolProfessionByIds(String ids)
    {
        return schoolProfessionMapper.deleteSchoolProfessionByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除信息
     * 
     * @param id ID
     * @return 结果
     */
    @Override
    public int deleteSchoolProfessionById(Long id)
    {
        return schoolProfessionMapper.deleteSchoolProfessionById(id);
    }
}

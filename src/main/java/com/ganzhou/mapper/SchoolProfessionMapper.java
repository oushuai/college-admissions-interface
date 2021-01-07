package com.ganzhou.mapper;

import java.util.List;
import com.ganzhou.domain.SchoolProfession;

/**
 * Mapper接口
 * 
 * @author xiaoou
 * @date 2021-01-06
 */
public interface SchoolProfessionMapper 
{
    /**
     * 查询
     * 
     * @param id ID
     * @return
     */
    public SchoolProfession selectSchoolProfessionById(Long id);

    /**
     * 查询列表
     * 
     * @param schoolProfession
     * @return 集合
     */
    public List<SchoolProfession> selectSchoolProfessionList(SchoolProfession schoolProfession);

    /**
     * 新增
     * 
     * @param schoolProfession
     * @return 结果
     */
    public int insertSchoolProfession(SchoolProfession schoolProfession);

    /**
     * 修改
     * 
     * @param schoolProfession
     * @return 结果
     */
    public int updateSchoolProfession(SchoolProfession schoolProfession);

    /**
     * 删除
     * 
     * @param id ID
     * @return 结果
     */
    public int deleteSchoolProfessionById(Long id);

    /**
     * 批量删除
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteSchoolProfessionByIds(String[] ids);
}

package com.ganzhou.service;

import java.util.List;
import com.ganzhou.domain.Profession;

/**
 * Service接口
 * 
 * @author xiaoou
 * @date 2021-01-06
 */
public interface IProfessionService 
{
    /**
     * 查询
     * 
     * @param id ID
     * @return
     */
    public Profession selectProfessionById(Long id);

    /**
     * 查询列表
     * 
     * @param profession
     * @return 集合
     */
    public List<Profession> selectProfessionList(Profession profession);

    /**
     * 新增
     * 
     * @param profession
     * @return 结果
     */
    public int insertProfession(Profession profession);

    /**
     * 修改
     * 
     * @param profession
     * @return 结果
     */
    public int updateProfession(Profession profession);

    /**
     * 批量删除
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteProfessionByIds(String ids);

    /**
     * 删除信息
     * 
     * @param id ID
     * @return 结果
     */
    public int deleteProfessionById(Long id);
}

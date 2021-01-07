package com.ganzhou.service.impl;

import java.util.List;

import com.ganzhou.utils.text.Convert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ganzhou.mapper.ProfessionMapper;
import com.ganzhou.domain.Profession;
import com.ganzhou.service.IProfessionService;

/**
 * Service业务层处理
 * 
 * @author xiaoou
 * @date 2021-01-06
 */
@Service
public class ProfessionServiceImpl implements IProfessionService 
{
    @Autowired
    private ProfessionMapper professionMapper;

    /**
     * 查询
     * 
     * @param id ID
     * @return
     */
    @Override
    public Profession selectProfessionById(Long id)
    {
        return professionMapper.selectProfessionById(id);
    }

    /**
     * 查询列表
     * 
     * @param profession
     * @return
     */
    @Override
    public List<Profession> selectProfessionList(Profession profession)
    {
        return professionMapper.selectProfessionList(profession);
    }

    /**
     * 新增
     * 
     * @param profession
     * @return 结果
     */
    @Override
    public int insertProfession(Profession profession)
    {
        return professionMapper.insertProfession(profession);
    }

    /**
     * 修改
     * 
     * @param profession
     * @return 结果
     */
    @Override
    public int updateProfession(Profession profession)
    {
        return professionMapper.updateProfession(profession);
    }

    /**
     * 删除对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteProfessionByIds(String ids)
    {
        return professionMapper.deleteProfessionByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除信息
     * 
     * @param id ID
     * @return 结果
     */
    @Override
    public int deleteProfessionById(Long id)
    {
        return professionMapper.deleteProfessionById(id);
    }
}

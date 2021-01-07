package com.ganzhou.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ganzhou.mapper.ApplyInfoMapper;
import com.ganzhou.domain.ApplyInfo;
import com.ganzhou.service.IApplyInfoService;
import com.ruoyi.common.core.text.Convert;

/**
 * Service业务层处理
 * 
 * @author xiaoou
 * @date 2021-01-06
 */
@Service
public class ApplyInfoServiceImpl implements IApplyInfoService 
{
    @Autowired
    private ApplyInfoMapper applyInfoMapper;

    /**
     * 查询
     * 
     * @param id ID
     * @return
     */
    @Override
    public ApplyInfo selectApplyInfoById(Long id)
    {
        return applyInfoMapper.selectApplyInfoById(id);
    }

    /**
     * 查询列表
     * 
     * @param applyInfo
     * @return
     */
    @Override
    public List<ApplyInfo> selectApplyInfoList(ApplyInfo applyInfo)
    {
        return applyInfoMapper.selectApplyInfoList(applyInfo);
    }

    /**
     * 新增
     * 
     * @param applyInfo
     * @return 结果
     */
    @Override
    public int insertApplyInfo(ApplyInfo applyInfo)
    {
        return applyInfoMapper.insertApplyInfo(applyInfo);
    }

    /**
     * 修改
     * 
     * @param applyInfo
     * @return 结果
     */
    @Override
    public int updateApplyInfo(ApplyInfo applyInfo)
    {
        return applyInfoMapper.updateApplyInfo(applyInfo);
    }

    /**
     * 删除对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteApplyInfoByIds(String ids)
    {
        return applyInfoMapper.deleteApplyInfoByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除信息
     * 
     * @param id ID
     * @return 结果
     */
    @Override
    public int deleteApplyInfoById(Long id)
    {
        return applyInfoMapper.deleteApplyInfoById(id);
    }
}

package com.ganzhou.mapper;

import com.ganzhou.domain.ApplyInfo;

import java.util.List;

/**
 * Mapper接口
 * 
 * @author xiaoou
 * @date 2021-01-06
 */
public interface ApplyInfoMapper 
{
    /**
     * 查询
     * 
     * @param id ID
     * @return
     */
    public ApplyInfo selectApplyInfoById(Long id);

    /**
     * 查询列表
     * 
     * @param applyInfo
     * @return 集合
     */
    public List<ApplyInfo> selectApplyInfoList(ApplyInfo applyInfo);

    /**
     * 新增
     * 
     * @param applyInfo
     * @return 结果
     */
    public int insertApplyInfo(ApplyInfo applyInfo);

    /**
     * 修改
     * 
     * @param applyInfo
     * @return 结果
     */
    public int updateApplyInfo(ApplyInfo applyInfo);

    /**
     * 删除
     * 
     * @param id ID
     * @return 结果
     */
    public int deleteApplyInfoById(Long id);

    /**
     * 批量删除
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteApplyInfoByIds(String[] ids);
}

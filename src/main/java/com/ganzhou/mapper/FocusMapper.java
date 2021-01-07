package com.ganzhou.mapper;

import com.ganzhou.domain.Focus;

import java.util.List;

/**
 * Mapper接口
 * 
 * @author xiaoou
 * @date 2021-01-06
 */
public interface FocusMapper 
{
    /**
     * 查询
     * 
     * @param id ID
     * @return
     */
    public Focus selectFocusById(Long id);

    /**
     * 查询列表
     * 
     * @param focus
     * @return 集合
     */
    public List<Focus> selectFocusList(Focus focus);

    /**
     * 新增
     * 
     * @param focus
     * @return 结果
     */
    public int insertFocus(Focus focus);

    /**
     * 修改
     * 
     * @param focus
     * @return 结果
     */
    public int updateFocus(Focus focus);

    /**
     * 删除
     * 
     * @param id ID
     * @return 结果
     */
    public int deleteFocusById(Long id);

    /**
     * 批量删除
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteFocusByIds(String[] ids);
}

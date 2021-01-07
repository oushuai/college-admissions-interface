package com.ganzhou.service;

import java.util.List;
import com.ganzhou.domain.Focus;

/**
 * Service接口
 * 
 * @author xiaoou
 * @date 2021-01-06
 */
public interface IFocusService 
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
     * 批量删除
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteFocusByIds(String ids);

    /**
     * 删除信息
     * 
     * @param id ID
     * @return 结果
     */
    public int deleteFocusById(Long id);
}

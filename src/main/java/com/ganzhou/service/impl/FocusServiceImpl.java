package com.ganzhou.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ganzhou.mapper.FocusMapper;
import com.ganzhou.domain.Focus;
import com.ganzhou.service.IFocusService;
import com.ruoyi.common.core.text.Convert;

/**
 * Service业务层处理
 * 
 * @author xiaoou
 * @date 2021-01-06
 */
@Service
public class FocusServiceImpl implements IFocusService 
{
    @Autowired
    private FocusMapper focusMapper;

    /**
     * 查询
     * 
     * @param id ID
     * @return
     */
    @Override
    public Focus selectFocusById(Long id)
    {
        return focusMapper.selectFocusById(id);
    }

    /**
     * 查询列表
     * 
     * @param focus
     * @return
     */
    @Override
    public List<Focus> selectFocusList(Focus focus)
    {
        return focusMapper.selectFocusList(focus);
    }

    /**
     * 新增
     * 
     * @param focus
     * @return 结果
     */
    @Override
    public int insertFocus(Focus focus)
    {
        return focusMapper.insertFocus(focus);
    }

    /**
     * 修改
     * 
     * @param focus
     * @return 结果
     */
    @Override
    public int updateFocus(Focus focus)
    {
        return focusMapper.updateFocus(focus);
    }

    /**
     * 删除对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteFocusByIds(String ids)
    {
        return focusMapper.deleteFocusByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除信息
     * 
     * @param id ID
     * @return 结果
     */
    @Override
    public int deleteFocusById(Long id)
    {
        return focusMapper.deleteFocusById(id);
    }
}

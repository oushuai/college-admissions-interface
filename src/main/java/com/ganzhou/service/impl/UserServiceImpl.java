package com.ganzhou.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ganzhou.mapper.UserMapper;
import com.ganzhou.domain.User;
import com.ganzhou.service.IUserService;
import com.ruoyi.common.core.text.Convert;

/**
 * Service业务层处理
 * 
 * @author xiaoou
 * @date 2021-01-06
 */
@Service
public class UserServiceImpl implements IUserService 
{
    @Autowired
    private UserMapper userMapper;

    /**
     * 查询
     * 
     * @param id ID
     * @return
     */
    @Override
    public User selectUserById(String id)
    {
        return userMapper.selectUserById(id);
    }

    /**
     * 查询列表
     * 
     * @param user
     * @return
     */
    @Override
    public List<User> selectUserList(User user)
    {
        return userMapper.selectUserList(user);
    }

    /**
     * 新增
     * 
     * @param user
     * @return 结果
     */
    @Override
    public int insertUser(User user)
    {
        return userMapper.insertUser(user);
    }

    /**
     * 修改
     * 
     * @param user
     * @return 结果
     */
    @Override
    public int updateUser(User user)
    {
        return userMapper.updateUser(user);
    }

    /**
     * 删除对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteUserByIds(String ids)
    {
        return userMapper.deleteUserByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除信息
     * 
     * @param id ID
     * @return 结果
     */
    @Override
    public int deleteUserById(String id)
    {
        return userMapper.deleteUserById(id);
    }
}

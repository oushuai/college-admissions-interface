package com.ganzhou.mapper;

import java.util.List;
import com.ganzhou.domain.User;

/**
 * Mapper接口
 * 
 * @author xiaoou
 * @date 2021-01-06
 */
public interface UserMapper 
{
    /**
     * 查询
     * 
     * @param id ID
     * @return
     */
    public User selectUserById(String id);

    /**
     * 查询列表
     * 
     * @param user
     * @return 集合
     */
    public List<User> selectUserList(User user);

    /**
     * 新增
     * 
     * @param user
     * @return 结果
     */
    public int insertUser(User user);

    /**
     * 修改
     * 
     * @param user
     * @return 结果
     */
    public int updateUser(User user);

    /**
     * 删除
     * 
     * @param id ID
     * @return 结果
     */
    public int deleteUserById(String id);

    /**
     * 批量删除
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteUserByIds(String[] ids);
}

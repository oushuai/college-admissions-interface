package com.ganzhou.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * 对象 user
 * 
 * @author xiaoou
 * @date 2021-01-06
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private String id;

    /** 用户名 */
    private String name;

    /** 密码 */
    private String password;

    /** 是否删除 */
    private Integer delFlag;

}

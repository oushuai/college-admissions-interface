package com.ganzhou.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * 对象 profession
 * 
 * @author xiaoou
 * @date 2021-01-06
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Profession
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 专业名称 */
    private String name;

    /** 专业类型 */
    private String type;

    /** 删除标志 */
    private Integer delFlag;

}

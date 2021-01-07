package com.ganzhou.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * 对象 focus
 * 
 * @author xiaoou
 * @date 2021-01-06
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Focus
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 3张轮播图片 */
    private String img;

    /** $column.columnComment */
    private Integer delFlag;

}

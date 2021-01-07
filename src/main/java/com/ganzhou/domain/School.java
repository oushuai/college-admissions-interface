package com.ganzhou.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 对象 school
 * 
 * @author xiaoou
 * @date 2021-01-06
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class School
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private String id;

    /** 学校名称 */
    private String name;

    /** 学校lego */
    private String lego;

    /** 学校封面图 */
    private String coverImg;

    /** 学校简介 */
    private String shortIntroduction;

    /** 学校详细介绍 */
    private String introduction;

    /** 排名 */
    private String order;

    /** 是否删除 */
    private Integer delFlag;

}

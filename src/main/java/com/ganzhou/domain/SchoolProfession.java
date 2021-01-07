package com.ganzhou.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 对象 school_profession
 * 
 * @author xiaoou
 * @date 2021-01-06
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SchoolProfession
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 学校id */
    private String schoolId;

    /** 专业id */
    private Long professionId;

    /** 年份 */
    private Integer year;

    /** 封面图 */
    private String coverImg;

    /** 介绍 */
    private String introduction;

}

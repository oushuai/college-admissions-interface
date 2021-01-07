package com.ganzhou.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 对象 apply_info
 * 
 * @author xiaoou
 * @date 2021-01-06
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApplyInfo
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** $column.columnComment */
    private String name;

    /** $column.columnComment */
    private Integer sex;

    /** $column.columnComment */
    private Long identifyCard;

    /** $column.columnComment */
    private Long phone;

    /** $column.columnComment */
    private String schoolId;

    /** $column.columnComment */
    private Long professionId;

    /** $column.columnComment */
    private Integer studentType;

    /** $column.columnComment */
    private String graduationSchool;

    /** 中考成绩 */
    private Integer midtermScore;

    /** $column.columnComment */
    private String comment;

    /** $column.columnComment */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date createDate;

}

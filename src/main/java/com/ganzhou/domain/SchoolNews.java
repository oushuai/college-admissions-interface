package com.ganzhou.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 对象 school_news
 * 
 * @author xiaoou
 * @date 2021-01-06
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SchoolNews
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** $column.columnComment */
    private String shcoolId;

    /** $column.columnComment */
    private String newsContent;

    /** $column.columnComment */
    private Integer delFlag;

    /** $column.columnComment */
    private Date createDate;

}

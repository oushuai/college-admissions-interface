package com.ganzhou.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 对象 question_answer
 * 
 * @author xiaoou
 * @date 2021-01-06
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class QuestionAnswer
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 问题或者答案 */
    private String qa;

    /** $column.columnComment */
    private String userId;

    /** $column.columnComment */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date createDate;

    /** $column.columnComment */
    private Integer delFlag;

    /** 0-问题，1-答案 */
    private Integer status;

}

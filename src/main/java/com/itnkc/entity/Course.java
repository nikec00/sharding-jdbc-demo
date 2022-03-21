package com.itnkc.entity;

import lombok.Data;
import lombok.ToString;

/**
 * @author nkc
 * @date 2022/3/21
 */
@Data
@ToString
public class Course {

    private Long cid;

    private String cname;

    private Long userId;

    private String cstatus;

}

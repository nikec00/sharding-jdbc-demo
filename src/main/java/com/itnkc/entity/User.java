package com.itnkc.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author nkc
 * @date 22/3/22
 */
@Data
@TableName(value = "t_user")
public class User {
    private Long userId;

    private String username;

    private String ustatus;
}

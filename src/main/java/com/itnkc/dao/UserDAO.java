package com.itnkc.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itnkc.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author nkc
 * @date 22/3/22
 */
@Mapper
public interface UserDAO extends BaseMapper<User> {
}

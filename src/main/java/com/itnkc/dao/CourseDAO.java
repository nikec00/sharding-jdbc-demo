package com.itnkc.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itnkc.entity.Course;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author nkc
 * @date 2022/3/21
 */
@Mapper
public interface CourseDAO extends BaseMapper<Course> {

}

package com.itnkc;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.itnkc.dao.CourseDAO;
import com.itnkc.entity.Course;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.WeakHashMap;

@SpringBootTest
public class ShardingJdbcDemoApplicationTests {

    @Autowired
    private CourseDAO courseDAO;

    @Test
    public void addCourse() {
        for (int i = 1; i <= 10; i++) {
            Course course = new Course();
            course.setCname("java" + i);
            course.setUserId(100L);
            course.setCstatus("Normal" + i);
            int insert = courseDAO.insert(course);
        }
    }

    @Test
    public void findCourse(){
        QueryWrapper<Course> wrapper = new QueryWrapper<>();
        wrapper.eq("cid",712782545846009857L);
        Course course = courseDAO.selectOne(wrapper);
        System.out.println(course);
    }

    @Test
    public void findAll(){
        List<Course> courses = courseDAO.selectList(new QueryWrapper<>());
        System.out.println(courses);
    }

    @Test
    public void addCourseDb(){
        Course course = new Course();
        course.setCname("javaDemo");
        course.setUserId(101L);
        course.setCstatus("Normal");
        int insert = courseDAO.insert(course);
    }

    @Test
    public void selectOne(){
        QueryWrapper<Course> wrapper = new QueryWrapper<>();
        wrapper.eq("cid",712791348788330497L);
        Course course = courseDAO.selectOne(wrapper);
        System.out.println(course);
    }
}

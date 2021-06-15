package cn.lngex.mapper;

import cn.lngex.Course;

public interface CourseMapper {

    Course loadByCourse(Long id);

    void update(Course course);

    void insert(Course course);
}

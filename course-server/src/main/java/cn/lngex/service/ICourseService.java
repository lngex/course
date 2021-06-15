package cn.lngex.service;

import cn.lngex.Course;
import cn.lngex.basic.Parameter;

public interface ICourseService {

    Course querById(Long id);

    void update(Course course);

    void save(Parameter parameter);
}

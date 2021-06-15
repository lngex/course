package cn.lngex.basic;

import cn.lngex.Course;

public class QueryCourseResult extends BuyCourseResult {
    private Course course;

    public Course getCourse() {
        return course;
    }

    public QueryCourseResult setCourse(Course course) {
        this.course = course;
        return this;
    }
}

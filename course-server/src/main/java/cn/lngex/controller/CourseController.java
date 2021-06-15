package cn.lngex.controller;

import cn.lngex.Course;
import cn.lngex.basic.BuyCourseResult;
import cn.lngex.basic.Parameter;
import cn.lngex.basic.QueryCourseResult;
import cn.lngex.service.ICourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/course")
public class CourseController {

    @Autowired
    private ICourseService courseService;

    /**
     * 根据id查询商品
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public QueryCourseResult queryById(@PathVariable("id") Long id){
        QueryCourseResult queryCourseResult = new QueryCourseResult().setCourse(courseService.querById(id));
        queryCourseResult.setMessage("");
        return queryCourseResult;
    }

    @PostMapping("/{id}")
    public Course buy(@PathVariable("id") Long id){
        Course course = courseService.querById(id);
        return course;
    }


    /**
     * 购买商品
     * @param course
     */
    @PostMapping("/buy")
    public void update(@RequestBody Course course){
        courseService.update(course);
    }

    /**
     * 添加商品
     * @param parameter
     */
    @PostMapping("/save")
    public BuyCourseResult save(@RequestBody Parameter parameter){
        BuyCourseResult buyCourseResult = new BuyCourseResult();
        try {
            courseService.save(parameter);
        } catch (Exception e) {
            e.printStackTrace();
            buyCourseResult.setMessage("保存失败").setSuccess(false);
        }
        return buyCourseResult;
    }
}

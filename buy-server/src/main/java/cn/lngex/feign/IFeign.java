package cn.lngex.feign;

import cn.lngex.Course;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(value = "COURSE-SERVER",fallbackFactory = FallbackFactorys.class)
public interface IFeign{

    @PostMapping("/course/{id}")
    Course buy(@PathVariable("id") Long id);

    @PostMapping("/course/buy")
    void update(Course course);

    @PostMapping("/course/save")
    void save(@RequestBody Course course);
}

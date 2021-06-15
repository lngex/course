package cn.lngex.service.impl;

import cn.lngex.BusinessExceptions;
import cn.lngex.Course;
import cn.lngex.basic.Parameter;
import cn.lngex.mapper.CourseMapper;
import cn.lngex.service.ICourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CourseServiceImpl implements ICourseService {

    @Autowired
    private CourseMapper courseMapper;

    /**
     * 查询门票
     * @param id
     * @return
     */
    @Override
    public Course querById(Long id) {
        return courseMapper.loadByCourse(id);
    }

    /**
     * 修改门票
     * @param course
     */
    @Override
    @Transactional
    public void update(Course course) {
        Course course1 = this.querById(course.getId());
        /* 判断门票 */
        if(course1.getSale_count()<course.getSale_count()) throw new BusinessExceptions("票数不足");
        /* 修改门票 */
        course1.setSale_count(course1.getSale_count()-course.getSale_count());
        courseMapper.update(course1);
    }

    /**
     * 添加新商品
     * @param parameter
     */
    @Override
    @Transactional
    public void save(Parameter parameter) {
        Course course = this.parameterToCourse(parameter);
        courseMapper.insert(course);
    }


    /**
     * 将参数转换为商品
     * @param parameter
     * @return
     */
    public Course parameterToCourse(Parameter parameter){
        Course course = new Course();
        course.setName(parameter.getName()).setPrice(parameter.getPrice()).setSale_count(parameter.getSale_number())
                .setStart_time(parameter.getStartTime()).setEnd_time(parameter.getEndTime());
        return course;
    }
}

package cn.lngex.feign;


import cn.lngex.BusinessExceptions;
import cn.lngex.Course;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * 托底数据
 */
@Component
public class FallbackFactorys implements FallbackFactory<IFeign> {
    @Override
    public IFeign create(Throwable throwable) {
        return new IFeign() {
            @Override
            public Course buy(Long id) {
                return new Course();
            }

            @Override
            public void update(Course course) {
                throw new BusinessExceptions("购买失败，书本不足");
            }

            @Override
            public void save(Course course) {
                throw new BusinessExceptions("添加失败");
            }
        };
    }
}

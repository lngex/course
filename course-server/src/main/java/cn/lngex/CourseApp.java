package cn.lngex;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@MapperScan("cn.lngex.mapper")
@EnableEurekaClient
public class CourseApp {
    public static void main(String[] args) {
        SpringApplication.run(CourseApp.class);
    }
}

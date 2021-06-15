package cn.lngex;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

public class Course implements Serializable {
    private Long id;
    private String name;
    private Integer price;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date start_time;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date end_time;
    private Integer sale_count;

    public Long getId() {
        return id;
    }

    public Course setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Course setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getPrice() {
        return price;
    }

    public Course setPrice(Integer price) {
        this.price = price;
        return this;
    }

    public Date getStart_time() {
        return start_time;
    }

    public Course setStart_time(Date start_time) {
        this.start_time = start_time;
        return this;
    }

    public Date getEnd_time() {
        return end_time;
    }

    public Course setEnd_time(Date end_time) {
        this.end_time = end_time;
        return this;
    }

    public Integer getSale_count() {
        return sale_count;
    }

    public Course setSale_count(Integer sale_count) {
        this.sale_count = sale_count;
        return this;
    }

    public Course() {
    }

    public Course(String name, Integer price, Date start_time, Date end_time, Integer sale_count) {
        this.name = name;
        this.price = price;
        this.start_time = start_time;
        this.end_time = end_time;
        this.sale_count = sale_count;
    }

    public Course(Long id, String name, Integer price, Date start_time, Date end_time, Integer sale_count) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.start_time = start_time;
        this.end_time = end_time;
        this.sale_count = sale_count;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", start_time=" + start_time +
                ", end_time=" + end_time +
                ", sale_count=" + sale_count +
                '}';
    }
}

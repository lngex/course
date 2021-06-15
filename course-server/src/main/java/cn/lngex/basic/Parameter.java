package cn.lngex.basic;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Parameter {
    private String name;
    private Integer price;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date startTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date endTime;
    private Integer sale_number;

    public String getName() {
        return name;
    }

    public Parameter setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getPrice() {
        return price;
    }

    public Parameter setPrice(Integer price) {
        this.price = price;
        return this;
    }

    public Date getStartTime() {
        return startTime;
    }

    public Parameter setStartTime(Date startTime) {
        this.startTime = startTime;
        return this;
    }

    public Date getEndTime() {
        return endTime;
    }

    public Parameter setEndTime(Date endTime) {
        this.endTime = endTime;
        return this;
    }

    public Integer getSale_number() {
        return sale_number;
    }

    public Parameter setSale_number(Integer sale_number) {
        this.sale_number = sale_number;
        return this;
    }
}

package cn.lngex;

import java.util.Date;

public class BuyLog {
    private Long id;
    private Long user_id;
    private Integer pay_price;
    private Date buy_time = new Date();
    private Integer buy_count;

    public Long getId() {
        return id;
    }

    public BuyLog setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getUser_id() {
        return user_id;
    }

    public BuyLog setUser_id(Long user_id) {
        this.user_id = user_id;
        return this;
    }

    public Integer getPay_price() {
        return pay_price;
    }

    public BuyLog setPay_price(Integer pay_price) {
        this.pay_price = pay_price;
        return this;
    }

    public Date getBuy_time() {
        return buy_time;
    }

    public BuyLog setBuy_time(Date buy_time) {
        this.buy_time = buy_time;
        return this;
    }

    public Integer getBuy_count() {
        return buy_count;
    }

    public BuyLog setBuy_count(Integer buy_count) {
        this.buy_count = buy_count;
        return this;
    }

    public BuyLog() {
    }

    public BuyLog(Long user_id, Integer pay_price, Date buy_time, Integer buy_count) {
        this.user_id = user_id;
        this.pay_price = pay_price;
        this.buy_time = buy_time;
        this.buy_count = buy_count;
    }

    public BuyLog(Long id, Long user_id, Integer pay_price, Date buy_time, Integer buy_count) {
        this.id = id;
        this.user_id = user_id;
        this.pay_price = pay_price;
        this.buy_time = buy_time;
        this.buy_count = buy_count;
    }
}

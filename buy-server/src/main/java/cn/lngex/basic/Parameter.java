package cn.lngex.basic;

public class Parameter {
    private Long userId;
    private Long courseId;
    private Integer buy_number;

    public Long getUserId() {
        return userId;
    }

    public Parameter setUserId(Long userId) {
        this.userId = userId;
        return this;
    }

    public Long getCourseId() {
        return courseId;
    }

    public Parameter setCourseId(Long courseId) {
        this.courseId = courseId;
        return this;
    }

    public Integer getBuy_number() {
        return buy_number;
    }

    public Parameter setBuy_number(Integer buy_number) {
        this.buy_number = buy_number;
        return this;
    }

    @Override
    public String toString() {
        return "Parameter{" +
                "userId=" + userId +
                ", courseId=" + courseId +
                ", buy_number=" + buy_number +
                '}';
    }
}

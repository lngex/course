package cn.lngex.basic;

public class BuyCourseResult {
    private Boolean success = true;
    private String message = "保存成功";

    public Boolean getSuccess() {
        return success;
    }

    public BuyCourseResult setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public BuyCourseResult setMessage(String message) {
        this.message = message;
        return this;
    }
}

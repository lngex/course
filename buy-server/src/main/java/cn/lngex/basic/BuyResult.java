package cn.lngex.basic;

public class BuyResult {
    private Boolean success = true;
    private String message = "购买成功";

    public Boolean getSuccess() {
        return success;
    }

    public BuyResult setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public BuyResult setMessage(String message) {
        this.message = message;
        return this;
    }
}

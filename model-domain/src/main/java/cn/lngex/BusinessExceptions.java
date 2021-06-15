package cn.lngex;

public class BusinessExceptions extends RuntimeException{
    public BusinessExceptions() {
    }

    public BusinessExceptions(String message) {
        super(message);
    }
}

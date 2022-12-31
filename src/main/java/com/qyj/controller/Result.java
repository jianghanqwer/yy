package com.qyj.controller;

public class Result {

    private Integer Code;
    private Object data;
    private String msg;

    public Result() {
    }

    public Result(Integer code, Object data) {
        Code = code;
        this.data = data;
    }

    public Result(Integer code, Object data, String msg) {
        Code = code;
        this.data = data;
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Integer getCode() {
        return Code;
    }

    public void setCode(Integer code) {
        Code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}

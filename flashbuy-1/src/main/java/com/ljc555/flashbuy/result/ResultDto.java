package com.ljc555.flashbuy.result;

import java.io.Serializable;

public class ResultDto<T> implements Serializable {
	public ResultDto(int code, String msg, T data) {
		super();
		this.code = code;
		this.msg = msg;
		Data = data;
	}
	private static final long serialVersionUID = 1L;
	
	private int code;
	private String msg;
	private T Data;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public T getData() {
		return Data;
	}
	public void setData(T data) {
		Data = data;
	}
	
	
}

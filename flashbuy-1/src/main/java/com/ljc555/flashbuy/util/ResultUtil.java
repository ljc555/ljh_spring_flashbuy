package com.ljc555.flashbuy.util;

import com.ljc555.flashbuy.constant.CodeConstant;
import com.ljc555.flashbuy.result.ResultDto;

/**
 * 
 * @ClassName ResultUtil
 * @Description 返回结果工具类
 * @author ljh
 * @Date 2018年4月2日 下午2:13:50
 * @version 1.0.0
 */
public class ResultUtil {
	
	/**
	 * 成功返回的格式
	 * @param <T>
	 * @param data
	 * @return
	 */
	public static <T> ResultDto<T> Success(T data) {
		return new ResultDto(CodeConstant.ResultCode.SUCCESS_CODE,
				CodeConstant.ResultMsg.SUCCESS_MSG,data);
	}
	
	/**
	 * 成功返回的格式
	 * @param <T>
	 * @param data
	 * @return
	 */
	public static <T> ResultDto<T> Success(String msg,T data) {
		return new ResultDto(CodeConstant.ResultCode.SUCCESS_CODE,
				msg,data);
	}
	
	/**
	 * 失败返回的格式
	 * @param <T>
	 * @param data
	 * @return
	 */
	public static <T> ResultDto<T> Error(String msg,T data) {
		return new ResultDto(CodeConstant.ResultCode.ERROR_CODE,
				msg,data);
	}

}

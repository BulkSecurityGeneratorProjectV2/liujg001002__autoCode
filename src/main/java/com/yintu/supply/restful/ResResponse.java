package com.yintu.supply.restful;

/**
 * @Description: 将结果转换为封装后的对象
 * @author kwah
 * @date 2018/4/19 09:45
 */
public class ResResponse {

	private final static String SUCCESS = "success";

	public static ResResult<String> ok() {
		return new ResResult<String>().setCode(ResCode.SUCCESS).setMsg(SUCCESS);
	}

	public static <T> ResResult<T> ok(T data) {
		return new ResResult<T>().setCode(ResCode.SUCCESS).setMsg(SUCCESS).setData(data);
	}

	public static <T> ResResult<T> makeErrRsp(String message) {
		return new ResResult<T>().setCode(ResCode.FAIL).setMsg(SUCCESS);
	}

	public static <T> ResResult<T> makeRsp(int code, String msg) {
		return new ResResult<T>().setCode(code).setMsg(msg);
	}
	
	public static <T> ResResult<T> makeRsp(int code, String msg, T data) {
		return new ResResult<T>().setCode(code).setMsg(msg).setData(data);
	}
}

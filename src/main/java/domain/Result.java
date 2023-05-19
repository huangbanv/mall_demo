package domain;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author 张钧
 * @Description
 * @create 2023-05-18 下午 06:06
 */
public class Result<T> implements Serializable {
	@Serial
	private static final long serialVersionUID = 1L;
	private static final Integer SUCCESS_CODE = 200;
	private static final String SUCCESS_MESSAGE = "成功";
	private static final Integer FAIL_CODE = 500;
	private static final String FAIL_MESSAGE = "失败";
	private Integer code;
	private String msg;
	private T data;

	public static <T> Result<T> ok() {
		return restResult(SUCCESS_CODE, SUCCESS_MESSAGE, null);
	}

	public static <T> Result<T> ok(String msg) {
		return restResult(SUCCESS_CODE, msg, null);
	}

	public static <T> Result<T> ok(String msg, T data) {
		return restResult(SUCCESS_CODE, msg, data);
	}

	public static <T> Result<T> success(T data) {
		return restResult(SUCCESS_CODE, "成功", data);
	}

	private static <T> Result<T> restResult(Integer code, String msg, T data) {
		Result<T> result = new Result<>();
		result.setCode(code);
		result.setMsg(msg);
		result.setData(data);
		return result;
	}

	public static <T> Result<T> error(int code, String msg) {
		return restResult(code, msg, null);
	}

	public static <T> Result<T> error(String msg) {
		return restResult(FAIL_CODE, msg, null);
	}

	public static <T> Result<T> error() {
		return restResult(FAIL_CODE, FAIL_MESSAGE, null);
	}

	public static <T> Result<T> error(String msg, T data) {
		return restResult(FAIL_CODE, msg, data);
	}

	public static <T> boolean isOk(Result<T> result) {
		return result.getCode().equals(SUCCESS_CODE);
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}

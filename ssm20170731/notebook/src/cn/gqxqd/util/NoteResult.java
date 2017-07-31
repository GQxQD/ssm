package cn.gqxqd.util;

public class NoteResult {
	// 成功
	// 失败
	private int status;// 0成功1失败
	private String msg;// 登录消息（失败，成功）
	private Object data;// 返回的数据

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

}

package cn.gqxqd.util;

import java.util.HashMap;

import net.sf.json.JSONObject;

public class JsonMsg {
	private HashMap<String, Object> result;

	public JsonMsg() {
		this.result = new HashMap<>();
	}

	public void setFlag(int flag) {
		this.result.put("flag", flag);
	}

	public void setMsg(Object msg) {
		this.result.put("msg", msg);
	}

	public String toString() {
		return JSONObject.fromObject(result).toString();
	}
}

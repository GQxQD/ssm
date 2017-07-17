package cn.gqxqd.printer;

import cn.gqxqd.ink.Ink;
import cn.gqxqd.paper.Paper;

public class Printer {
	private Ink ink;
	private Paper paper;

	public void print(String content) {
		System.out.println("--开始打印--");
		System.out.println("您使用了" + ink.getInkColor() + "墨水，"
				+ paper.getPaperType() + "纸张打印了\n[" + content + "]");
		System.out.println("--结束打印--");
	}
	
	public void println(String content){
		this.print(content);
		System.out.println();
	}

	public Ink getInk() {
		return ink;
	}

	public void setInk(Ink ink) {
		this.ink = ink;
	}

	public Paper getPaper() {
		return paper;
	}

	public void setPaper(Paper paper) {
		this.paper = paper;
	}

}

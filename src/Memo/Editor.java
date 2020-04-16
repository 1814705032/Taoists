package Memo;

import java.util.ArrayList;
import java.util.List;

public class Editor {
	private Doc doc;
	private List<History> historyRecords;
	private int historyPosition = -1;
	
	public Editor(Doc doc) {
		System.out.println("<<<打开文档"+doc.getTitle());
		this.doc = doc;
		historyRecords = new ArrayList<>();
		backup();// 保存一份历史记录
		show();
	}
	
	public void append(String txt) {
		System.out.println("<<<插入操作");
		doc.setBody(doc.getBody()+txt);
		show();
	}
	
	public void save() {
		System.out.println("<<<存盘操作");
	}
	
	public void delete() {
		System.out.println("<<<删除操作");
		doc.setBody("");
		backup();//操作完成后保存历史记录
		show();
	}
	
	private void backup() {
		historyRecords.add(doc.createHistory());
		historyPosition++;
	} 
	
	private void show() {
		System.out.println(doc.getBody());
		System.out.println("文章结束>>>\n");
	}
	
	public void undo() {
		System.out.println(">>>撤销操作");
		if(historyPosition==0) {
			return;
		}
		historyPosition--;
		History history = historyRecords.get(historyPosition);
		doc.restoreHistory(history);
		show();
	}
}

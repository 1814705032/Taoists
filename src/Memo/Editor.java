package Memo;

import java.util.ArrayList;
import java.util.List;

public class Editor {
	private Doc doc;
	private List<History> historyRecords;
	private int historyPosition = -1;
	
	public Editor(Doc doc) {
		System.out.println("<<<���ĵ�"+doc.getTitle());
		this.doc = doc;
		historyRecords = new ArrayList<>();
		backup();// ����һ����ʷ��¼
		show();
	}
	
	public void append(String txt) {
		System.out.println("<<<�������");
		doc.setBody(doc.getBody()+txt);
		show();
	}
	
	public void save() {
		System.out.println("<<<���̲���");
	}
	
	public void delete() {
		System.out.println("<<<ɾ������");
		doc.setBody("");
		backup();//������ɺ󱣴���ʷ��¼
		show();
	}
	
	private void backup() {
		historyRecords.add(doc.createHistory());
		historyPosition++;
	} 
	
	private void show() {
		System.out.println(doc.getBody());
		System.out.println("���½���>>>\n");
	}
	
	public void undo() {
		System.out.println(">>>��������");
		if(historyPosition==0) {
			return;
		}
		historyPosition--;
		History history = historyRecords.get(historyPosition);
		doc.restoreHistory(history);
		show();
	}
}

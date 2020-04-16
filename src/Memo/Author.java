package Memo;

public class Author {
	public static void main(String[] args){
		Editor editor = new Editor(new Doc("《水下中国》"));
		editor.append("第一章 水下古城");
		editor.append("\n  正文2000字……");
		editor.append("第二章 古今沉船\n  正文3000字……");
		
		editor.delete();
		editor.undo();
	}
}

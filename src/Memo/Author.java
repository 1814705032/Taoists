package Memo;

public class Author {
	public static void main(String[] args){
		Editor editor = new Editor(new Doc("��ˮ���й���"));
		editor.append("��һ�� ˮ�¹ų�");
		editor.append("\n  ����2000�֡���");
		editor.append("�ڶ��� �Ž����\n  ����3000�֡���");
		
		editor.delete();
		editor.undo();
	}
}

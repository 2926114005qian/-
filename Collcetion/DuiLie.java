package Collection;

import java.util.LinkedList;

public class DuiLie {
	private LinkedList link;
	public DuiLie(){
		link=new LinkedList();
	}
	//��ӷ���
	public void myAdd(Object obj) {
		link.addLast(obj);
		//��ջ link.addFirst();
	}
	//��ȡ����
	public Object myGet() {
		return link.removeFirst();
	}
	//�ж��Ƿ�Ϊ��
	public boolean isNull() {
		return link.isEmpty();
	}
}

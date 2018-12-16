package Collection;

import java.util.LinkedList;

public class DuiLie {
	private LinkedList link;
	public DuiLie(){
		link=new LinkedList();
	}
	//添加方法
	public void myAdd(Object obj) {
		link.addLast(obj);
		//堆栈 link.addFirst();
	}
	//获取方法
	public Object myGet() {
		return link.removeFirst();
	}
	//判断是否为空
	public boolean isNull() {
		return link.isEmpty();
	}
}

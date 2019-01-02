package Generic;
//∑∫–Õ¿‡
public class Tool<QQ> {
	public QQ getQ() {
		return q;
	}

	public void setQ(QQ q) {
		this.q = q;
	}
	public void show(QQ str) {
		System.out.println("show:"+str);
	}
	public<w> void print(w str) {
		System.out.println("print:"+str);
	}
	public static <w> void method(w str) {
		System.out.println("method:"+str);
	}
	private QQ q;
}

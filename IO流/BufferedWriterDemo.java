package IO��;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo  {

	public static void main(String[] args) throws IOException  {
//		����һ���ַ�д������
		FileWriter fw=new FileWriter("buff.txt");
//		����һ����������������������ַ�����
		BufferedWriter bufw=new BufferedWriter(fw);
//		�û�������д�룬ˢ�µȷ�����
		bufw.write("aaaaa");
		bufw.flush();
		bufw.close();
	}

}

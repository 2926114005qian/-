package IO��;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//��c�̵�һ���ļ����Ƶ�e�̡�
public class CopyTxtTest {

	public static void main(String[] args) throws IOException {
//		1.����һ����ȡ��������һ���Ѵ��ڵ��ļ���
		FileReader fr=new FileReader("demo.txt");
//		2.����һ��Ŀ�ġ��洢д����ļ���
		FileWriter fw=new FileWriter("demo1.txt");
//		3.Ƶ���Ķ�д������
		int ch=0;
		while((ch=fr.read())!=-1) {
			fw.write(ch);
		}
//		4.�ر���Դ��
		fr.close();
		fw.close();
	}

}

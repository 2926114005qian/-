package IO��;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReaderDemo {

	public static void main(String[] args) throws IOException {
//		����һ���ַ�������������ַ���������������
		FileReader fr=new FileReader("demo.txt");
		MyBufferedReader bufr=new MyBufferedReader(fr);
//		����һ���ַ������������ַ��������������
		FileWriter fw=new FileWriter("buff.txt");
		BufferedWriter bufw=new BufferedWriter(fw);
//		����һ�в��� �����ַ��� 
		String line=null;
		while ((line=bufr.myReadLine())!=null) {
//			System.out.println(line);
			bufw.write(line);
			bufw.newLine();
			bufw.flush();
		}
	}

}

package IO��;


import java.io.FileReader;
import java.io.IOException;

//���󣻶�ȡһ���ļ�������ȡ�������ִ�ӡ������̨��
public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
//		1������һ����ȡ������
//		ע��������ȡ������ʱ��������ȷ��ȡ���ļ����Ҹ��ļ�������ڡ�
		FileReader fr=new FileReader("demo.txt");
//		��ȡ��ʽһ��ȡһ����һ����
		/*int num=0;
		while ((num=fr.read())!=-1) {
			System.out.println((char)(num));}*/
//		��ȡ��ʽ����ȡһ�����һ���á�
		int num=0;
		char[] buf=new char[3];
		while ((num=fr.read(buf))!=-1) {
			System.out.println(new String(buf,0,num));
		}
		fr.close();
	}

}

package IO��;

import java.io.FileWriter;
import java.io.IOException;
//���󣻽�һЩ���ִ洢��Ӳ�̵�һ���ļ��С�
public class FileWriterDemo {

	private static final String LINE_SEPARATOR = System.getProperty("line.separator");

	public static void main(String[] args) throws IOException {
		/*
		 * ��������ʱ��������ȷ�ļ���
		 * ���û�и��ļ�������Զ�����������У���Ḳ�ǡ�
		 * ����ڹ��캯���м���true���Զ��ļ�������д��
		 * */
		FileWriter fw=new FileWriter("demo.txt",true);
		/*д���������ݣ�����ʱ�����Ǵ洢����ʱ�������С�
		 * */
//		fw.write("asXCVd"+LINE_SEPARATOR+"ghdf");
		fw.write("xxx");
		/*ˢ�����ݡ�����ʱ�������е�����д��Ŀ�ĵء�
		 * */
//		fw.flush();
		/*�ر������ر���Դ���ڹر�ǰ���Զ�����һ��flush()����ˢ�¡�
		 * */
		fw.close();
		
	}

}

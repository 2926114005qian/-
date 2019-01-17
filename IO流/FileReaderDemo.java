package IO流;


import java.io.FileReader;
import java.io.IOException;

//需求；读取一个文件，将读取到的文字打印到控制台。
public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
//		1；创建一个读取流对象。
//		注；创建读取流对象时，必须明确读取的文件，且该文件必须存在。
		FileReader fr=new FileReader("demo.txt");
//		读取方式一；取一个用一个。
		/*int num=0;
		while ((num=fr.read())!=-1) {
			System.out.println((char)(num));}*/
//		读取方式二；取一个存成一堆用。
		int num=0;
		char[] buf=new char[3];
		while ((num=fr.read(buf))!=-1) {
			System.out.println(new String(buf,0,num));
		}
		fr.close();
	}

}

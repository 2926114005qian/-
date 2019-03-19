package IO流;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReaderDemo {

	public static void main(String[] args) throws IOException {
//		创建一个字符输入流对象和字符输入流缓冲区。
		FileReader fr=new FileReader("demo.txt");
		MyBufferedReader bufr=new MyBufferedReader(fr);
//		创建一个字符输出流对象和字符输出流缓冲区。
		FileWriter fw=new FileWriter("buff.txt");
		BufferedWriter bufw=new BufferedWriter(fw);
//		创建一行参数 返回字符串 
		String line=null;
		while ((line=bufr.myReadLine())!=null) {
//			System.out.println(line);
			bufw.write(line);
			bufw.newLine();
			bufw.flush();
		}
	}

}

package IO流;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//将c盘的一个文件复制到e盘。
public class CopyTxtTest {

	public static void main(String[] args) throws IOException {
//		1.创建一个读取流，关联一个已存在的文件。
		FileReader fr=new FileReader("demo.txt");
//		2.创建一个目的。存储写入的文件。
		FileWriter fw=new FileWriter("demo1.txt");
//		3.频繁的读写操作。
		int ch=0;
		while((ch=fr.read())!=-1) {
			fw.write(ch);
		}
//		4.关闭资源。
		fr.close();
		fw.close();
	}

}

package IO流;

import java.io.FileWriter;
import java.io.IOException;
//需求；将一些文字存储到硬盘的一个文件中。
public class FileWriterDemo {

	private static final String LINE_SEPARATOR = System.getProperty("line.separator");

	public static void main(String[] args) throws IOException {
		/*
		 * 创建对象时，必须明确文件。
		 * 如果没有该文件，则会自动创建，如果有，则会覆盖。
		 * 如果在构造函数中加入true可以对文件进行续写。
		 * */
		FileWriter fw=new FileWriter("demo.txt",true);
		/*写入文字数据，但此时数据是存储在临时缓冲区中。
		 * */
//		fw.write("asXCVd"+LINE_SEPARATOR+"ghdf");
		fw.write("xxx");
		/*刷新数据。将临时缓冲区中的数据写入目的地。
		 * */
//		fw.flush();
		/*关闭流，关闭资源。在关闭前会自动调用一次flush()进行刷新。
		 * */
		fw.close();
		
	}

}

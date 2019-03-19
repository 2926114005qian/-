package IO流;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo  {

	public static void main(String[] args) throws IOException  {
//		创建一个字符写入流。
		FileWriter fw=new FileWriter("buff.txt");
//		创建一个缓冲区并关联被缓冲的字符流。
		BufferedWriter bufw=new BufferedWriter(fw);
//		用缓冲区的写入，刷新等方法。
		bufw.write("aaaaa");
		bufw.flush();
		bufw.close();
	}

}

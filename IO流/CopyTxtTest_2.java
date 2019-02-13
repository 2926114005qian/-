package IOÁ÷;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyTxtTest_2 {

	public static void main(String[] args) {
		FileReader fr=null;
		FileWriter fw=null;
		try {
			fr=new FileReader("demo.txt");
			fw=new FileWriter("demo_2.txt");
			char[] buf=new char[1024];
			int ch=0;
			while((ch=fr.read(buf))!=-1) {
				fw.write(buf, 0, ch);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			if (fr!=null) {
				try {
					fr.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			}
			if(fw!=null) {
				try {
					fw.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			}
		}
	}

}

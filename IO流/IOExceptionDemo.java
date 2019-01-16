package IOÁ÷;

import java.io.FileWriter;
import java.io.IOException;

public class IOExceptionDemo {

	public static void main(String[] args)  {
		FileWriter fw=null;
		try {
			fw=new FileWriter("demo1.txt");
			fw.write("asdfghjkl");
		} catch (IOException e) {
			
			e.printStackTrace();
		}finally {
			if (fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			}
			
		}
		
	}

}

package ∆‰À˚API;

import java.io.IOException;

public class RuntimeDemo {

	public static void main(String[] args) {
		Runtime r=Runtime.getRuntime();
		try {
			r.exec("notepad.exe");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}

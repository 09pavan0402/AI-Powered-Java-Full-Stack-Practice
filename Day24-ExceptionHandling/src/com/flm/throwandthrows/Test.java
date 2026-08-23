package com.flm.throwandthrows;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test {

	public static void main(String[] args) {
		try {
			Test.readFile();
		}
		catch (FileNotFoundException ex) {
			System.out.println("File not Found");
		}
	}
	static void readFile() throws FileNotFoundException{
		File file=new File("D:\\hii.txt");
		FileInputStream fis = new FileInputStream(file);
	}
}

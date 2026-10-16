package com.flm.filehandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharecterStream {

	public static void main(String[] args) {
		write();
		read();
	}
	public static void write() {
		File file=new File("D://File/hii2.txt");
		try {
			FileWriter fw=new FileWriter(file);
			fw.write("Hii how are you..");
			fw.close();
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
	public static void read() {
		File file=new File("D://File/hii.txt");
		try {
			FileReader fw=new FileReader(file);
			int temp;
			while((temp= fw.read())!=-1) {
				System.out.print((char)temp);
			}
			fw.close();
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}

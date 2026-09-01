package com.flm.filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadingFile {

	public static void main(String[] args) {
		//byte stream
		File file=new File("D:\\File/hii.txt");
		FileInputStream fis=null;
		try {
			fis=new FileInputStream(file);
			int temp;
			while((temp= fis.read())!=-1) {
				System.out.print((char)temp);
			}
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
		finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

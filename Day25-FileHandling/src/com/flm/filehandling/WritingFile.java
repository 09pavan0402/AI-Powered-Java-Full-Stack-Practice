package com.flm.filehandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WritingFile {

	public static void main(String[] args) {
		File file=new File("D://File/hii.txt");
		FileOutputStream fos=null;
		try {
			fos=new FileOutputStream(file);
			String data="My name is pavan..";
			fos.write(data.getBytes());
			System.out.println("successfully writen into file");
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
		finally {
			try {
				fos.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}

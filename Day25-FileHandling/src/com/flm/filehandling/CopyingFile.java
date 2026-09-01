package com.flm.filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyingFile {

	public static void main(String[] args) {
		File file=new File("D://File/hii.txt");
		File file2=new File("D://File/file.txt");
		FileInputStream fis=null;
		FileOutputStream fos=null;
		try {
			fis=new FileInputStream(file);
			fos=new FileOutputStream(file2);
			int temp=0;
			while((temp=fis.read())!=-1) {
				fos.write(temp);
			}
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
		finally {
			try {
				fis.close();
				fos.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}

}

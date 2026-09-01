package com.flm.filehandling;

import java.io.File;
import java.io.IOException;

public class FileCreation {
	public static void main(String[] args){
		File file=new File("D:\\File/hii.txt");
		try {
			file.createNewFile();
			System.out.println("created new file");
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}

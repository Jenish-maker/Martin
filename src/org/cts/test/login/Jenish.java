package org.cts.test.login;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Jenish {
	public static void main(String[] args) throws IOException {
	File f=new File("G:\\Screenshots\\Jenish\\Text\\java.txt");
	boolean b = f.mkdir();
	System.out.println(b);
	boolean t = f.createNewFile();
	System.out.println(t);
	FileUtils.write(f, "java");
	
	}
}

package org.cts.test.login;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Sample {
public static void main(String[] args) throws IOException {
	File f=new File("G:\\videos\\Jenish\\Inheritance.txt");

	FileUtils.write(f, "I am Jenish");
	System.out.println("done");
	
}
}

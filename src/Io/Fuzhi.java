package Io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class Fuzhi {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File file=new File("D:/eclipse-64.zip");
		InputStream is=new FileInputStream(file);
		byte[] a=new byte[(int) file.length()];
		is.read(a);
		
		File file2=new File("D:/fuzhi.zip");
		System.out.println(file2.createNewFile());
		OutputStream os=new FileOutputStream(file2,true);
		os.write(a);
		System.out.println("–¥»ÎÕÍ≥…");
	}

}

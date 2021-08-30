package org;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileBuffer {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader=new BufferedReader(new FileReader("/Users/yossry/eclipse-workspace/ReadFromFile/input.txt"));
		String data;
		
		while((data=bufferedReader.readLine())!=null) {
			System.out.println(data);
		}

	}

}

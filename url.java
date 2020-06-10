package com.cg.seleniumTests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class url {


	public static void main(String[] args) {
		  String command = "‪C://Users/yashass/Documents/hello.sh";

	        try {
	                Process process = Runtime.getRuntime().exec(command);

	                BufferedReader reader = new BufferedReader(
	                        new InputStreamReader(process.getInputStream()));
	                String line;
	                while ((line = reader.readLine()) != null) {
	                    System.out.println(line + "\n");
	                }

	                reader.close();

	            }
	        catch (IOException e) {
	            e.printStackTrace();
	        }

	}
}

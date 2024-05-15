package com.chainsys.pricing;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class ReadWriteMethods implements FileReadWriteOperations{
	

	public void write(String userName, String password) {

		try {
			FileWriter write = new FileWriter("D:\\Files\\demo.txt",true);			
			String str = userName + " " + password+"\n";		
			write.write(str);
			write.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
public  boolean read(String userName, String password) {
		try {
			FileReader read = new FileReader("D:\\Files\\demo.txt");
			
			Scanner scanner = new Scanner(read);
			
			while(scanner.hasNextLine())
			{
				String data = scanner.nextLine();
				String[] dataArray = data.split(" ");
				
				if(dataArray[0].equals(userName) && dataArray[1].equals(password))
				{
					return true;
				}
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}
}

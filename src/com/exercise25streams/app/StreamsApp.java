package com.exercise25streams.app;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class StreamsApp 
{

	public static void main(String[] args) 
	{
		File myFile = null;
		FileReader myReader= null;
		BufferedReader myBuffer= null;
		String line;
		
		
		try {
			myFile = new File("D:\\A\\hola.txt");
			myReader= new FileReader (myFile);
			myBuffer = new BufferedReader(myReader);
			line=myBuffer.readLine();
			//System.out.println(line);
			
			while((line= myBuffer.readLine())!=null)
			{
				System.out.println(line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try
			{
				myBuffer.close();
				myReader=null;
				myFile=null;
			}catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

}

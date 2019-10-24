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
			//System.out.println(line);					imprime solo la primera linea
			
			while((line= myBuffer.readLine())!=null)	//ciclo para mostrar todo el texto
			{
				line.toUpperCase();						//las convierte en mayusculas
				line =line.replace("O", "W");			//remplaza las o por las u.
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

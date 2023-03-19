package com.example.demo;


import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;    
public class Accessingafile
{  
public static void main(String[] args) throws IOException
{  
	try  
	{   
	File file = new File("C:\\Users\\prasanna_mule\\Desktop\\sample.csv");  
	if(!Desktop.isDesktopSupported())
	{  
	System.out.println("not supported");  
	return;  
	}  
	Desktop desktop = Desktop.getDesktop();  
	if(file.exists())         
	desktop.open(file);             
	}  
	catch(Exception e)  
	{  
	e.printStackTrace();  
	}  

	try  
	{  
	
	
	File file=new File("C:\\Users\\prasanna_mule\\Desktop\\sample.csv");  
	FileInputStream fis=new FileInputStream(file);    
	System.out.println("file content: ");  
	int r=0;  
	while((r=fis.read())!=-1)  
	{  
	System.out.print((char)r);     
	}  
	}  
	catch(Exception e)  
	{  
	e.printStackTrace();  
	}

	
	String filePath = "C:\\Users\\prasanna_mule\\Desktop\\sample.csv";
	String zipPath = "C:\\Users\\prasanna_mule\\Desktop\\zipfile\\sample.zip";


	try (ZipOutputStream zipOut = new ZipOutputStream(new FileOutputStream(zipPath))) {
	   File fileToZip = new File(filePath);
	   zipOut.putNextEntry(new ZipEntry(fileToZip.getName()));
	   Files.copy(fileToZip.toPath(), zipOut);
	}

}

}

        
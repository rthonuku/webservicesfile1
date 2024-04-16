package com.example.springboot.webservicesfile1.service;
import  com.example.springboot.webservicesfile1.entity.Entity;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class EntityServiceImpl implements EntityService {

	@Override
	public void read() {
		File file = new File("C:\\Users\\praky\\OneDrive\\Desktop\\Spring Projects\\webservice.txt");
		Entity entity = new Entity();

		try {
			//FileReader is used to read the stream of characters in Java
			FileReader filereader = new FileReader(file);
			//BufferedReader is used to read the text from character-input stream
			BufferedReader bufferedreader = new BufferedReader(filereader);
			String line = bufferedreader.readLine();
			int lineNumber=1;
			while(line !=null)
			{
				//Assuming each line contains a property value sepereated 
				String[] parts = line.split(",");
				//check if enough parts are available
				if(parts.length>=3) {
					int property1 = Integer.parseInt(parts[0]);
					String property2 = parts[1].trim();
					double property3 = Double.parseDouble(parts[0].trim());
					
					//set the properties using setter methods
					entity.setId(property1);
					entity.setProduct(property2);
					entity.setPrice(property3);
					System.out.println(entity);
				}
				else 
				{
					System.out.println("Invalid data format on line");
				}
				lineNumber++;
				
			}
			bufferedreader.close();
		}
	
		
		catch(Exception E)
		{
			E.printStackTrace();
			System.out.println(E);
		}
		
			
		
		
		
		
	                  }

}

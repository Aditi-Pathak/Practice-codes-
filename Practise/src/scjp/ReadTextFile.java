package scjp;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadTextFile {
	public static void main(String[] args)
	{	
		try(BufferedReader br = new BufferedReader(new FileReader("D:\\Users\\Pathak's\\Desktop\\dvdinfo.txt"))) 
		{
		    StringBuilder sb = new StringBuilder();
		    String line = br.readLine();

		    while (line != null) {
		        sb.append(line);
		        sb.append(System.lineSeparator());
		        line = br.readLine();
		    }
		    String everything = sb.toString();
		    System.out.println(everything);
		    String[] split=everything.split("/");
			for (int i= 0; i<split.length; i++){
				  System.out.println(i + split[i]);
				  
				  }
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}

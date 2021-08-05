package interview;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class ReadTxtFile {

	public static void main(String[] args) throws FileNotFoundException {
		
		File file = new File("E:/Shafi.txt");
		
		try 
		{
			FileReader fileReader= new FileReader(file);
			int a;
			char ch[]= new char[34];
			int count=0;
			
			while((a=fileReader.read()) != -1)
			{
//				System.out.println((char) fileReader.read());
				System.out.print((char)a);
				ch[count]=(char)a;
				count++;
			}
			System.out.println();
			String stmt=new String(ch);
			System.out.println("-----------"+stmt);
			
			String arr[]= stmt.split(" ");
			
			List<String> list=Arrays.asList(arr);
			
			HashMap<String,Integer> map = new HashMap<>();
			
			for(String s:list)
			{
				Integer index=map.get(s);
				System.out.println("---index----"+index);
				if(index==null)
					map.put(s,1);
				else{
					index++; // Important Line is here
					map.put(s,index);
				}
					
			}
			System.out.println("---Fila Values--"+map);
			
		}
		catch (IOException e)
		{
			e.printStackTrace();
		} 

	}
	
	
	/*Algorithm
	 * In order to read file, FileReader class has to be used,  just pass the File object e.g  FileReader FileReader= new FileReader(file);
	 * FileReader class has method called read()
	 * while((a=fileReader.read()) != -1) is a core logic
	 * ch[count]=(char)a;  this is how array of character is being prepared
	 * 
	 * 
	 * */

}

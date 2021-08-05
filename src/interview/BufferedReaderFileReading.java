package interview;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderFileReading {

	public static void main(String[] args) {
		
		
		File file = new File("E:/Shafi.txt");
		
		String arr[]= new String[50];
		int i=0;
		
		try {
			
			BufferedReader br = new BufferedReader(new FileReader(file));
			String s=null;
			String s1=null;
			int j=0;
			try {
				while((s=br.readLine())!=null){
					
					if(j==0){
						s1=s;
						j++;
						System.out.println("String---"+s1);
					}
					
					arr[i]=s;
					i++;
					
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	   System.out.println();
//	   System.out.println("String---"+s);
//	   for(String sab:arr)
//		   System.out.println(sab);
		
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

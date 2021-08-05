package interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayIntoArrayList {

	public static void main(String[] args) {
		
//		How to create number array directly
		int number[]={1,2,3,4,5,6,7,8};
		
		
//--------- Convert Array into List-----------------------------------------------
	   String cricketer[]= {"Sachin","Dravid","Rahul","Yuvraj","Amit","Bunty"};
		
	   List<String> arrayToList= Arrays.asList(cricketer);
	   System.out.println(arrayToList); //[Sachin, Dravid, Rahul, Yuvraj, Amit, Bunty]
	   Collections.sort(arrayToList);   // sort method is return type void
	   System.out.println(arrayToList); // [Amit, Bunty, Dravid, Rahul, Sachin, Yuvraj]
	   System.out.println();            //    0     1       2      3      4       5  
	   
	   
	   
//--------- Convert List into Array----------------------------------------------- 
       String[] arr = arrayToList.toArray(new String[0]); 
 
       int index=0;
       for (String x : arr) 
       {
    	   System.out.println(x + "-----"+index);
    	   index++;
       }
	}

}

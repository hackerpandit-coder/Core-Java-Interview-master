package patternDesign;

public class CustomArrayLogic {
	
	//1st instance variable
	private Object firstArray[]= new Object[5];
	
	
	//2nd instance variable
	private int index=0;
	
	public void add(Object obj)
	{
		
			if(index==firstArray.length)
			{
				increaseCapacity();
			}
			else
			{
				firstArray[index] = obj;
				index++;
				
			}
		
	}
	
	
	public void increaseCapacity()
	{
		
		int newCapacity=firstArray.length*2;
		
		Object secondArray[]= new Object[newCapacity];
		
		for(int i=0;i<firstArray.length;i++)
		{
			secondArray[i]=firstArray[i];
			
		}
			secondArray = firstArray;
	}
	
	
	public int capacity()
	{
		
		if(index==firstArray.length)
		{
			return firstArray.length*2;
			
		}
		else
		{
			return firstArray.length;
			
		}
	}
	
	public int size()
	{
		return index;
	}
	
	
}

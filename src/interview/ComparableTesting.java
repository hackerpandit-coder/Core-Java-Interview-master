package interview;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class ComparableTesting {

	public static void main(String[] args) {
		
		Set<LaptopModel> list = new TreeSet<>();
		list.add(new LaptopModel("Acer",4,8000));
		list.add(new LaptopModel("HP",16,12000));
		list.add(new LaptopModel("Dell",8,10000));
		list.add(new LaptopModel("Dell",8,10000));
		
		//Collections.sort(list);
		
		for(LaptopModel o :list )
		{
			System.out.println(o);
		}
		

	}

}

class LaptopModel implements Comparable<LaptopModel>{
	private String brand;
	private int ram;
	private int price;
			
	
	public LaptopModel(String brand, int ram, int price) {
		super();
		this.brand = brand;
		this.ram = ram;
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	@Override
	public String toString() {
		return "LaptopModel [brand=" + brand + ", ram=" + ram + ", price=" + price + "]";
	}
	@Override
	public int compareTo(LaptopModel model) {
		
		boolean abc = this.getPrice() < model.getPrice();
		
		if(abc)
			return -1;
		else
		   return 1;
		
	}
}





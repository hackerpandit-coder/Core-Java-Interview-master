package interview;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class ComparatorTesting {

	public static void main(String[] args) {
		
		List<LaptopClassModel> list = new ArrayList<>();
		list.add(new LaptopClassModel("Acer",4,8000));
		list.add(new LaptopClassModel("HP",16,12000));
		list.add(new LaptopClassModel("Dell",8,10000));
		
        Comparator<LaptopClassModel> comparator = new Comparator<LaptopClassModel>() {

			@Override
			public int compare(LaptopClassModel o1, LaptopClassModel o2) {
				if(o1.getRam() > o2.getRam())
				return -1;
				else
					return 1;
			}
		}; // IT requires here
		
		
		Collections.sort(list,comparator);
		
		for(LaptopClassModel o :list )
		{
			System.out.println(o);
			/*  LaptopClassModel [brand=HP, ram=16, price=12000]
				LaptopClassModel [brand=Dell, ram=8, price=10000]
				LaptopClassModel [brand=Acer, ram=4, price=8000]

			 * 
			 * */
		}
		

	}

}

class LaptopClassModel {
	private String brand;
	private int ram;
	private int price;
			
	
	public LaptopClassModel(String brand, int ram, int price) {
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
		return "LaptopClassModel [brand=" + brand + ", ram=" + ram + ", price=" + price + "]";
	}
	
}






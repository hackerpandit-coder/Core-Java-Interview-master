package hacker;

import java.util.Scanner;

abstract class Cuisine {
	public abstract Cuisine serveFood(String dish);
}

class UnservableCuisineRequestException extends Exception {

	public UnservableCuisineRequestException(String message) {
		super(message);
	}
}


class Chinese extends Cuisine {

	String dish;

	@Override
	public Cuisine serveFood(String dish) {
		this.dish = dish;
		return new Chinese(dish);
	}

	public Chinese(String dish) {
		super();
		this.dish = dish;
	}

	public Chinese() {
		super();
	}

	public String getDish() {
		return dish;
	}
}

class Italian extends Cuisine {

	String dish;

	@Override
	public Cuisine serveFood(String dish) {
		this.dish = dish;
		return new Italian(dish);
	}

	public Italian(String dish) {
		super();
		this.dish = dish;
	}

	public Italian() {
		super();
	}

	public String getDish() {
		return dish;
	}
}

class Japanese extends Cuisine {
	String dish;

	@Override
	public Cuisine serveFood(String dish) {
		this.dish = dish;
		return new Japanese(dish);
	}

	public Japanese() {
		super();
	}

	public Japanese(String dish) {
		super();
		this.dish = dish;
	}

	public String getDish() {
		return dish;
	}
}

class Mexican extends Cuisine {

	String dish;

	@Override
	public Cuisine serveFood(String dish) {
		this.dish = dish;
		return new Mexican(dish);
	}

	public Mexican(String dish) {
		super();
		this.dish = dish;
	}

	public Mexican() {
		super();
	}

	public String getDish() {
		return dish;
	}
}


class FoodFactory {

	public static String cuisineArray[]=new String[4]; 
	public static int i=0;

	public static FoodFactory foodFactory = null;

	public static FoodFactory getFactory() {

		if (foodFactory == null)
			foodFactory = new FoodFactory();

		return foodFactory;
	}

	public void registerCuisine(String cuisineKey, Cuisine cuisine) {

		cuisineArray[i]=cuisineKey;
		i++;

	}
	
	public int valueExist(String cuisine){
		
		int count=0;
		
		for(int i=0;i<cuisineArray.length;i++){
			
			if(cuisineArray[i].equals(cuisine))
				count++;
		}
		return count;
	}

	public Cuisine serveCuisine(String cuisine, String dish) throws UnservableCuisineRequestException {
		
		if (valueExist(cuisine)==1 ) {

			if ("Chinese".equalsIgnoreCase(cuisine))
				return new Chinese().serveFood(dish);
			else if ("Italian".equalsIgnoreCase(cuisine))
				return new Italian().serveFood(dish);
			else if ("Japanese".equalsIgnoreCase(cuisine))
				return new Japanese().serveFood(dish);
			else
				return new Mexican().serveFood(dish);
		} else
			throw new UnservableCuisineRequestException("Unservable cuisine " + cuisine + " for dish " + dish);
	}

}

public class CuisineProblem {
	private static final Scanner INPUT_READER = new Scanner(System.in);
	private static final FoodFactory FOOD_FACTORY = FoodFactory.getFactory();

	static {
		FoodFactory.getFactory().registerCuisine("Chinese", new Chinese());
		FoodFactory.getFactory().registerCuisine("Italian", new Italian());
		FoodFactory.getFactory().registerCuisine("Japanese", new Japanese());
		FoodFactory.getFactory().registerCuisine("Mexican", new Mexican());
	}

	public static void main(String[] args) {
		int totalNumberOfOrders = Integer.parseInt(INPUT_READER.nextLine());
		while (totalNumberOfOrders-- > 0) {
			String[] food = INPUT_READER.nextLine().split(" ");
			String cuisine = food[0];
			String dish = food[1];

			try {
				if (FOOD_FACTORY.equals(FoodFactory.getFactory())) {
					Cuisine servedFood = FOOD_FACTORY.serveCuisine(cuisine, dish);

					switch (cuisine) {
					case "Chinese":
						Chinese chineseDish = (Chinese) servedFood;
						System.out.println("Serving " + chineseDish.getDish() + "(Chinese)");
						break;
					case "Italian":
						Italian italianDish = (Italian) servedFood;
						System.out.println("Serving " + italianDish.getDish() + "(Italian)");
						break;
					case "Japanese":
						Japanese japaneseDish = (Japanese) servedFood;
						System.out.println("Serving " + japaneseDish.getDish() + "(Japanese)");
						break;
					case "Mexican":
						Mexican mexicanDish = (Mexican) servedFood;
						System.out.println("Serving " + mexicanDish.getDish() + "(Mexican)");
						break;
					default:
						break;
					}
				}
			} catch (UnservableCuisineRequestException ex) {
				System.out.println(ex.getMessage());
			}
		}
	}
	
	
		/*  Sample Input:
		    3
			Italian Lasagne
			Japanese Kamameshi
			Polish Marjoram
			
			Sample Output:
			Serving Lasagne(Italian)
			Serving Kamameshi(Japanese)
			Unservable cuisine Polish for dish Marjoram
		 
	 
	    */
}
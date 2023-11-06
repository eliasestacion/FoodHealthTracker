package cisc191.sdmesa.edu;
public class Tester {

	public static void main(String[] args) {
		Meal breakfast = new Meal("Breakfast", 500);
		Food bagel = new Food(150, "Everything Bagel");
		Food orangeJuice = new Food(50, "Orange Juice");
		
		bagel.setCalorieAmount(80);
		orangeJuice.setCalorieAmount(70);
		breakfast.logFood(bagel);
		breakfast.logFood(orangeJuice);
		
		System.out.println(breakfast);
		System.out.println(breakfast.getFoodEaten());
		
		
	}

}

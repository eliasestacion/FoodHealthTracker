package cisc191.sdmesa.edu;

/**
 * Lead Author(s):
 * @author Elias John Estacion; 5550145434
 * 
 * References:
 * Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented Problem Solving.
 * Retrieved from https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 * 
 *  
 * Version/date: 12/12/23
 * 
 * 
 */

public class Tester 
{

	public static void main(String[] args) 
	{
		// Food tester
		Meal breakfast = new Meal("Breakfast", 500);
		Food bagel = new Food(150, "Everything Bagel");
		Food egg = new Food(60, "Egg");
		
		bagel.setCalorieAmount(80);
		egg.setCalorieAmount(70);
		
		System.out.println(breakfast);
		System.out.println(breakfast.getFoodEaten()+"\n");
		 
		// Person's statistics tester
		PersonStatistics personStats = new PersonStatistics("Elias", 100, 64);

		// Displaying the initial statistics
		System.out.println("Initial Person's Stats:");
		System.out.println(personStats);

		// Modifying the statistics
		personStats.setPersonName("Elias John");
		personStats.setTargetWeight(68.0);
	

		// Displaying the modified statistics
		System.out.println("\nModified Person's Stats:");
		System.out.println(personStats);
		
		// Drink tester
		Meal lunch = new Meal("Breakfast", 500);
		Drink strawberryBananaSmoothie = new Drink(350, "Strawberry Banana Smoothie");
		Drink orangeJuice = new Drink(80, "Orange Juice");
		
		strawberryBananaSmoothie.setCalorieAmount(350);
		orangeJuice.setCalorieAmount(80);
//		lunch.logFood(strawberryBananaSmoothie);
//		lunch.logFood(orangeJuice);
		
		System.out.println(lunch);
		System.out.println(lunch.getFoodEaten()+"\n");
	}


}

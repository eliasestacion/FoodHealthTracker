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

public class Drink implements Consumable
{
	int calorieAmount;
	String drinkName;

	public Drink(int calorieAmount, String drinkName)
	{
		this.calorieAmount = calorieAmount;
		this.drinkName = drinkName;
	}
	
	public String getName()
	{
		return drinkName;
	}
	
	public int getCalorieAmount()
	{
		return calorieAmount;
	}
	
	public void setDrinkName(String newDrinkName)
	{
		drinkName = newDrinkName;
	}
	
	public void setCalorieAmount(int newCalorieAmount)
	{
		calorieAmount = newCalorieAmount;
	}
	
	public String toString()
	{
		return drinkName + " " + calorieAmount;
	}
}

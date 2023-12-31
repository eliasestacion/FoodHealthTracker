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

public class Food implements Consumable
{
	private int calorieAmount;
	private String foodName;
	private String category;

	public Food(int calorieAmount, String foodName)
	{
		this.calorieAmount = calorieAmount;
		this.foodName = foodName;
	}
	
	public String getName()
	{
		return foodName;
	}
	
	public int getCalorieAmount()
	{
		return calorieAmount;
	}
	
	public String getCategory()
	{
		return category;
	}
	
	void setFoodName(String newFoodName)
	{
		foodName = newFoodName;
	}
	
	void setCalorieAmount(int newCalorieAmount)
	{
		calorieAmount = newCalorieAmount;
	}
	
	public void setCategory(String category) 
	{
        this.category = category;
    }

	public String toString()
	{
		return foodName + " " + calorieAmount;
	}
}
	
package cisc191.sdmesa.edu;

public class Food implements Consumable
{
	int calorieAmount;
	String foodName;

	public Food(int calorieAmount, String foodName)
	{
		this.calorieAmount = calorieAmount;
		this.foodName = foodName;
	}
	
	public String getFoodName()
	{
		return foodName;
	}
	
	public int getCalorieAmount()
	{
		return calorieAmount;
	}
	
	void setFoodName(String newFoodName)
	{
		foodName = newFoodName;
	}
	
	void setCalorieAmount(int newCalorieAmount)
	{
		calorieAmount = newCalorieAmount;
	}
	
	public String toString()
	{
		return foodName + " " + calorieAmount;
	}
}
	
package cisc191.sdmesa.edu;

public class Drink 
{
	int calorieAmount;
	String drinkName;

	public Drink(int calorieAmount, String drinkName)
	{
		this.calorieAmount = calorieAmount;
		this.drinkName = drinkName;
	}
	
	String getDrinkName()
	{
		return drinkName;
	}
	
	int getCalorieAmount()
	{
		return calorieAmount;
	}
	
	void setFoodName(String newDrinkName)
	{
		drinkName = newDrinkName;
	}
	
	void setCalorieAmount(int newCalorieAmount)
	{
		calorieAmount = newCalorieAmount;
	}
	
	public String toString()
	{
		return drinkName + " " + calorieAmount;
	}
}

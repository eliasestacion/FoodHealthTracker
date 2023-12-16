package cisc191.sdmesa.edu;

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

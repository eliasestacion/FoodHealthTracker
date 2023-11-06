package cisc191.sdmesa.edu;
import java.util.ArrayList;

public class Meal
{
	private String name;
	private int calorieLimit;
	private ArrayList<Food> foodEaten;
	
	public Meal(String name, int calorieLimit) 
	{
		this.name = name;
		this.calorieLimit = calorieLimit;
		this.foodEaten = new ArrayList<>();
	}
	
	int getCalorieLimit()
	{
		return calorieLimit;
	}
	
	String getName()
	{
		return name;
	}
	
	ArrayList<Food> getFoodEaten()
	{
		return foodEaten;
	}
	
	public void logFood(Food food)
	{
		foodEaten.add(food);
	}
	
	void setName(String newName)
	{
		name = newName;
	}
	
	void setCalorieLimit(int newCalorieLimit)
	{
		calorieLimit = newCalorieLimit;
	}
	
	public String toString()
	{
		return name + " " + calorieLimit;
	}
	
}

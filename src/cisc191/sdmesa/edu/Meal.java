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
	
	public void logFood(Food food, MyHealthTrackerModel model)
	{
		foodEaten.add(food);
		model.getPerson().updateTotalCalIntake(model);
	}
	
	void setName(String newName)
	{
		if (newName == null || newName.trim().isEmpty())
		{
			throw new IllegalArgumentException("Meal name cannot be null or empty.");
		}
		name = newName;
	}
	
	void setCalorieLimit(int newCalorieLimit)
	{
		if (newCalorieLimit < 0)
		{
			throw new IllegalArgumentException("Calorie limit must be more than 0.");
		}
		calorieLimit = newCalorieLimit;
	}
	
	public String toString()
	{
		return name + " " + calorieLimit;
	}
	
}

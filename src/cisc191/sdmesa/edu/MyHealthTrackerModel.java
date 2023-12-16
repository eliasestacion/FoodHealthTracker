package cisc191.sdmesa.edu;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

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

public class MyHealthTrackerModel 
{
	private PersonStatistics person;
	private Meal[] meals;
	private Meal breakfast = new Meal("Breakfast", 100);
	private Meal lunch = new Meal("Lunch", 100);
	private Meal dinner = new Meal("Dinner", 100);
	private Meal supper = new Meal("Supper", 100);
	
	public MyHealthTrackerModel() {	
		// Onboard users by asking them for input 
		String name = JOptionPane.showInputDialog("What is your name?");
		Integer currentWeight = Integer.parseInt(JOptionPane.showInputDialog("What is your current weight (in lbs)?"));
		Integer targetWeight = Integer.parseInt(JOptionPane.showInputDialog("What is your target weight (in lbs)?"));
		
		this.person = new PersonStatistics(name, currentWeight, targetWeight);
		this.meals = new Meal[]{breakfast, lunch, dinner};
	}
	
	public Meal[] getMeals() 
	{
		return meals;
	}
	
	public Meal getBreakfast() 
	{
		return breakfast;
	}
	
	public Meal getLunch() 
	{
		return lunch;
	}
	
	public Meal getDinner() 
	{
		return dinner;
	}
	
	public PersonStatistics getPerson() 
	{
		return person;
	}
	
	public void setBreakfastLimit(Integer limit) 
	{
		breakfast.setCalorieLimit(limit);
	}
	
	public void setLunchLimit(Integer limit) 
	{
		lunch.setCalorieLimit(limit);
	}
	
	public void setDinnerLimit(Integer limit) 
	{
		dinner.setCalorieLimit(limit);
	}
	
	// Exports data into a text file
	public void exportData() 
	{
		try (PrintWriter writer = new PrintWriter(new FileWriter("data.txt"))) 
		{
			// For each meal, loop through each food eaten and print info
			for (Meal meal : meals) 
			{
				writer.println(meal.getName());
				for (Food food : meal.getFoodEaten()) 
				{
					writer.println(food.getName() + ": " + food.getCalorieAmount() + " cals");
				}
				writer.println("\n"); 	
			}
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}

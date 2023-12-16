package cisc191.sdmesa.edu;
import java.time.LocalDate;

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

public class PersonStatistics 
{
	private String personName;
	private double waterIntake;
	private double currentWeight;
	private double targetWeight;
	private double totalCalIntake;
	
	// Constructors
	public PersonStatistics(String personName, double currentWeight, double targetWeight) 
	{
		this.personName = personName;
		this.waterIntake = 0;
		this.currentWeight = currentWeight;
		this.targetWeight = targetWeight;
		this.totalCalIntake = 0;
	}
	
	public String getPersonName()
	{
		return personName;
	}
	
	public void setPersonName(String personName)
	{
		if (personName == null || personName.trim().isEmpty())
		{
			throw new IllegalArgumentException("Person name cannot be null or empty.");
		}
		this.personName = personName;
	}
	
	public double getWaterIntake()  
	{    
		return waterIntake; 
	}

	public void logWater() 
	{
		// Add one cup of water each time
		waterIntake += 1;
	}

	public double getCurrentWeight() 
	{
		return currentWeight;
	}

	public void setCurrentWeight(double currentWeight) 
	{
		this.currentWeight = currentWeight;
	}

	public double getTargetWeight() 
	{
		return targetWeight;
	}

	public void setTargetWeight(double targetWeight) 
	{
		this.targetWeight = targetWeight;
	}

	public double getTotalCalIntake() 
	{
		return totalCalIntake;
	}

	public void updateTotalCalIntake(MyHealthTrackerModel model)  
	{
		// Start with 0 calorie intake
		Integer calIntake = 0;
		
		// Add each meal's total calorie amount to the calIntake var
		for (Meal meal : model.getMeals()) {
			for (Food food : meal.getFoodEaten()) {
				calIntake += food.getCalorieAmount();
			}
		}
		
		// Assign new calIntake to totalCalIntake
		totalCalIntake = calIntake;
	}

	public String toString() 
	{
		return "PersonsStats{" +
		"personName = " + personName +
		", waterIntake = " + waterIntake +
		", targetWeight = " + targetWeight +
		", totalCalIntake = " + totalCalIntake + '}';
	}

}

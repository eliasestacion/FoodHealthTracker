package cisc191.sdmesa.edu;
import java.time.LocalDate;

public class PersonStatistics 
{
	private String personName;
	private double waterIntake;
	private double weightLoss;
	private double targetWeight;
	private double totalCalIntake;
	private LocalDate currentDate;
	
	// Constructors
	public PersonStatistics(String personName, double waterIntake, double weightLoss, double targetWeight, double totalCalIntake) 
	{
	this.personName = personName;
	this.waterIntake = waterIntake;
	this.weightLoss = weightLoss;
	this.targetWeight = targetWeight;
	this.totalCalIntake = totalCalIntake;
	this.currentDate = LocalDate.now();
	}
	
	public LocalDate getCurrentDate()
	{
		return currentDate;
	}

	    /**
	     * Getter and setter methods
	     * @return
	     */
	
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

	public void setWaterIntake(double waterIntake) 
	{
	this.waterIntake = waterIntake;
	}

	public double getWeightLoss() 
	{
	return weightLoss;
	}

	public void setWeightLoss(double weightLoss) 
	{
	this.weightLoss = weightLoss;
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

	public void setTotalCalIntake(double totalCalIntake) 
	{
	this.totalCalIntake = totalCalIntake;
	}

	public String toString() 
	{
	return "PersonsStats{" +
	"personName = " + personName +
	", waterIntake = " + waterIntake +
	", weightLoss = " + weightLoss +
	", targetWeight = " + targetWeight +
	", totalCalIntake = " + totalCalIntake + '}';
	}

}

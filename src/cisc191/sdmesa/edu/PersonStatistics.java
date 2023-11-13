package cisc191.sdmesa.edu;

public class PersonStatistics 
{
	private String personName;
	private double waterIntake;
	private double weightLoss;
	private double targetWeight;
	private double totalCalIntake;

	// Constructors
	public PersonStatistics(String personName, double waterIntake, double weightLoss, double targetWeight, double totalCalIntake) 
	{
	this.personName = personName;
	this.waterIntake = waterIntake;
	this.weightLoss = weightLoss;
	this.targetWeight = targetWeight;
	this.totalCalIntake = totalCalIntake;
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

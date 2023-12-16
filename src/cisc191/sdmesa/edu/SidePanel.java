package cisc191.sdmesa.edu;

import java.awt.Color;
/**
 * Lead Author(s):
 * @author Elias John Estacion; 5550145434
 * 
 * References:
 * Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented Problem Solving.
 * Retrieved from https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 * 
 *  
 * Version/date: 11/12/23
 * 
 * 
 */
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

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

public class SidePanel extends JPanel 
{
	
	private JLabel targetWeightLabel;
	private JLabel currentWeightLabel;
	private JLabel calorieIntakeLabel;
	private JLabel waterIntakeLabel;
	
	public SidePanel(MyHealthTrackerModel model) 
	{
		GridLayout layout = new GridLayout(5,2,2,2);	
		PersonStatistics person = model.getPerson();
		
		targetWeightLabel = new JLabel(person.getTargetWeight() + " lbs");
		currentWeightLabel = new JLabel(person.getCurrentWeight() + " lbs");
		waterIntakeLabel = new JLabel(person.getWaterIntake() + " cups");
		calorieIntakeLabel = new JLabel(person.getTotalCalIntake() + " cals");
		
		this.setLayout(layout);
		this.add(new JLabel("Hi, " + person.getPersonName() + "!"));
		this.add(new JLabel(""));
		this.add(new JLabel("Water Intake: "));
		this.add(waterIntakeLabel);
		this.add(new JLabel("Current Weight: "));
		this.add(currentWeightLabel);
		this.add(new JLabel("Target Weight: "));
		this.add(targetWeightLabel);
		this.add(new JLabel("Total Calorie Intake: "));
		this.add(calorieIntakeLabel);
		this.setBackground(Color.GREEN);
	}
	
	public void updateCalorieIntakeLabel(MyHealthTrackerModel model) 
	{
		calorieIntakeLabel.setText(model.getPerson().getTotalCalIntake() + " cals");
	}
	
	public void updateTargetWeightLabel(MyHealthTrackerModel model) 
	{
		targetWeightLabel.setText(model.getPerson().getTargetWeight() + " lbs");
	}
	
	public void updateWaterIntakeLabel(MyHealthTrackerModel model) 
	{
		waterIntakeLabel.setText(model.getPerson().getWaterIntake() + " cups");
	}
}

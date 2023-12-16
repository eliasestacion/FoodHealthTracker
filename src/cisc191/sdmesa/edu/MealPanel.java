package cisc191.sdmesa.edu;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

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

public class MealPanel extends JPanel 
{
	private String mealName;
	private JTextField foodTextField;
	private JTextField calorieTextField;
	
	public MealPanel(String mealName) 
	{
		GridLayout layout = new GridLayout(2, 2);		
		this.setLayout(layout);
		this.mealName = mealName;
		this.setBackground(Color.ORANGE);
		
		this.foodTextField = new JTextField(null, 10);
		this.foodTextField.setSize(100, 20);
		this.calorieTextField = new JTextField(null, 10);		
		
		this.add(new JLabel(mealName));
		this.add(foodTextField);
		this.add(new JLabel("Calories"));
		this.add(calorieTextField);
	}
	
	public String getMealName() 
	{
		return mealName;
	}
	
	public JTextField getFoodTextField() 
	{
		return foodTextField;
	}
	
	public JTextField getCalorieTextField() 
	{
		return calorieTextField;
	}
}

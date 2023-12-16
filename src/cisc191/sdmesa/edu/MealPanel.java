package cisc191.sdmesa.edu;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MealPanel extends JPanel {
	private String mealName;
	private JTextField foodTextField;
	private JTextField calorieTextField;
	
	public MealPanel(String mealName) {
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
	
	public String getMealName() {
		return mealName;
	}
	
	public JTextField getFoodTextField() {
		return foodTextField;
	}
	
	public JTextField getCalorieTextField() {
		return calorieTextField;
	}
}

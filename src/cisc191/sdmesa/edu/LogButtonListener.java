package cisc191.sdmesa.edu;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class LogButtonListener implements ActionListener {
	private LogButton button;
	private MyHealthTrackerView view;
	private MyHealthTrackerModel model;
	
	public LogButtonListener(MyHealthTrackerModel model, MyHealthTrackerView healthTrackerView,
			LogButton logButton)
	{
		this.model = model;
		this.view = healthTrackerView;
		this.button = logButton;
	}

	public void actionPerformed(ActionEvent e) 
	{
		// Loop through each meal
		for (int i = 0; i < model.getMeals().length; i++) {
			MealPanel mealPanel = (MealPanel) view.getCenterPanel().getComponent(i);
			JTextField calorieTextField = mealPanel.getCalorieTextField();
			JTextField foodTextField = mealPanel.getFoodTextField();
			Meal meal = model.getMeals()[i];
			
			// If both food and calorie fields have text, log food
			if (!foodTextField.getText().equals("") && !calorieTextField.getText().equals("")) {
				Integer calories = Integer.parseInt(calorieTextField.getText());
				String foodName = foodTextField.getText();
				meal.logFood(new Food(calories, foodName), model);
			} 
			// Print the respective meals
			System.out.println(meal.getName() + ": " + meal.getFoodEaten());
		}
		// Update UI at the end
		view.updateUI();
	}
}

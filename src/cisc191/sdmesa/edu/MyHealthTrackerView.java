package cisc191.sdmesa.edu;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import javafx.application.Application;

public class MyHealthTrackerView extends JFrame
{
		private JTextField personNameTextField;
		private JTextField foodNameTextField;
		private JTextField foodCalorieTextField;
		private JTextField drinkNameTextField;
		private JTextField drinkCalorieTextField;

		private PersonStatistics person;
		private Food food;
		private Drink drink;

		public MyHealthTrackerView() 
		{
			// Initialize sample instances
			person = new PersonStatistics("John", 0, 0, 70, 0);
			food = new Food(300, "Pizza");
			drink = new Drink(150, "Soda");

			// Set up UI components
			personNameTextField = new JTextField(person.getPersonName(), 10);
			foodNameTextField = new JTextField(food.getFoodName(), 10);
			foodCalorieTextField = new JTextField(String.valueOf(food.getCalorieAmount()), 10);
			drinkNameTextField = new JTextField(drink.getDrinkName(), 10);
			drinkCalorieTextField = new JTextField(String.valueOf(drink.getCalorieAmount()), 10);

			JButton updateButton = new JButton("Update");

			// Set up layout
			setLayout(new BorderLayout());

			// Panel for the center layout
			JPanel centerPanel = new JPanel(new GridLayout(6, 2));
			centerPanel.add(new JLabel("Person Name:"));
			centerPanel.add(personNameTextField);
			centerPanel.add(new JLabel("Food Name:"));
			centerPanel.add(foodNameTextField);
			centerPanel.add(new JLabel("Food Calories:"));
			centerPanel.add(foodCalorieTextField);
			centerPanel.add(new JLabel("Drink Name:"));
			centerPanel.add(drinkNameTextField);
			centerPanel.add(new JLabel("Drink Calories:"));
			centerPanel.add(drinkCalorieTextField);

			// Add center panel to the center of the frame
			add(centerPanel, BorderLayout.CENTER);

			// Button at the bottom
			add(updateButton, BorderLayout.SOUTH);

			// Set up button action
			updateButton.addActionListener(new ActionListener() 
			{
				@Override
				public void actionPerformed(ActionEvent e) 
				{
					// Update the person, food, and drink objects based on the input fields
					person.setPersonName(personNameTextField.getText());
					food.setFoodName(foodNameTextField.getText());
					food.setCalorieAmount(Integer.parseInt(foodCalorieTextField.getText()));
					drink.setDrinkName(drinkNameTextField.getText());
					drink.setCalorieAmount(Integer.parseInt(drinkCalorieTextField.getText()));

					// Print the updated information
					System.out.println(person);
					System.out.println(food);
					System.out.println(drink);
				}
			});

			// Set up frame
			setTitle("Nutrition Tracker");
			setSize(400, 200);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setLocationRelativeTo(null);
			setVisible(true);
		}
		
	    public static void main(String[] args) 
	    {
	        SwingUtilities.invokeLater(new Runnable() 
	        {
	            public void run() 
	            {
	                new MyHealthTrackerView();
	            }
	        });
	    }

}

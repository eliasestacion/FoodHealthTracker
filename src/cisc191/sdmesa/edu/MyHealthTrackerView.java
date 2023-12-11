package cisc191.sdmesa.edu;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyHealthTrackerView extends JFrame 
{
	private JTextField personNameTextField;
	private JTextField breakfastNameTextField;
	private JTextField breakfastCalorieTextField;
	private JTextField lunchNameTextField;
	private JTextField lunchCalorieTextField;
	private JTextField dinnerNameTextField;
	private JTextField dinnerCalorieTextField;
	private JTextField drinkNameTextField;
	private JTextField drinkCalorieTextField;

	private PersonStatistics person;
	private Food breakfast;
	private Food lunch;
	private Food dinner;
	private Drink drink;

	public MyHealthTrackerView() 
	{
		// Initialize sample instances
		person = new PersonStatistics("Elias", 0, 0, 70, 0);
		breakfast = new Food(300, "Oatmeal with Brown Sugar");
		lunch = new Food(500, "Chicken and Rice");
		dinner = new Food(600, "Grilled Tilapia");
		drink = new Drink(150, "Coca Cola");

		// Set up UI components
		personNameTextField = new JTextField(person.getPersonName(), 10);
		breakfastNameTextField = new JTextField(breakfast.getFoodName(), 10);
		breakfastCalorieTextField = new JTextField(String.valueOf(breakfast.getCalorieAmount()), 10);
		lunchNameTextField = new JTextField(lunch.getFoodName(), 10);
		lunchCalorieTextField = new JTextField(String.valueOf(lunch.getCalorieAmount()), 10);
		dinnerNameTextField = new JTextField(dinner.getFoodName(), 10);
		dinnerCalorieTextField = new JTextField(String.valueOf(dinner.getCalorieAmount()), 10);
		drinkNameTextField = new JTextField(drink.getDrinkName(), 10);
		drinkCalorieTextField = new JTextField(String.valueOf(drink.getCalorieAmount()), 10);

		JButton updateButton = new JButton("Update");

		// Set up layout
		setLayout(new BorderLayout());

		// Create JPanels with background colors for each section
		JPanel northPanel = new JPanel();
		northPanel.setBackground(Color.ORANGE);
		northPanel.setPreferredSize(new Dimension(0, 5));
		add(northPanel, BorderLayout.NORTH);

		JPanel southPanel = new JPanel();
		southPanel.setBackground(Color.ORANGE);
		add(southPanel, BorderLayout.SOUTH);

		JPanel eastPanel = new JPanel();
		eastPanel.setBackground(Color.ORANGE);
		add(eastPanel, BorderLayout.EAST);

		JPanel westPanel = new JPanel();
		westPanel.setBackground(Color.ORANGE);
		add(westPanel, BorderLayout.WEST);
   

		JPanel topPanel = new JPanel(new BorderLayout());

		// Greeting at the top left
		JPanel greetingPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		greetingPanel.add(new JLabel("Hi, " + person.getPersonName() + "!"));
		topPanel.add(greetingPanel, BorderLayout.WEST);

		// Title in the top middle
		JPanel titlePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		titlePanel.add(new JLabel("MyHealthTracker"));
		topPanel.add(titlePanel, BorderLayout.CENTER);

		// Add the top panel to the frame
		add(topPanel, BorderLayout.NORTH);


		// Person's statistics on the east side
		JPanel personStatsPanel = new JPanel(new GridLayout(6, 1));
		personStatsPanel.add(new JLabel("Person's Stats: " + person.getPersonName()));
		personStatsPanel.add(new JLabel("Water Intake: " + person.getWaterIntake()));
		personStatsPanel.add(new JLabel("Weight: " + person.getTargetWeight()));
		personStatsPanel.add(new JLabel("Weight Loss: " + person.getWeightLoss()));
		personStatsPanel.add(new JLabel("Total Calorie Intake: " + person.getTotalCalIntake()));
		eastPanel.add(personStatsPanel);

		// Panel for the center layout using GridLayout
		JPanel centerPanel = new JPanel(new GridLayout(9, 2));
		centerPanel.add(new JLabel("Breakfast Name:"));
		centerPanel.add(breakfastNameTextField);
		centerPanel.add(new JLabel("Breakfast Calories:"));
		centerPanel.add(breakfastCalorieTextField);
		centerPanel.add(new JLabel("Lunch Name:"));
		centerPanel.add(lunchNameTextField);
		centerPanel.add(new JLabel("Lunch Calories:"));
		centerPanel.add(lunchCalorieTextField);
		centerPanel.add(new JLabel("Dinner Name:"));
		centerPanel.add(dinnerNameTextField);
		centerPanel.add(new JLabel("Dinner Calories:"));
		centerPanel.add(dinnerCalorieTextField);
		centerPanel.add(new JLabel("Drink Name:"));
		centerPanel.add(drinkNameTextField);
		centerPanel.add(new JLabel("Drink Calories:"));
		centerPanel.add(drinkCalorieTextField);

		// Add center panel to the center of the frame
		add(centerPanel, BorderLayout.CENTER);

		// Button at the bottom
		JPanel southCenterPanel = new JPanel();
		southCenterPanel.add(updateButton);
		add(southCenterPanel, BorderLayout.SOUTH);

		// Set up button action
		updateButton.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				// Update the person, food, and drink objects based on the input fields
				person.setPersonName(personNameTextField.getText());
				breakfast.setFoodName(breakfastNameTextField.getText());
				breakfast.setCalorieAmount(Integer.parseInt(breakfastCalorieTextField.getText()));
				lunch.setFoodName(lunchNameTextField.getText());
				lunch.setCalorieAmount(Integer.parseInt(lunchCalorieTextField.getText()));
				dinner.setFoodName(dinnerNameTextField.getText());
				dinner.setCalorieAmount(Integer.parseInt(dinnerCalorieTextField.getText()));
				drink.setDrinkName(drinkNameTextField.getText());
				drink.setCalorieAmount(Integer.parseInt(drinkCalorieTextField.getText()));

				// Print the updated information
				System.out.println(person);
				System.out.println("Breakfast: " + breakfast);
				System.out.println("Lunch: " + lunch);
				System.out.println("Dinner: " + dinner);
				System.out.println("Drink: " + drink);
			}
		});

		// Set up frame
		setSize(700, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public static void main(String[] args) 
	{
		SwingUtilities.invokeLater(new Runnable() 
		{
			public void run() {
				new MyHealthTrackerView();
			}
		});
	}
}


package cisc191.sdmesa.edu;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

public class MyHealthTrackerView extends JFrame 
{
	private JPanel personStatsPanel;
	private MyHealthTrackerModel model;
	private JPanel centerPanel;
	private JPanel sidePanel;

	public MyHealthTrackerView() {
		this.model = new MyHealthTrackerModel();
		this.setTitle("My Health Tracker");
		
		// SIDE PANEL
		sidePanel = new SidePanel(model);

		// CENTER PANEL
		this.centerPanel = new JPanel(new GridLayout(4, 1));
		centerPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
		// For each meal, add a meal panel
		for (Meal meal : model.getMeals()) 
		{
			centerPanel.add(new MealPanel(meal.getName()));
		}

		// BOTTOM PANEL
		JPanel southCenterPanel = new JPanel();
		southCenterPanel.setBackground(Color.DARK_GRAY);
		
		// Log button
		LogButton logButton = new LogButton();
		logButton.addActionListener(new LogButtonListener(model, this, logButton));
		southCenterPanel.add(logButton);
		
		// Drink water button
		DrinkWaterButton drinkWaterButton = new DrinkWaterButton();
		drinkWaterButton.addActionListener(new DrinkWaterButtonListener(model, this, drinkWaterButton));
		southCenterPanel.add(drinkWaterButton);
		
		// Edit weight button
		EditWeightButton editWeightButton = new EditWeightButton();
		editWeightButton.addActionListener(new EditWeightButtonListener(model, this, editWeightButton));
		southCenterPanel.add(editWeightButton);
		
		// Export data button
		ExportDataButton exportDataButton = new ExportDataButton();
		exportDataButton.addActionListener(new ExportDataButtonListener(model, this, exportDataButton));
		southCenterPanel.add(exportDataButton);

		// Set up frame
		add(sidePanel, BorderLayout.EAST);
		add(centerPanel, BorderLayout.CENTER);
		add(southCenterPanel, BorderLayout.SOUTH);
		setSize(700, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	// Updates UI when called
	public void updateUI() 
	{
		// Center Panel
		for (Component panel : centerPanel.getComponents()) 
		{
			MealPanel mealPanel = (MealPanel) panel;
			mealPanel.getFoodTextField().setText("");
			mealPanel.getCalorieTextField().setText("");
		}

		// Side Panel
		((SidePanel) sidePanel).updateCalorieIntakeLabel(model);
		((SidePanel) sidePanel).updateTargetWeightLabel(model);
		((SidePanel) sidePanel).updateWaterIntakeLabel(model);
	}

	public JPanel getCenterPanel() 
	{
		return centerPanel;
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

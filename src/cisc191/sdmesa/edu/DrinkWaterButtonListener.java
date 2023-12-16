package cisc191.sdmesa.edu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

public class DrinkWaterButtonListener implements ActionListener 
{
	private DrinkWaterButton button;
	private MyHealthTrackerView view;
	private MyHealthTrackerModel model;
	
	public DrinkWaterButtonListener(MyHealthTrackerModel model, MyHealthTrackerView healthTrackerView,
			DrinkWaterButton button)
	{
		this.model = model;
		this.view = healthTrackerView;
		this.button = button;
	}

	public void actionPerformed(ActionEvent e) 
	{
		// Log water for the person and update UI
		model.getPerson().logWater();
		view.updateUI();
	}
}

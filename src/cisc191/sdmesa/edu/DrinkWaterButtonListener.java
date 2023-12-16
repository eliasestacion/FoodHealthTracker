package cisc191.sdmesa.edu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class DrinkWaterButtonListener implements ActionListener {
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

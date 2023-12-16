package cisc191.sdmesa.edu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class EditWeightButtonListener implements ActionListener {
	private EditWeightButton button;
	private MyHealthTrackerView view;
	private MyHealthTrackerModel model;
	
	public EditWeightButtonListener(MyHealthTrackerModel model, MyHealthTrackerView healthTrackerView,
			EditWeightButton editWeightButton)
	{
		this.model = model;
		this.view = healthTrackerView;
		this.button = editWeightButton;
	}

	public void actionPerformed(ActionEvent e) 
	{
		try {	
			// Ask what the new target weight is and update UI
	        Integer answer = Integer.parseInt(JOptionPane.showInputDialog(view, "What is your new target weight (in lbs)?", null));
	        if (answer >= 0) {
		        model.getPerson().setTargetWeight(answer);
		        view.updateUI();
	        } else {
	        	// Throw error if negative number provided
	        	throw new IllegalArgumentException("Negative answer provided");
	        }
		} catch (Exception ex) {
			// Print out any errors
			System.out.println(ex);
		}
	}
}

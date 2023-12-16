package cisc191.sdmesa.edu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

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

public class ExportDataButtonListener implements ActionListener {
	private ExportDataButton button;
	private MyHealthTrackerView view;
	private MyHealthTrackerModel model;
	
	public ExportDataButtonListener(MyHealthTrackerModel model, MyHealthTrackerView healthTrackerView,
			ExportDataButton exportDataButton)
	{
		this.model = model;
		this.view = healthTrackerView;
		this.button = exportDataButton;
	}

	public void actionPerformed(ActionEvent e) 
	{
		model.exportData();
	}
}

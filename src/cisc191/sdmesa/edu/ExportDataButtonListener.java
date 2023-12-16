package cisc191.sdmesa.edu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

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

import java.awt.*;
import java.awt.event.*;

public class CalculatorController{
	private CalculatorModel model; 
	private CalculatorView view; 

	public CalculatorController(CalculatorModel model, CalculatorView view){
		this.model = model;
		this.view = view;
	
		this.view.launchUI();
		this.view.setButtonActionListener(new ActionHandler());
		this.view.setFrameWindowListener(new WindowHandler());
	}

	//Inner class IMPLEMENTING ActionListener
	public class ActionHandler implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			model.addition(view.getInputFieldOne(), view.getInputFieldTwo());
			view.setInputFieldThree(model.getAddResult());
		}
	} 

	//Inner class EXTENDING WindowAdapter
	public class WindowHandler extends WindowAdapter{
		public void windowClosing(WindowEvent we){
			System.exit(0);
		}
	}
}
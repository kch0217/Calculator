import java.awt.*;
import java.awt.event.*;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

public class CalculatorView{
	//Declaring refrences for components to use
	private Frame f;
	
	private TextField inputFieldOne;
	private TextField inputFieldTwo;
	private TextField inputFieldThree;
	
	private Label labelPlus;
	private Label labelEquality;

	private Panel rowOne;
	private Panel rowTwo;

	private Button buttonAdd;

	//Parameterized constructor to initialize refrences with their respective objects
	public CalculatorView(String title){
		f = new Frame(title);

		inputFieldOne = new TextField(10);
		inputFieldTwo = new TextField(10);
		inputFieldThree = new TextField(10);

		labelPlus = new Label("+");
		labelEquality = new Label("=");

		rowOne = new Panel();
		rowTwo = new Panel();

		buttonAdd = new Button("Add");
	}

	//Method to launch the User Interface/UI
	public void launchUI(){

		//Setting the layout
		f.setLayout(new BorderLayout());
		rowOne.setLayout(new GridLayout(1, 5));
		rowTwo.setLayout(new FlowLayout());

		//Adding the components to their respective layout
		//Adding input fields and labels in rowOne panel
		rowOne.add(inputFieldOne);
		rowOne.add(labelPlus);
		rowOne.add(inputFieldTwo);
		rowOne.add(labelEquality);
		rowOne.add(inputFieldThree);

		//Adding button in rowTwo panel
		rowTwo.add(buttonAdd);

		//Adding rowOne and rowTwo panels on the frame
		f.add(rowOne, BorderLayout.NORTH);
		f.add(rowTwo, BorderLayout.SOUTH);

		f.setSize(300, 150);
		f.setVisible(true);
	}

	//Method to GET VALUE of TextField "inputFieldOne" in double format
	public double getInputFieldOne(){
		return (Double.parseDouble(inputFieldOne.getText()));
	}

	//Method to GET VALUE of TextField "inputFieldTwo" in double format
	public double getInputFieldTwo(){
		return (Double.parseDouble(inputFieldTwo.getText()));
	}

	//Method to SET VALUE of TextField "inputFieldOne" in double format
	public void setInputFieldThree(double valueToSet){
		inputFieldThree.setText(String.valueOf(valueToSet));
	}

	//Attaching the ActionListeners to their respective components
	//SET ActionListener to Button
	public void setButtonActionListener(ActionListener al){
		buttonAdd.addActionListener(al);
	}

	//SET WindowListener to Frame
	public void setFrameWindowListener(WindowListener wl){
		f.addWindowListener(wl);
	}
}
import java.awt.*;
import java.awt.event.*;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

public class CalculatorView{
	//Declaring refrences for components to use
	private Frame f;
	
	private TextField inputField;

	private Panel rowOne;
	private Panel rowTwo;

	private Button buttonAdd;
	private Button buttonSubtract;
	private Button buttonMultiply;
	private Button buttonDivide;
	private Button buttonEqualsTo;
	private Button buttonDot;

	private Button numOne;
	private Button numTwo;
	private Button numThree;
	private Button numFour;
	private Button numFive;
	private Button numSix;
	private Button numSeven;
	private Button numEight;
	private Button numNine;
	private Button numZero;

	//Parameterized constructor to initialize refrences with their respective objects
	public CalculatorView(String title){
		f = new Frame(title);

		inputField = new TextField(35);
		
		rowOne = new Panel();
		rowTwo = new Panel();

		buttonAdd = new Button("+");
		buttonSubtract = new Button("-");
		buttonMultiply = new Button("x");
		buttonDivide = new Button("/");
		buttonEqualsTo = new Button("=");
		buttonDot = new Button(".");

		numOne = new Button("1");
		numTwo = new Button("2");
		numThree = new Button("3");
		numFour = new Button("4");
		numFive = new Button("5");
		numSix = new Button("6");
		numSeven = new Button("7");
		numEight = new Button("8");
		numNine = new Button("9");
		numZero = new Button("0");
		
	}

	//Method to launch the User Interface/UI
	public void launchUI(){

		//Setting the layout
		f.setLayout(new BorderLayout());
		rowOne.setLayout(new FlowLayout());
		rowTwo.setLayout(new GridLayout(4, 4));

		//Adding the components to their respective layout
		//Adding input field in rowOne panel
		rowOne.add(inputField);
		
		//Adding numerical key-pad in rowTwo Panel
		rowTwo.add(numOne);
		rowTwo.add(numTwo);
		rowTwo.add(numThree);

		rowTwo.add(buttonAdd);

		rowTwo.add(numFour);
		rowTwo.add(numFive);
		rowTwo.add(numSix);

		rowTwo.add(buttonSubtract);

		rowTwo.add(numSeven);
		rowTwo.add(numEight);
		rowTwo.add(numNine);

		rowTwo.add(buttonMultiply);

		rowTwo.add(numZero);

		rowTwo.add(buttonDot);
		rowTwo.add(buttonEqualsTo);
		rowTwo.add(buttonDivide);		

		//Adding rowOne and rowTwo panels on the frame
		f.add(rowOne, BorderLayout.NORTH);
		f.add(rowTwo, BorderLayout.CENTER);

		f.setSize(300, 300);
		f.setVisible(true);
	}

	//Method to GET VALUE of TextField "inputFieldOne" in double format
	// public double getInputFieldOne(){
	// 	return (Double.parseDouble(inputFieldOne.getText()));
	// }

	// //Method to GET VALUE of TextField "inputFieldTwo" in double format
	// public double getInputFieldTwo(){
	// 	return (Double.parseDouble(inputFieldTwo.getText()));
	// }

	// //Method to SET VALUE of TextField "inputFieldOne" in double format
	// public void setInputFieldThree(double valueToSet){
	// 	inputFieldThree.setText(String.valueOf(valueToSet));
	// }

	// //Attaching the ActionListeners to their respective components
	// //SET ActionListener to Button
	// public void setButtonActionListener(ActionListener al){
	// 	buttonAdd.addActionListener(al);
	// }

	//SET WindowListener to Frame
	public void setFrameWindowListener(WindowListener wl){
		f.addWindowListener(wl);
	}
}
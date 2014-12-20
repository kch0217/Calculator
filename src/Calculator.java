import java.awt.*;
import java.awt.event.*;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

public class Calculator{
	private Frame f;
	private TextField textOne;
	private TextField textTwo;
	private TextField textResult;
	private Label labelOperator;
	private Label labelEqualsTo;
	private Panel inputBox;
	private Panel buttonPanel;
	private Button buttonSum;

	public Calculator(String title){ //Parameterized Constructor
		f = new Frame(title); 

		textOne = new TextField();
		labelEqualsTo = new Label("=");

		textTwo = new TextField();
		textResult = new TextField();

		labelOperator = new Label("+");
		inputBox = new Panel();
		buttonPanel = new Panel();

		buttonSum = new Button("Add");
	}

	public void launchFrame(){ //Launching the Application GUI
		f.setLayout(new BorderLayout());
		buttonPanel.setLayout(new FlowLayout());
		inputBox.setLayout(new GridLayout(1, 5));

		inputBox.add(textOne);
		inputBox.add(labelOperator);
		inputBox.add(textTwo);
		inputBox.add(labelEqualsTo);
		inputBox.add(textResult);

		buttonPanel.add(buttonSum);

		f.add(inputBox, BorderLayout.NORTH);
		f.add(buttonPanel, BorderLayout.SOUTH);

		//Action listener to perform addition.
		//Associated with the button
		buttonSum.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				int valueOne;
				int valueTwo;
				int result;
				String resultAsString;

				valueOne = Integer.parseInt(textOne.getText());
				valueTwo = Integer.parseInt(textTwo.getText());

				result = valueOne + valueTwo;
				resultAsString = String.valueOf(result);

				textResult.setText(resultAsString);
			}
		});

		//Window event listener for closing the frame
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we){
				System.exit(0);
			}
		});

		f.setSize(300, 100);
		f.setVisible(true);
	}

	public static void main(String args[]){
		Calculator gui = new Calculator("Simple Sum 1.0"); 
		gui.launchFrame(); 
	}
}



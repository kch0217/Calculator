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

	public Calculator(String title){
		f = new Frame(title);

		textOne = new TextField();
		textTwo = new TextField();
		textResult = new TextField();

		labelOperator = new Label("+");
		labelEqualsTo = new Label("=");

		inputBox = new Panel();
		buttonPanel = new Panel();

		buttonSum = new Button("Add");
	}

	public void launchFrame(){
		f.setLayout(new BorderLayout());
		inputBox.setLayout(new GridLayout(1, 5));
		buttonPanel.setLayout(new FlowLayout());

		inputBox.add(textOne);
		inputBox.add(labelOperator);
		inputBox.add(textTwo);
		inputBox.add(labelEqualsTo);
		inputBox.add(textResult);

		buttonPanel.add(buttonSum);

		f.add(inputBox, BorderLayout.NORTH);
		f.add(buttonPanel, BorderLayout.SOUTH);

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



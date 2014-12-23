import java.awt.*;
import java.awt.event.*;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.util.Random;

public class CalculatorDemo{
	private Frame f;
	private Button b1;
	private Button b2;
	private Button b3;
	private Button b4;
	private Button b5;
	private TextField inBox;
	private Panel p1;
	private Panel p2;
	private ActionHandler h;

	public CalculatorDemo(String title){
		f = new Frame(title);
		h = new ActionHandler();

		b1 = new Button("1");
		b2 = new Button("+");
		b3 = new Button("2");
		b4 = new Button("=");
		b5 = new Button("-");

		inBox = new TextField(50);

		p1 = new Panel();
		p2 = new Panel();
	}

	public void launchUI(){
		f.setLayout(new BorderLayout());
		p1.setLayout(new FlowLayout());
		p2.setLayout(new FlowLayout());

		p1.add(inBox);

		p2.add(b1);
		p2.add(b2);
		p2.add(b3);
		p2.add(b4);
		p2.add(b5);

		b1.addActionListener(h);
		b2.addActionListener(h);
		b3.addActionListener(h);
		b4.addActionListener(h);
		b5.addActionListener(h);

		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we){
				System.exit(0);
			}
		});

		f.add(p1, BorderLayout.NORTH);
		f.add(p2, BorderLayout.CENTER);
		f.pack();
		f.setVisible(true);
	}

	class ActionHandler implements ActionListener{
		private String initString;		
		private String currentString;
		private String finalString;
		private String sign;

		private Double valueOne;
		private Double valueTwo;
		private Double answer;

		public void calculateResult(String sn){
			switch(sn){

				case "+" :  valueTwo = Double.parseDouble(finalString);
							answer = valueOne + valueTwo;
							inBox.setText(String.valueOf(answer));
							break;
				
				case "-" :  valueTwo = Double.parseDouble(finalString);
							answer = valueOne - valueTwo;
							inBox.setText(String.valueOf(answer));
							break;

				default :   inBox.setText("XXXXXXXXXX");
			}
			System.out.println("Occurence A | valueTwo: " + valueTwo);
			System.out.println("Occurence A | answer: " + answer);
		}

		public void displayFormatting(String num){
			initString = inBox.getText();
			finalString = initString;
			

			System.out.println("Occurence 1 | initString: " + initString);
			System.out.println("Occurence 1 | finalString: " + finalString);

			if(num == "+" || num == "-"){
				sign = num;
				inBox.setText("");
				valueOne = Double.parseDouble(finalString);
				System.out.println("Occurence A | valueOne: " + valueOne);
			}
			else if(num == "="){
				inBox.setText("");
				calculateResult(sign);
			}
			else{
				currentString = num;
				finalString = initString + currentString;
				inBox.setText(finalString);
				System.out.println("Occurence 2 | finalString: " + finalString);
			}				

			System.out.println("Occurence 3 | finalString: " + finalString);
			System.out.println(" ");			
		}

		public void actionPerformed(ActionEvent e){
			if(e.getSource() == b1)
				displayFormatting("1");

			if(e.getSource() == b2)
				displayFormatting("+");

			if(e.getSource() == b3)
				displayFormatting("2");

			if(e.getSource() == b4)
				displayFormatting("=");

			if(e.getSource() == b5)
				displayFormatting("-");
		}
	}

	public static void main(String args[]){
		CalculatorDemo dd = new CalculatorDemo("CalculatorDemo");
		dd.launchUI();
	}
}
public class Calculator{
	public static void main(String args[]){
		CalculatorModel model = new CalculatorModel();
		CalculatorView view = new CalculatorView("Calculator");
		CalculatorController controller = new CalculatorController(model, view);
	}
}
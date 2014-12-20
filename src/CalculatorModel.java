public class CalculatorModel{
	private double numOne;	
	private double numTwo;
	private double addResult;

	public void addition(double one, double two){
		addResult = one + two;
	}

	public double getAddResult(){
		return addResult;
	}
}
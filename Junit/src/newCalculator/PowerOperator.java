package newCalculator;

public class PowerOperator implements BinaryOperator{

	@Override
	public double calculate(double a, double b){
		
		return Math.pow(a, b) ;
	}
}

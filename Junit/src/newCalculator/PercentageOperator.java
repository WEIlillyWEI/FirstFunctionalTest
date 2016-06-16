package newCalculator;

public class PercentageOperator implements UnaryOperator{

	@Override
	public double calculate(double a){
		
		return a/100 ;
	}
}

package newCalculator;

public class FactorialOperator implements UnaryOperator{

	@Override
	public double calculate(double a){
		
		double b = a;
		while(a>1){
			a = a-1;
			b = b*a;
		}
		return b;
	}
}

package newCalculator;

import java.util.HashMap;

public class OperatorFactory {
	
	public static HashMap<String,Operator> getOperator(){
		
		HashMap<String, Operator> hm = new HashMap<>();
		hm.put("+", new PlusOperator());
		hm.put("-", new MinusOperator());
		hm.put("*", new MultiplyOperator());
		hm.put("/", new DivideOperator());
		hm.put("%", new PercentageOperator());
		hm.put("^", new PowerOperator());
		hm.put("!", new FactorialOperator());

		return hm;
		
	}
}

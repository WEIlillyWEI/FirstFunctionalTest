package newCalculator;

import java.util.Stack;

public class StackCalculatorNew {
	
	public double calculate(String str) throws Exception {
		double result = -1;
		Stack<Double> stack = new Stack<Double>();
		if(str.trim().length()==0){
			throw new Exception("empty expression");
		}

		try{
			String[] stdIn = str.split(",");

			for (String s : stdIn) {
				if(isBinary(s)){
					BinaryOperator myOperator= (BinaryOperator)OperatorFactory.getOperator().get(s);
					double secondNum = stack.pop();
					double firstNum = stack.pop();
					stack.push(myOperator.calculate(firstNum,secondNum));	
				}
				else if(isUnary(s)){
					UnaryOperator myOperator= (UnaryOperator)OperatorFactory.getOperator().get(s);
					double firstNum = stack.pop();
					stack.push(myOperator.calculate(firstNum));
				}
				else{
					stack.push(Double.valueOf(s));
				}
			}
		}catch(Exception e){
			throw new Exception("invalid expression");
		}
		
		try{
			result = 1.0*Math.round(stack.pop()*100)/100;
		}
		catch(Exception e){
			throw new Exception("invalid expression");
		}

		if(!stack.empty()){
			throw new Exception("invalid expression");
		}

		System.out.println(result);
		return result;
	}
	
	private boolean isBinary(String s){

		return "+-*/^".contains(s);
	}
	
	private boolean isUnary(String s){
		return "%!".contains(s);
	}
}

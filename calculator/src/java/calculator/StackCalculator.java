import java.util.Stack;

public class StackCalculator {

    public double calculate(String str) throws Exception {
        double result = -1;
        Stack<Double> stack = new Stack<Double>();
        String[] stdIn = str.split(",");
        if(stdIn.length==0){
            throw new Exception("invalid expression");
        }
        for (String s : stdIn) {
            switch (s) {
                case "+":
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "-":
                    stack.push(-stack.pop() + stack.pop());
                    break;
                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break;
                case "^":
                    double a = stack.pop();
                    stack.push(Math.pow(stack.pop(),a));
                    break;
                case "%":
                    stack.push(stack.pop()/100);
                    break;
                case "!":
                    a = stack.pop();
                    double b = a;
                    while(a>1){
                        a = a-1;
                        b = b*a;
                    }
                    stack.push(b);
                    break;
                case "/":
                    a = stack.pop();
                    stack.push(stack.pop() / a);
                    break;
                default:
                    stack.push(Double.valueOf(s));
                    break;
            }
        }

        result = 1.0*Math.round(stack.pop()*100)/100;
        if(!stack.empty()){
            throw new Exception("invalid expression");
        }

        System.out.println(result);
        return result;
    }
}
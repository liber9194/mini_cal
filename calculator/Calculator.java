package week03.calculator;

public class Calculator {

    AbstractOperation operation;
    String op = "";
    public double calculate(int firstNumber,int secondNumber) {
        double result = 0.0;
        int firstNum = firstNumber;
        int secondNum = secondNumber;

        if (op.equals("+")){
            operation = new AddOperation();
            result = operation.operate(firstNum,secondNum);
        }
        else if(op.equals("-")){
            operation = new SubstractOpeartion();
            result = operation.operate(firstNum,secondNum);
        }
        else if(op.equals("-")){
            operation = new MultiplyOperation();
            result = operation.operate(firstNum,secondNum);
        }
        else if(op.equals("/")){
            operation = new DivideOpeartion();
            result = operation.operate(firstNum,secondNum);
        }
        else{
            System.out.println("올바른 입력이 아닙니다.");
            return result;
        }

        return result;
    }


}

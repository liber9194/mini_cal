package week03.calculator;

public class AddOperation extends AbstractOperation{
    @Override
    public double operate(int firstNumber, int secondNumber) {
        return firstNumber+secondNumber;
    }
}

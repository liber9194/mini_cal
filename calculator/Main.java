package week03.calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculator cal = new Calculator();
        int num1 = scan.nextInt();
        String op = scan.next();
        int num2 = scan.nextInt();
        cal.op = op;

        double result = cal.calculate(num1,num2);
        System.out.println("계산 결과는 "+result+"입니다!");
    }
}

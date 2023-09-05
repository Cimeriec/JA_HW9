package example4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator sum = (a, b) -> a + b;
        Calculator sub = (a, b) -> a - b;
        Calculator div = (a, b) -> a / b;
        Calculator mul = (a, b) -> a * b;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first num: ");
        int a = in.nextInt();
        System.out.print("Enter second num: ");
        int b = in.nextInt();
        System.out.print("Enter operation sign (+, -, *, /): ");
        String sign = in.next();
        in.close();
        switch (sign) {
            case "+" -> System.out.println(a + "+" + b + "=" + sum.calculate(a, b));
            case "-" -> System.out.println(a + "-" + b + "=" + sub.calculate(a, b));
            case "*" -> System.out.println(a + "*" + b + "=" + mul.calculate(a, b));
            case "/" -> System.out.println((b == 0) ? "Divided by zero!!" : a + "-" + b + "=" + sub.calculate(a, b));
            default -> System.out.println("Invalid operation sign!!");
        }
    }
}

@FunctionalInterface
interface Calculator {
    int calculate(int a, int b);
}
package com.company;

public class Main {
    public static void main(String[] args) {

        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[2]);
        String op = args[1];
        System.out.println("Результат: " + calc(num1, op, num2));
    }




    private static int calc(int num1, String op, int num2){
        switch (op) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                if (num2 == 0){
                    System.out.println("На ноль делить нельзя!!");
                }else {
                    return num1 / num2;}
            case "%":
                if (num2 == 0){
                    System.out.println("Остаток от деления на ноль, ты серьёзно??");
                }else {
                    return num1 % num2;}
        }
        throw new IllegalArgumentException("Неизвестный оператор: " + op);
    }
}

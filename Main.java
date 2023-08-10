package Calc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Введите выражение двух целых чилел от 1 до 10 через пробелы ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        try{
        String result = calc(input);
        System.out.println(result);
    }catch (Exception e) {
            System.out.println("throws Exception //т.к. формат математической операции" +
                    " не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        }
        }
    public static String calc (String input) throws Exception {
        String[] inputSplit = input.split(" ");
        int result1 = 0;
        int a = Integer.parseInt(inputSplit[0]);
        int b = Integer.parseInt(inputSplit[2]);
        if (inputSplit.length != 3) {
            throw new Exception();
        }

        if (a <1 || a > 10 || b <1 || b >10 ){
            throw new Exception();
        }
        switch (inputSplit[1]){
            case "+":
                result1 = a + b;
                break;
            case "-":
                result1 = a - b;
                break;
            case "*":
                result1 = a * b;
                break;
            case "/":
                result1 = a / b;
                break;
            default:
                throw new Exception();
        }
        return "Ответ: "+ result1;
    }
}
package arr;

import java.util.ArrayList;
import java.util.Scanner;

public class Main01 {
    //Напишите функцию, которая принимает на вход ArrayList целых чисел и возвращает их сумму.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        System.out.println(" Я принимаю числа и возвращаю их сумму ");
        System.out.println(" напишите букву q как закончите с суммами  ");

        while (true){
            String q = sc.nextLine();
            if (q.equalsIgnoreCase("q")) {
                break;
            }

            try {
                int num = Integer.parseInt(q);
                nums.add(num);
            }catch (NumberFormatException e){
                System.out.println("Введите число правильно ");
            }

        }
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        System.out.println("Сумма чисел: " + sum);
    }
}

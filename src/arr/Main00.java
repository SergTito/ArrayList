package arr;

import java.util.ArrayList;
import java.util.Scanner;

public class Main00 {
    //Создайте программу, которая позволяет пользователю вводить числа с клавиатуры и сохранять их в ArrayList.
    // После ввода чисел, выведите их на экран.
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Введите числа (для завершении программы нажмите q )");

        while (true){
            String q = sc.nextLine();
            if (q.equalsIgnoreCase("q")){
                break;
            }

            try {
                int num = Integer.parseInt(q);
                list.add(num);
            }catch (NumberFormatException e){
                System.out.println("Неправильный ввод ");
            }
            System.out.println("Введенные числа ");
            for (int nums : list){
                System.out.println(nums);
            }
        }
    }
}

package arr;

import java.util.ArrayList;
import java.util.Scanner;

public class Main04 {
    //Создайте игру "Угадай число". Программа должна генерировать случайное число, а пользователь
    // должен угадать его. Каждая попытка пользователя сохраняется в ArrayList,
    // и после угадывания числа выводится история попыток.

    public static void main(String[] args) {
        System.out.println("программа загадала число ");
        int randomNumber = (int) (Math.random() * 50);
        ArrayList<Integer> tryingToGuessNumber = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("напиши число от 0 до 50");
        System.out.println("Если захочешь выйти из игрый введите любую букву");
        while (scanner.hasNextInt()) {

            int numberUser = scanner.nextInt();
            if (numberUser != randomNumber) {
                System.out.println("Ты не угадал попробуй еще раз ");
            } else {
                System.out.println("Ура ты угадал!!");
                break;
            }
            tryingToGuessNumber.add(numberUser);


        }

        System.out.println("Список попыток :");
        for (int trying : tryingToGuessNumber) {
            System.out.println(trying);
        }

        System.out.println("Программа загадала число " + randomNumber);

    }

}

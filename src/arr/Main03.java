package arr;

import java.util.ArrayList;
import java.util.Scanner;

public class Main03 {

    //Напишите программу, которая принимает на вход список имен и фамилий людей, сохраняет
    // их в ArrayList и выводит на экран только имена.

    public static void main(String[] args) {

        System.out.println("Данная программа принимает на вход список имен и фамилий людей, сохраняя" +
                " в ArrayList и выводит на экран только имена Напишите q как закончите ");
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> addNameAndSurname = new ArrayList<>();
        while (true) {

            System.out.print("Имя и Фамилия : ");
            String nameAndSurname = scanner.nextLine();


            if (nameAndSurname.equalsIgnoreCase("q")) {
                break;
            }
            addNameAndSurname.add(nameAndSurname);
        }
        System.out.println("Имена :");
        for (String split : addNameAndSurname) {
            String s[] = split.split(" ");
            String firstName = s[0];
            System.out.println(firstName);
        }
    }
}

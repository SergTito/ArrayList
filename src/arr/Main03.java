package arr;

import java.util.ArrayList;
import java.util.Scanner;

public class Main03 {

    //Write a program that accepts a list of names and surnames of people as input, saves
    // them in an ArrayList and displays only names on the screen.

    public static void main(String[] args) {

        System.out.println("This program accepts a list of names and surnames of people as input, saving the " +
                " in the ArrayList and displays only the names on the screen Write q as you finish");
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> addNameAndSurname = new ArrayList<>();
        while (true) {

            System.out.print("name and surname : ");
            String nameAndSurname = scanner.nextLine();


            if (nameAndSurname.equalsIgnoreCase("q")) {
                break;
            }
            addNameAndSurname.add(nameAndSurname);
        }
        System.out.println("Names :");
        for (String split : addNameAndSurname) {
            String s[] = split.split(" ");
            String firstName = s[0];
            System.out.println(firstName);
        }
    }
}

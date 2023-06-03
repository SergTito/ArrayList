package arr;

import java.util.ArrayList;
import java.util.Scanner;

public class Main00 {
    //Create a program that allows the user to enter numbers from the keyboard and save them in an ArrayList.
    // After entering the numbers, display them on the screen.
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter the numbers (to end the program, press q )");

        while (true){
            String q = sc.nextLine();
            if (q.equalsIgnoreCase("q")){
                break;
            }

            try {
                int num = Integer.parseInt(q);
                list.add(num);
            }catch (NumberFormatException e){
                System.out.println("Incorrect input ");
            }
            System.out.println("Entered numbers ");
            for (int nums : list){
                System.out.println(nums);
            }
        }
    }
}

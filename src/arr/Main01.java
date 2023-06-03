package arr;

import java.util.ArrayList;
import java.util.Scanner;

public class Main01 {
    //Write a function that takes an ArrayList of integers as input and returns their sum.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        System.out.println(" I accept the numbers and return their sum ");
        System.out.println(" write the letter q as soon as you finish with the sums  ");

        while (true){
            String q = sc.nextLine();
            if (q.equalsIgnoreCase("q")) {
                break;
            }

            try {
                int num = Integer.parseInt(q);
                nums.add(num);
            }catch (NumberFormatException e){
                System.out.println("Enter the number correctly ");
            }

        }
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        System.out.println("Sum of numbers: " + sum);
    }
}

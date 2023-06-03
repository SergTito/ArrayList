package arr;

import java.util.ArrayList;
import java.util.Scanner;

public class Main01 {
    //�������� �������, ������� ��������� �� ���� ArrayList ����� ����� � ���������� �� �����.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        System.out.println(" � �������� ����� � ��������� �� ����� ");
        System.out.println(" �������� ����� q ��� ��������� � �������  ");

        while (true){
            String q = sc.nextLine();
            if (q.equalsIgnoreCase("q")) {
                break;
            }

            try {
                int num = Integer.parseInt(q);
                nums.add(num);
            }catch (NumberFormatException e){
                System.out.println("������� ����� ��������� ");
            }

        }
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        System.out.println("����� �����: " + sum);
    }
}

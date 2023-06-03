package arr;

import java.util.ArrayList;
import java.util.Scanner;

public class Main00 {
    //�������� ���������, ������� ��������� ������������ ������� ����� � ���������� � ��������� �� � ArrayList.
    // ����� ����� �����, �������� �� �� �����.
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("������� ����� (��� ���������� ��������� ������� q )");

        while (true){
            String q = sc.nextLine();
            if (q.equalsIgnoreCase("q")){
                break;
            }

            try {
                int num = Integer.parseInt(q);
                list.add(num);
            }catch (NumberFormatException e){
                System.out.println("������������ ���� ");
            }
            System.out.println("��������� ����� ");
            for (int nums : list){
                System.out.println(nums);
            }
        }
    }
}

package arr;

import java.util.ArrayList;
import java.util.Scanner;

public class Main04 {
    //�������� ���� "������ �����". ��������� ������ ������������ ��������� �����, � ������������
    // ������ ������� ���. ������ ������� ������������ ����������� � ArrayList,
    // � ����� ���������� ����� ��������� ������� �������.

    public static void main(String[] args) {
        System.out.println("��������� �������� ����� ");
        int randomNumber = (int) (Math.random() * 50);
        ArrayList<Integer> tryingToGuessNumber = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("������ ����� �� 0 �� 50");
        System.out.println("���� �������� ����� �� ����� ������� ����� �����");
        while (scanner.hasNextInt()) {

            int numberUser = scanner.nextInt();
            if (numberUser != randomNumber) {
                System.out.println("�� �� ������ �������� ��� ��� ");
            } else {
                System.out.println("��� �� ������!!");
                break;
            }
            tryingToGuessNumber.add(numberUser);


        }

        System.out.println("������ ������� :");
        for (int trying : tryingToGuessNumber) {
            System.out.println(trying);
        }

        System.out.println("��������� �������� ����� " + randomNumber);

    }

}

package arr;

import java.util.ArrayList;
import java.util.Scanner;

public class Main03 {

    //�������� ���������, ������� ��������� �� ���� ������ ���� � ������� �����, ���������
    // �� � ArrayList � ������� �� ����� ������ �����.

    public static void main(String[] args) {

        System.out.println("������ ��������� ��������� �� ���� ������ ���� � ������� �����, ��������" +
                " � ArrayList � ������� �� ����� ������ ����� �������� q ��� ��������� ");
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> addNameAndSurname = new ArrayList<>();
        while (true) {

            System.out.print("��� � ������� : ");
            String nameAndSurname = scanner.nextLine();


            if (nameAndSurname.equalsIgnoreCase("q")) {
                break;
            }
            addNameAndSurname.add(nameAndSurname);
        }
        System.out.println("����� :");
        for (String split : addNameAndSurname) {
            String s[] = split.split(" ");
            String firstName = s[0];
            System.out.println(firstName);
        }
    }
}

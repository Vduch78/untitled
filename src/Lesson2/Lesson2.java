package Lesson2;

import java.util.Arrays;

public class Lesson2 {
    public static void main(String[] args) {
        String text = "���� ����� ����\n";

        //� ������ �������
        text = text.toLowerCase();

        //� ������� �������
        String newText = text.toUpperCase();

        //������ ������
        String oleg = text.replaceAll("����", "����");

        //��������� ������ n ���
        String repeatedText = text.repeat(10);

        //���������� �������� ������
        String newTextForMe = "��� �����" + '\n' + "������ �����";

        //�������� ������ �� ������� char
        char[] letters = new char[]{'v','o','d','k','a'};
        String charText = String.valueOf(letters);

        //��������� (���������� �� ��������)
        int number = 10;
        int number2 = number;

        number = 11;
        System.out.println(number);
        System.out.println(number2);

        //��������� ���� ������ (���������� �� ������)
        int[] numbers = new int[]{1, 2, 3, 4};
        int[] numbers2 = numbers;
        numbers2[0] = 10;

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(numbers2));



    }
}
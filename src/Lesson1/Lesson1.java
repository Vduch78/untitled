package Lesson1;

public class Lesson1 {
    public static void main(String[] args) {
        System.out.println("hello world!");

        //���������
        //�������� �� ��� ����
        //true - ��, false - ���
        boolean answer = false;
        boolean myAnswer = true;
        System.out.println("�������� �� ��� ����?");
        System.out.println(answer);

        //�� ����� 128 �� 128
        byte bt = -128;

        //������ �������� -32765 �� 32767
        short sh = 32_767;

        //�������� �� -2 147 483 648 �� 2 147 483 649
        int number = 32_767;

        //�������� �� 2 � 64 �������
        long ln = 8_000_000_000L;

        //����� � ��������� ������
        float fl = 3.123456789012345f;
        //������ ������ ����� �������
        double db = 3.1234567890123456789;

        //��� ��������
        int number1 = 10;
        double number2 = 3;
        double result = number1 / number2;
        double result2 = number1 - number2;
        double result3 = number1 + number2;
        double result4 = (number1 * number2) * 2;

        //�������
        char ch = 105 + 1;
        System.out.println(ch);

        //�������
        //������ �����
        int[] array = new int[5];
        array[0] = 10;
        System.out.println(array);

        //������ ��������
        char[] arrayChar = new char[5];
        arrayChar[0] = '�';
        arrayChar[1] = '�';
        arrayChar[2] = '�';
        arrayChar[3] = '�';
        arrayChar[4] = '�';
        System.out.println(arrayChar);

        //�������� ������ ���������� �������
        char[] newArray = new char[]{'�', '�', '�', '�', '�'};

        //�����
        String vodka = "����� 100";
        System.out.println(vodka);
        String forChapaev = " ��� �������";

        //������������ (���������� ���� ����� � ����)
        String resultChapaev = vodka + forChapaev;
        System.out.println(resultChapaev);

        //������������ ����� ������ � ������� ������ ������, �������� String + double. ��������� String
        System.out.println("����������: " + 3.12);
    }
}
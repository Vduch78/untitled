import static java.lang.System.out;

public class homework1 {
    public static void main(String[] args) {
        String hi = "                Hello ";
        String world = " WoRld!";
        char newLine = '\n';
        //Создать из трех переменных единую строку,
        //Привести к правильному виду (Ниже) используя String.trim()
        //затроить (Можно вызвать тольку одну команду System.out.println())
        //
        //Результат вывода на экран:
        //Hello world!
        //Hello world!
        //Hello world!
        hi = hi.trim();
        String result = hi + world + newLine;
        result = result.replace("R","r");
        String repResult = result.repeat(3);
        out.println(repResult);

        //Создать переменные с ростом (!в метрах), весом в кило.
        //Произвести расчет индекса массы тела (вес) / (рост * рост) используя переменные, вывести на экран
        //Пример результата вывода на экран:
        //21.0345645
        float h = 1.77f;
        byte w = 71;
        float imt = w/(h*h);
        out.println(imt);

        //Задача №3
        //Создать из массива букв a,b,c,d,e, строку,вывести на экран , поменять в массиве 4 букву по счету на h,
        //и снова создать строку, вывести на экран
        //Ожидаемый результат:
        //abcde
        //abche}
        out.println(newLine);
        char[] fiveLetters = new char[]{'a','b','c','d','e'};
        out.println(fiveLetters);
        fiveLetters[3] = 'h';
        out.println(fiveLetters);

        //Продвинутый уровень
        //Задача №1
        //Произвести преобразование текста "234" в число типа int и прибавить к этому числу длину строки "some_text"
        String str = "234";
        String str2 = "some_text";
        int nmb = Integer.parseInt (str);
        nmb = nmb + (str2.length());
        out.println(nmb);

        //Задача №2
        //Посчитать (a+b)^2 = ?, при a=3, b=5
        byte a = 3;
        byte b = 5;
        int result2 = (int) Math.pow((a + b), 2);
        out.println(result2);

        //Задача №3
        //Создать два массив чисел:
        // 1,2,5,7,10
        // 2,3,2,17,15
        // Создать массив чисел, в котором будут: все числа из этих двух массивов,
        // и результат умножения чисел с одинаковым порядковым номером
        int[] m1 = new int[] {1, 2, 5, 7, 10};
        int[] m2 = new int[] {2, 3, 2, 17, 15};
        int[] m3 = new int[5] ;
        m3 [0] = m1[0] * m2[0];
        m3 [1] = m1[1] * m2[1];
        m3 [2] = m1[2] * m2[2];
        m3 [3] = m1[3] * m2[3];
        m3 [4] = m1[4] * m2[4];
        //Ожидаемый результат:
        //1,2,5,7,10,2,3,2,17,15,2,6,10,119,150
        //(первый массив - 1,2,5,7,10), (второй массив - 2,3,2,17,15),
        //(результат перемножения - (1*2), (2*3), (5*2), (7*17), (10*15)

        //Задача №4
        //В слове "Hello world!" заменить l на r, сделать все буквы заглавными, выбрать первые 8 символов, вывести на экран
        String text  = "Hello world!";
        String text2 = text.replaceAll("l","r");
        System.out.println(text2.substring(0,8));


    }}
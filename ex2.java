package FirstHomeWork;

public class ex2
{
    public static void main(String[] args)
    {
        //2ое задание
        int i = 100500;
        short s = -2020;
        byte by = (byte) 29;
        long l = 29082020l;
        float f = 0.123f;
        double db = -123.45d;
        boolean  bol = true;
        char ch = 'I';

        //3-е
        System.out.println("Задание № 3");
        int a=5, b=11,c=8,d=2;
        System.out.println(a +" * (" + b+" + ("+c+" / "+d+")) = " + sum(a,b,c,d));

        //4-ое
        System.out.println();
        System.out.println("Задание № 4");
        System.out.println(  amount(5,11));

        //5-ое
        System.out.println();
        System.out.println("Задание № 5");
        comparison(50);

        //6-ое
        System.out.println();
        System.out.println("Задание № 6");
        System.out.println (comparison6(-50));

        //7-ое
        System.out.println();
        System.out.println("Задание № 7");
        printHello("Andrey");

        //8-ое
        System.out.println();
        System.out.println("Задание № 8");
        year(2300);
        year(2000);
    }


    //3-е задание
    static  float sum (int a,int b, int c, int d)
    {
        return (a * (b + (c / d)));
    }

    //4-ое задание
    static  boolean amount(int firstNumber, int secondNumber)
    {
        int sum=firstNumber+secondNumber;
        if (sum>=10 && sum<=20)
            return true;
        else    return  false;
    }

    // 5-ое задание
    static void comparison (int number)
    {
        if ( number>=0)
            System.out.println( number +" - положительное число, либо равно 0 "  );
        else
            System.out.println( number + "  - отрицательное число" );
    }

    //6-ое задание
    static   boolean comparison6 (int number)
    {
        if (number < 0) return true;
        else return false;
    }

    //7-ое задание
    static void  printHello(String name)
    {
        System.out.println("Hello  " + name);
    }


    //8-ое задание
    static void year(int y)
    {
        if ((y % 400 == 0) || ((y % 4 == 0) && (y % 100 != 0)))
            System.out.println(y +" - високосный год  ");
        else System.out.println(y +" - невисокосный год ");

    }

}

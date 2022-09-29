package task3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class task3 {

    private static void printTable(int a,int b,double h){
        System.out.println("============================");
        System.out.printf("|%10s|%10s|\n", "X =    ", "    F(X) =     ");
        System.out.println("============================");

        double current = a;
        double tan = 0;
        while (current<=b){
            tan=Math.tan(current);
            System.out.printf("|%10.2f|%15.2f|\n", current, tan);
            System.out.println("============================");
            current=current+h;
        }
    }
    public static void main(String[] agv){
        try {
            Scanner in = new Scanner(System.in);
            System.out.print("Введите начальное значение отрезка: ");
            int a = in.nextInt();
            System.out.print("Введите конечное значение отрезка: ");
            int b = in.nextInt();
            System.out.print("Введите шаг: ");
            double h = in.nextDouble();
            in.close();

            printTable(a,b,h);
        }
        catch (InputMismatchException i){
            System.out.println("Некорректный ввод! Ведите действительное значение.");
        }
    }
}

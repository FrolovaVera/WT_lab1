package task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class task2 {
    private static boolean checkLowerRegion (double x, double y){
        final double X_LEFT = -6.0;
        final double Y_UPPER = 0.0;
        final double X_RIGHT = 6.0;
        final double Y_LOWER = -3.0;

        return (x >= X_LEFT) && (x <= X_RIGHT) && (y <= Y_UPPER) && (y >= Y_LOWER);
    }

    private static boolean checkUpperRegion (double x, double y){
        final double X_LEFT = -4.0;
        final double Y_UPPER = 5.0;
        final double X_RIGHT = 4.0;
        final double Y_LOWER = 0.0;

        return (x >= X_LEFT) && (x <= X_RIGHT) && (y <= Y_UPPER) && (y >= Y_LOWER);
    }
    private static boolean checkRegion (double x, double y){
    return checkUpperRegion(x,y)||checkLowerRegion(x,y);
    }

    public static void main(String[] agv){
        try {
            Scanner in = new Scanner(System.in);
            System.out.print("Введите первое действительное число: ");
            double x = in.nextDouble();
            System.out.print("Введите второе действительное число: ");
            double y = in.nextDouble();
            in.close();

            System.out.println("Ответ: "+ checkRegion(x,y));
        }
        catch (InputMismatchException i){
            System.out.println("Некорректный ввод! Ведите действительное значение.");
        }
    }
}

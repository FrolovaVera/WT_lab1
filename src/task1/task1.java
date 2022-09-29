package task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class task1 {

    private static double calculateNumerator(double x, double y){
        double sum = x + y;
        return 1 + Math.sin(sum) * Math.sin(sum);
    }
    private static double calculateDenominator(double x, double y){
         double numerator = 2 * x;
         double denominator = 1 + x * x*y*y;
         return 2 + Math.abs(x-numerator/denominator);
    }
    private static double calculateExpression(double x, double y){
        double numerator =calculateNumerator(x,y);
        double denominator =calculateDenominator(x,y);
        return numerator/denominator + x;
    }

    public static void main(String[] agv){
        try {
            Scanner in = new Scanner(System.in);
            System.out.print("Введите первое действительное число: ");
            double x = in.nextDouble();
            System.out.print("Введите второе действительное число: ");
            double y = in.nextDouble();
            in.close();

            System.out.println("F(x,y) = "+ calculateExpression(x,y));
        }
        catch (InputMismatchException i){
            System.out.println("Некорректный ввод! Ведите действительное значение.");
        }
    }
}

package task4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class task4 {
    private static void printMassive(int N,int[] massive){
        for (int i=0;i<N; ++i){
            System.out.print(massive[i]+" ");
        }
        System.out.println(" ");
    }
    private static void printPrimeNumber(int N,int[] massive){
        for (int i=0;i<N; ++i){
            if(checkPrime(massive[i])==true){
                System.out.print(massive[i] +" ");
            }
        }
    }
    private static boolean checkPrime(int x){
        if (x == 1) return false;
        if (x == 2) return false;


        for (long i = 2; i <= Math.round(Math.sqrt(x)); ++i)
            if (x % i == 0) return false;

        return true;

    }
    public static void main(String[] agv){
        try {
            Scanner in = new Scanner(System.in);
            System.out.print("Введите размер массива: ");
            int N = in.nextInt();
            int[] massive = new int[N];
            for(int i=0; i<N; ++i){
                System.out.print(i +": ");
                massive[i] = in.nextInt();
            }

            printMassive(N,massive);
            printPrimeNumber(N,massive);
            in.close();
        }
        catch (InputMismatchException i){
            System.out.println("Некорректный ввод! Ведите действительное значение.");
        }
    }
}

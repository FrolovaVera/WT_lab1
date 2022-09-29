package task7;

import java.util.InputMismatchException;
import java.util.Scanner;



public class task7 {
    private  static void printMasssive(int[] massive){
        for (int i=0;i<massive.length;++i){
                System.out.print(massive[i] +" ");
        }
        System.out.println();
    }

    private static void sortMassive (int[] massive){
        for (int i = 1; i < massive.length; ++i){
            int temp = massive[i];
            int in = i;

            while (in >= 1 && massive[in - 1] >= temp){
                massive[in] = massive[in - 1];
                in -= 1;
            }
            massive[in] = temp;
            printMasssive(massive);
        }
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
            sortMassive(massive);
            in.close();
        }
        catch (InputMismatchException i){
            System.out.println("Некорректный ввод! Ведите действительное значение.");
        }
    }

}

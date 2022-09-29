package task6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class task6 {
    private  static void printMatrix(int[][] matrix,int N){
        for (int i=0;i<N;++i){
            for(int j=0;j<N;++j){
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] agv){
        try {
            Scanner in = new Scanner(System.in);
            System.out.print("Введите размер массива: ");
            int N = in.nextInt();
            int[][] massive = new int[N][N];
            for(int i=0; i<N; ++i){
                for(int j=0; j<N; ++j) {
                    System.out.print(i +","+ j + ": ");
                    massive[i][j] = in.nextInt();
                }
            }
            printMatrix(massive,N);
            in.close();
        }
        catch (InputMismatchException i){
            System.out.println("Некорректный ввод! Ведите действительное значение.");
        }
    }
}

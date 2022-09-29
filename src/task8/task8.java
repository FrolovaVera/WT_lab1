package task8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class task8 {
    private  static void printMasssive(int[] massive){
        for (int i=0;i<massive.length;++i){
            System.out.print(massive[i] +" ");
        }
        System.out.println();
    }
    private static void message(int to, int from){
        System.out.println("Необходимо поставить элемент B[" + (from) +"] в позицию A[" + to + "].");
    }
    private static void merger(int[] a,int[] b){
        int[] massiveC =new int[a.length+b.length];
        int id=0; int k=0; int i=0;
        while(i<a.length || id<b.length){
            if(id<b.length && i<a.length && a[i]>=b[id]){

                message(i,id);
                massiveC[k]=b[id];
                id=id+1; k=k+1;

            }else{

                massiveC[k]=a[i];
                k=k+1; i=i+1;

            }
        }
        printMasssive(massiveC);
    }

    public static void main(String[] agv){
        try {
            Scanner in = new Scanner(System.in);
            System.out.print("Введите размер массива A: ");
            int N = in.nextInt();
            int[] massiveA = new int[N];

            System.out.print("Введите размер массива B: ");
            int M = in.nextInt();
            int[] massiveB = new int[M];

            System.out.print("Введите значения для массива А: ");
            System.out.println();
            for(int i=0; i<N; ++i){
                System.out.print(i +": ");
                massiveA[i] = in.nextInt();
            }
            System.out.println();

            System.out.print("Введите значения для массива В : ");
            System.out.println();
            for(int i=0; i<M; ++i){
                System.out.print(i +": ");
                massiveB[i] = in.nextInt();
            }
            printMasssive(massiveA);
            printMasssive(massiveB);
            merger(massiveA,massiveB);
            in.close();
        }
        catch (InputMismatchException i){
            System.out.println("Некорректный ввод! Ведите действительное значение.");
        }
    }
}

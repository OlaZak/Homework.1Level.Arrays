
import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter size of array");
//        int size = sc.nextInt();
//        System.out.println("Enter size of filler");
//        int filler = sc.nextInt();
//        int []array = new int[size];
//        Task1 ex1 = new Task1();
//        ex1.fill(array,filler);


//        int [] arr = {-8,-9,34,8,-5,5,-2};
//        Task2 ex2 = new Task2();
//        ex2.sum(arr);

//          int [] arr = {-4,-7,8,-8,-6,9};
//          Task3 ex3 = new Task3();
//          int indexf=0,indexl=0;
//          indexf = ex3.findFirstPositive(arr);
//          System.out.println("Index of first positive index "+indexf);
//          indexl =ex3.findLastPositive(arr);
//          System.out.println("Index of last positive value " + indexl);


//          Scanner sc = new Scanner(System.in);
//          System.out.println("Enter size of array");
//          int size = sc.nextInt();
//          int[] array = new int[size];
//          for (int i = 0; i < array.length; i++){
//          array[i] = (int) (Math.random() * 40 - 20);
//          System.out.print(array[i] + " ");}
//          System.out.println();
//          Task4 ex4 = new Task4();
//          int counter;
//          counter=ex4.countPositives(array);
//          System.out.println("Numbers of positive value in array:" + counter);


//        Task5 ex5 = new Task5();
//        int array[];
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please enter the size of array:");
//        int size = sc.nextInt();
//        array = ex5.createSequenceArray(size);
//        if (size < 0) {
//            throw new IllegalArgumentException("Element of array is < 0");
//        } else
//            System.out.println(Arrays.toString(array));


//        Task6 ex6 = new Task6();
//        int[][] matrix = {{1, 6}, {4, 8}};
//        ex6.printMatrix(matrix);

//        int[][] matrix = {{0, 3, -2}, {2, 1, 3}, {-1, 5, 2}};
//        Task7 ex7 = new Task7();
//        double result;
//        result = ex7.calculateAverage(matrix);
//        System.out.println(result);

//        Task8 ex8 = new Task8();
//        int index;
//        int[][] matrix = {{3, -1, 4},
//                          {9, 1, -2},
//                          {-1, 60, 1}};
//        index = ex8.findMaxSumRow(matrix);
//        System.out.println(index);


        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8}};
        Task9 ex9 = new Task9();
        int [][]resultMatrix;
        resultMatrix=ex9.findMaxSumRow(matrix);
        for(int [] array : resultMatrix){
            System.out.println(Arrays.toString(array));}


//            int[][] matrix = {
//                    {1, 0, 0},
//                    {0, 1, 0},
//                    {0, 0, 1}};
//            Task10 ex10 = new Task10();
//            boolean result;
//            result = ex10.isIdentity(matrix);
//            System.out.println(result);


        }
    }



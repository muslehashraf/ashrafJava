package homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Homework15 {
    public static void main(String[] args) {

        System.out.println("----------Task-1----------");
        int task1D1 = 3;
        int task1D2 = 5;
        int task1D3 = 7;
        System.out.println(Arrays.toString(fibonacciSeries1(task1D1)));
        System.out.println(Arrays.toString(fibonacciSeries1(task1D2)));
        System.out.println(Arrays.toString(fibonacciSeries1(task1D3)));

        System.out.println("\n----------Task-2----------");
        int task2D1 = 2;
        int task2D2 = 4;
        int task2D3 = 8;
        System.out.println(fibonacciSeries2(task2D1));
        System.out.println(fibonacciSeries2(task2D2));
        System.out.println(fibonacciSeries2(task2D3));

        System.out.println("\n----------Task-3----------");
        int[] task3D1_1 = {};
        int[] task3D1_2 = {};
        int[] task3D2_1 = {};
        int[] task3D2_2 = {1, 2, 3, 2};
        int[] task3D3_1 = {1, 2, 3, 4};
        int[] task3D3_2 = {3, 4, 5, 5};
        int[] task3D4_1 = {8, 9};
        int[] task3D4_2 = {9, 8, 9};
        System.out.println(Arrays.toString(findUniques(task3D1_1, task3D1_2)));
        System.out.println(Arrays.toString(findUniques(task3D2_1, task3D2_2)));
        System.out.println(Arrays.toString(findUniques(task3D3_1, task3D3_2)));
        System.out.println(Arrays.toString(findUniques(task3D4_1, task3D4_2)));

        System.out.println("\n----------Task-4----------");
        int task4D1 = 1;
        int task4D2 = 2;
        int task4D3 = 3;
        int task4D4 = 81;
        System.out.println(isPowerOf3(task4D1));
        System.out.println(isPowerOf3(task4D2));
        System.out.println(isPowerOf3(task4D3));
        System.out.println(isPowerOf3(task4D4));

        System.out.println("\n----------Task-5----------");
        int[] task5D1 = {};
        int[] task5D2 = {1};
        int[] task5D3 = {1, 2, 2, 3};
        int[] task5D4 = {1, 2, 3, 3, 4, 1};
        System.out.println(firstDuplicate(task5D1));
        System.out.println(firstDuplicate(task5D2));
        System.out.println(firstDuplicate(task5D3));
        System.out.println(firstDuplicate(task5D4));


    }

    public static int[] fibonacciSeries1(int n) {
        int[] fib = new int[n];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib;
    }

    public static int fibonacciSeries2(int n) {
        if (n <= 0) return 0;
        if (n <= 2) return 1;
        int a = 0, b = 1, c = 0;
        for (int i = 2; i < n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    public static int[] findUniques(int[] arr1, int[] arr2){
        ArrayList<Integer> al = new ArrayList<>();
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for (int i : arr1) {
            set1.add(i);
        }

        for (int i : arr2) {
            set2.add(i);
        }

        for (Integer i : set1) {
            if(!set2.contains(i) && !al.contains(i)) al.add(i);
        }
        for (Integer i : set2) {
            if(!set1.contains(i) && !al.contains(i)) al.add(i);
        }

        int[] answer = new int[al.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = al.get(i);
        }
        return answer;
    }

    public static boolean isPowerOf3(int n){//243
        int power = 0;
        for (int i = 0; n > power; i++) {
            power = (int)Math.pow(3,i);//9
            if(power == n) return true;
        }
        return false;

    }

    public static int firstDuplicate(int[] arr){
        int dup = -1;
        int index = arr.length-1;

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] == arr[j] && j<=index){
                    dup = arr[i];
                    index = j;
                }

            }
        }

        return dup;
    }

}



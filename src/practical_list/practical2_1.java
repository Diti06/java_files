package practical_list;

    //2.1.Write a program for sorting an elements in array,
// and enter elements by command line argument.

import java.util.Arrays;
import java.util.stream.*;
import java.util.Scanner;
    public class practical2_1{
        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            System.out.println("enter the number of elements you want to sort");
            int i= sc.nextInt();
            int[] arr= new int[i];
            System.out.println("Enter the elements");
            for(int z=0;z<arr.length;z++){
                arr[z]= sc.nextInt();
            }
            for(int y=0;y<arr.length;y++) {
                for (int r = 0; r < arr.length-1; r++) {
                    if(arr[r] >arr[r + 1]) {
                        int temp;
                        temp = arr[r];
                        arr[r] = arr[r + 1];
                        arr[r + 1] = temp;
                    }
                }
            }
            int[] array= new int[i];

            System.out.println("the sorted array is "+ Arrays.toString(arr));

        }
    }


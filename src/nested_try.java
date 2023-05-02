//write a java program program that allow user to keep accessing an
//        array until valid index is given by the user


import java.util.*;
public class nested_try {
    public static void main(String[] args) {
        boolean flag=true;
        int[] a = new int[3];
        a[0]=56;
        a[1]=6;
        a[2]=50;
        Scanner sc = new Scanner(System.in);

        while(flag) {
            try {
                System.out.println("you are in first try block");
                try{
                    System.out.println("you are in second try block");
                    System.out.println("enter the index you want to access");
                    int b = sc.nextInt();
                    System.out.println("the value at given index is"+a[b]);
                    flag=false;
                }

                catch(ArithmeticException e) {
                    System.out.println("you have entered invalid index");
                    System.out.println(e);
                }
            }
            catch(Exception e){
                System.out.println("some unknown error occured");
                System.out.println("");
            }
        }
    }
}

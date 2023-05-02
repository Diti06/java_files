//2.3. Write a Program to print:
//        0
//        1 2
//        3 4 5
//        6 7 8 9
//       Using two dimension array.
package practical_list;
import java.util.Arrays;
import java.util.Scanner;
class practical23{
    public static void main(String[] args) {
        System.out.println("enter the number of columns you want");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int r=0;
        int[][] a= new int[n][n];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(j>i){
                    break;
                }
                else{
                    System.out.print(r+" ");
                    r++;
                }
            }
            System.out.println();
        }
    }
}
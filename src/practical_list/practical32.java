//3.2.Do above program using constructor overloading.
package practical_list;
import java.util.Arrays;
import java.util.Scanner;
class area{
    public  area(int l, int b){
        System.out.println("the area of rectangle is "+l*b);
    }
    public  area(int l){
        System.out.println("the area of square is "+l*l);
    }
}
class practical32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1 to find the area of reactangle and 0 to find the area of square");
        int i = sc.nextInt();
        if (i == 1) {
            System.out.println("enter the values of length and breadth");
            int l= sc.nextInt();
            int b= sc.nextInt();
            area rect = new area(l, b);

        }
        else if (i == 0) {
            System.out.println("enter the value of side of square");
            int s= sc.nextInt();
            area square = new area(s);
        }
        else{
            System.out.println("the number entered is invalid");
        }
    }
}
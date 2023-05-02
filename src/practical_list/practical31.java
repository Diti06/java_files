//Write a program to perform method overloading
//        of area method to find area of rectangle and square
package practical_list;
import java.util.Arrays;
import java.util.Scanner;
class method
{

}
class practical31{
    public static long area(int l,int b){
        System.out.println("the area of rectangle is "+(l*b));
        return l*b;
    }
    public static long area(int l){
        System.out.println("the area of square is "+(l*l));
        return l*l;
    }
    public static long area(){
        System.out.println("there is no arguement");
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter 1 to find the area of reactangle and 0 to find the area of square");
       int i= sc.nextInt();
       if(i==1) {
           System.out.println("enter the values of length and width to find the area");
           int l = sc.nextInt();
           int b = sc.nextInt();
           long areaOfRecatangle = area(l, b);
       }
       else if(i==0){
           System.out.println("enter the value of length");
           int x= sc.nextInt();
           long areaOfSquare= area(x);
       }
       else{
           System.out.println("invalid number");
       }
    }
}
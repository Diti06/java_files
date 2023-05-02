//1.3. Write a program that reads a number in meters, converts it to feet, and displays the result.
package practical_list;
import java.util.Scanner;
class practical3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number in meters");
        float x= sc.nextFloat();
        float y= (float)0.304*x;
        System.out.println("conversion of meter to feet is"+" "+y);
    }
}
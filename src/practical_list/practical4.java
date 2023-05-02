//Write a program that prompts the user to enter three integers and display the integers in decreasing order.

package practical_list;
import java.util.Scanner;
class practical4{
    public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
        System.out.println("Enter three integers");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        System.out.println("the descending order of given integers is");
        if(a>b&&a>c){
            System.out.println(+a);
            if(b>c){
                System.out.println(+b);
                System.out.println(+c);
            }
            else{
                System.out.println(+c);
                System.out.println(+b);
            }
        }
        else if(b>a&&b>c){
            System.out.println(+b);
            if(a>c){
                System.out.println(+a);
                System.out.println(+c);
            }
            else{
                System.out.println(+c);
                System.out.println(+a);
            }
        }
        else{
            System.out.println(+c);
            if(a>b){
                System.out.println(+a);
                System.out.println(+b);
            }
            else{
                System.out.println(+b);
                System.out.println(+a);
            }
        }

    }
}
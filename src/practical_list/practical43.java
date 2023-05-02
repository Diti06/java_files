//write a program that has abstract class dim which has a two variable dim1,dim2.
//        triangle and rectangle are subclass of dim.
//        implement dynamic method dispatch by creating reference of dim.\
package practical_list;
import java.util.Arrays;
import java.util.Scanner;

abstract class dim{
    int dim1;
    int dim2;
    abstract void area(int a, int b);

}
class triangle extends dim{
     triangle(int a, int b){
         dim1=a;
         dim2=b;
     }
     @Override
     public void area(int a ,int b){
         float area= (float)0.5*dim1*dim2;
         System.out.println("the area of triangle is"+area);
     }


}
class rectangle extends dim{


    rectangle(int a , int b){
        dim1=a;
        dim2=b;
    }
    @Override
    public void area(int a , int b){
        float area=(float)a*b;
        System.out.println("the area of rectangle is "+area);
    }
}
public class practical43{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the 1 for triangle and 2 for rectangle");
        int d1= sc.nextInt();
        switch(d1) {
            case 1:
                System.out.println("enter the values of length and height respectively");
                int l = sc.nextInt();
                int h = sc.nextInt();
                triangle ob1 = new triangle(l, h);
                ob1.area(l,h);
                break;

            case 2:
                System.out.println("enter the values of length and breadth respectively");
                int c = sc.nextInt();
                int e = sc.nextInt();
                rectangle ob2 = new rectangle(c,e);
                ob2.area(c,e);
                break;
            default:
                System.out.println("enter valid number");
                break;
        }
    }
}
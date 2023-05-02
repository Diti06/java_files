package scratches;
import java.io.*;
import java.util.*;
import java.lang.*;
public class custom_class{
    public static void main(String[] args) {
        System.out.println("this is a custom class");
        Employee emp = new Employee();
        emp.id = 1;
        emp.name = "Diti";
        System.out.println(emp.name);
        emp.printDetails();
        Employee emp2 = new Employee();
        emp2.id = 2;
        emp2.name= "himanshu";
        emp2.printDetails();


    }
}
class Employee{
    int id;
   java.lang.String name = "Diti";
   public void printDetails(){
       System.out.println("my id is" + id);
       System.out.println("and my name is" + name);
   }
}
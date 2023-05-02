//write a program that create following : a inherited by b ,b inherited by c and c is inherited by d.
//        a has one variable b has two and c has 3 variables.
//        Use constructor and super to initialized the variables of classes.

package practical_list;
import java.util.Arrays;
import java.util.Scanner;
 class a {
    a(int q){
    int p=10;
    System.out.println("the default value is"+p);
        System.out.println("1st line= "+q);
    }
}
class b extends a{
  public  int e;
    b(int r, int s) {
        super(r);
      e=r+s;
        System.out.println("2nd line="+e);
    }
}
class c extends b{
  public  int f;
    c(int t, int u, int v) {
        super(t,u);
        f=t+u+v;
        System.out.println("3rd line= "+f);
    }
}
class d extends c{
    public int g;
     d(int w,int x,int y,int z) {
         super(w, x, y);
         g = w + x + y + z;
         System.out.println("4th line" + g);
     }
          static void display(){
              System.out.println("hello world");

         }
     }


class practical41{
    public static void main(String[] args) {
     d ob = new d(1,2,3,4);
        d.display();
    }
}

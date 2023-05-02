package scratches;
import java.util.Arrays;
import java.util.Scanner;

class box{
    int l=1;
    int h=1;
    int b=1;
    box(){

    }
    box(int len, int bre, int hei) {
        l = len;
        b = bre;
        h = hei;
        System.out.println("length is "+l);
        System.out.println("breadth is "+b);
        System.out.println("height is "+h);
    }
    public static void tree(){
        System.out.println("this is box");
    }


    public static void main(String[] args) {

        box obj=new boxw(4,4,4,4);// when boxw id calling object , and we are trying to access method which are static and also in perent and child class so ,if ref tyoe is perent class and obj tyoe is sub class which is etened
        //so id we call static methos which are in both class the it only runs the perent one


//the object is boxw,but use it as box
        obj.tree();
        boxw obj1=new boxw(4,4,4,4);
        obj1.tree();


    }
}
class boxw extends box{
    int w;
    boxw(int l, int b, int h,int w){
        System.out.println("weight is "+w);
    }
    public static void tree(){
        System.out.println("this is boxweight");
    }
}
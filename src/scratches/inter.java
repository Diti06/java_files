package scratches;

interface gattu{
    int a=45;
     void himu();
     void diti();
    default void esha(){
        System.out.println("this is esha");
    }
    default void palak(){
        System.out.println("this is palak");
    }
}//the only major difference between abstract class and interface is that we can implement multiple interfaces in
// single class while we can only extend one class at a time
class abba implements gattu{
    public void himu(){// every method that you impliment of interface you must make it public .  why we do this ??
        System.out.println("this is himu");
        }
       public void diti(){
            System.out.println("this is diti");
        }
        }


public class inter{
public static void main(String[]args){
abba obj= new abba();
obj.diti();
    System.out.println(obj.a);//you can add properties in the interfaces
   // obj.a=444;//you cant modify the properties of interfaces as they are final

        }
}
//java dont support multiple inheritance. it has interfaces. a class cant inherit multiple classes. if it
// wants to apply multiple methods of different class then we have to use interfaces
//we can create referece of interfaces but not the object
//interface methods are public in nature by default.
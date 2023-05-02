//Write a Java program that combine several classes and interfaces the
//abstract class robot has subclass name robotA, robotB, robotC. Class robotA1 extends robotA.
//        Class robotB1 and robotB2 extends robotB. Class robotC1 extends robotC.
//        The locomotion interface declares three methods has forward , reverse and stop.
//        It is implemented by class robotB and robotC. The sound interface declares one method named beep and
//        it is implemented by robotA1,robotB1 and robotC. Defined all class and implement interface as specified
//        than invoked beep method of all class object that are of type sound.
package practical_list;

import java.util.Arrays;

import java.util.Scanner;

public class practical4_1
{

//    public static void main (String[]args)
    {

        RobotA ob1 = new RobotA ();

        ob1.call ();
        System.out.println(" ");

        RobotB ob2 = new RobotB2 ();

        ob2.call ();
        System.out.println(" ");

        RobotC ob3 = new RobotC ();

        ob3.call ();
        System.out.println(" ");

    }
}

interface locomotion

{

    void forward ();

    void reverse ();

    void top ();

}
interface sound

{

    public void beep ();

}
abstract class Robot

{

    abstract void noise ();

}

class RobotA extends Robot implements locomotion

{


    public void forward ()
    {

        System.out.println ("Forward for Robot A");

    }
    public void reverse ()
    {

        System.out.println ("reverse for Robot A");

    }
    public void top ()
    {

        System.out.println ("this is top of A");

    }
    public void noise ()
    {

        System.out.println ("this is noise of RobotA");

    }
    public void call ()
    {

        this.forward ();

        this.reverse ();

        this.top ();

        this.noise ();

    }
}
class RobotB extends Robot implements locomotion

{

    public void forward ()
    {

        System.out.println ("Forward for Robot B");

    }
    public void reverse ()
    {

        System.out.println ("reverse for Robot B");

    }
    public void top ()
    {

        System.out.println ("this is top of B");

    }
    public void noise ()
    {

        System.out.println ("this is noise of RobotA");

    }
    public void call ()
    {

        this.forward ();

        this.reverse ();

        this.top ();

    }
}
class RobotC implements locomotion, sound

{

    public void forward ()
    {

        System.out.println ("Forward for Robot C");

    }
    public void reverse ()
    {

        System.out.println ("reverse for Robot C");

    }
    public void top ()
    {

        System.out.println ("this is top of C");

    }
    public void beep ()
    {

        System.out.println ("this is beep of C");

    }
    public void noise ()
    {

        System.out.println ("this is noise of RobotA");

    }
    public void call ()
    {

        this.forward ();

        this.reverse ();

        this.top ();

    }

}

class RobotA1 extends RobotA implements sound

{


    @Override
    public void beep ()
    {

        System.out.println ("this is beep of RobotA1");

    }
    public void noise ()
    {

        System.out.println ("the noise of A1 is beep beep");

    }
    public void call ()
    {

        super.forward ();

        super.reverse ();

        super.top ();

        this.noise ();

        this.beep ();

    }
}
class RobotB1 extends RobotB implements sound

{

    @Override
    public void beep ()
    {

        System.out.println ("this is beep of RobotB1");

    }
    public void noise ()
    {

        System.out.println ("the of RobotB1 is boo boo");

    }
    public void call ()
    {

        super.forward ();

        super.reverse ();

        super.top ();

        this.noise ();

        this.beep ();

    }
}
class RobotB2 extends RobotB

{

    public void noise ()
    {

        System.out.println ("the noise of RobotB2 is bhoopo bhoopo");

    }
    public void call ()
    {

        super.forward ();

        super.reverse ();

        super.top ();

        this.noise ();

    }
}
class RobotC1 extends RobotC

{

    public void noise ()
    {

        System.out.println ("the noise of RobotC1 is dhinak dhinak");

    }
    public void call ()
    {

        super.forward ();

        super.reverse ();

        super.top ();

        this.noise ();

        super.beep ();

    }
}

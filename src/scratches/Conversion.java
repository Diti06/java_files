package scratches;

import java.io.*;
import java.util.*;
import java.lang.*;
public class Conversion{
    public static void main(String[] args) {
        byte b;
        int i=128;
        double d=343.233;
        b= (byte) i;
        System.out.println("the value of b and i are"+" "+b+" "+i);
        i=(int)d;
        System.out.println("the value of i and d are"+" "+i+" "+d);
        b=(byte)d;
        System.out.println("the value of b and d are"+" "+b+" "+d);
    }
}
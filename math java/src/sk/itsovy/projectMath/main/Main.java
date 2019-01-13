package sk.itsovy.projectMath.main;

import sk.itsovy.projectMath.dot.Dot;

public class Main {

    public static void main(String[] args) {
        Dot dot1 = new Dot();
        System.out.println(dot1);
        Dot dot2 = new Dot(1,1,'B');
        System.out.println(dot2);
        Dot dot3 = new Dot(10,5,'C');
        System.out.println(dot3);
        Dot dot4 = new Dot(-5,4,'D');
        System.out.println(dot4);
        Dot dot5 = new Dot(-6,-6,'E');
        System.out.println(dot5);


    }
}

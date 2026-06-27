package ge.tbc.testautomation.javaoop.runners;

import ge.tbc.testautomation.javaoop.figures.Circle;
import ge.tbc.testautomation.javaoop.util.Util;

public class Main {
    public static void main(String[] args){
        Circle circle1 = new Circle(Math.random() * 100);
        System.out.println(Circle.numberOfCircleInstances);
        String circle1String = Util.circleToString(circle1);
        System.out.println(circle1String);

        Circle circle2 = new Circle(Math.random() * 100);
        System.out.println(Circle.numberOfCircleInstances);
        String circle2String = Util.circleToString(circle2);
        System.out.println(circle2String);

        Circle circle3 = new Circle(Math.random() * 100);
        System.out.println(Circle.numberOfCircleInstances);
        String circle3String = Util.circleToString(circle3);
        System.out.println(circle3String);

        Circle circle4 = new Circle(Math.random() * 100);
        System.out.println(Circle.numberOfCircleInstances);
        String circle4String = Util.circleToString(circle4);
        System.out.println(circle4String);

        Circle circle5 = new Circle(Math.random() * 100);
        System.out.println(Circle.numberOfCircleInstances);
        String circle5String = Util.circleToString(circle5);
        System.out.println(circle5String);
    }
}

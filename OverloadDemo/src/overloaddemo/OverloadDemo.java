/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overloaddemo;

/**
 *
 * @author 2763435
 */
public class OverloadDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double average1 = OverloadDemo.getAverage(40.0, 50.0);
        double average2 = OverloadDemo.getAverage(1.0, 2.0, 3.0);
        char average3 = OverloadDemo.getAverage('a', 'c');
        System.out.println("average1 = " + average1);
        System.out.println("average2 = " + average2);
        System.out.println("average3 = " + average3);

    }

    public static double getAverage(double first, double second) {
        return (first + second) / 2.0;
    }

    public static double getAverage(double first, double second, double third) {
        return (first + second + third) / 3.0;
    }

    public static char getAverage(char first, char second) {
        return (char) (((int) first + (int) second) / 2.0);
    }

}

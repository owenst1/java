/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch6_p2;

/**
 *
 * @author 2763435
 */
public class CH6_p2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int max = Math.max(10, 100);
        System.out.println("The max value is " + max);

        double radius = 1;
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("Area " + area);

        double start = 3.56;
        int rounded = (int) Math.round(start);
        System.out.println("Round" + rounded);

        double roundCelling = (long) Math.ceil(start);
        System.out.println("Round ceil " + roundCelling);
       
        double roundFloor = (long) Math.floor(start);
        System.out.println("Round floor " + roundFloor);

        double random = Math.random();
        System.out.println("Random " + random);

        double roll = (int) (Math.random() * 6) + 1;
        System.out.println(roll);

    }

}

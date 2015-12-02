/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_06_02;

/**
 *
 * @author 2763435
 */
public class ExponentialDemo {

    public static void main(String[] args) {
        double x = 11.635;
        double y = 2.76;

        System.out.printf("The value of e is %.4f%n",
                Math.E);

        System.out.printf("exp(%.3f) is %.3f%n",
                x, Math.exp(x));

        System.out.printf("log(%.3f) is %.3f%n",
                x, Math.log(x));

        System.out.printf("pow(%.3f, %.3f) is %.3f%n",
                x, y, Math.pow(x, y));

        System.out.printf("sqrt(%.3f) is %.3f%n",
                x, Math.sqrt(x));

        double future = 1000 * Math.pow(1 + (.05 / 4), (10 * 4));
        System.out.printf("Future value $%.2f \n", future);
    }

}

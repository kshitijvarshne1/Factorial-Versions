/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 18-Apr-21
 *   Time: 12:23 AM
 *   File: FactorialCalculationUsingMultithreading.java
 */

import java.math.BigInteger;

public class FactorialCalculationUsingMultithreading {
    public static void main(String[] args) {

    }
    private static class MyThread extends Thread{

        @Override
        public void run() {
            calculation();
        }
        private static void calculation(){
            BigInteger result= BigInteger.ONE;
            for (int i = 2; i <=num; i++) {
                result=result.multiply(BigInteger.valueOf(i));
            }
            System.out.println(result);
        }
    }
}


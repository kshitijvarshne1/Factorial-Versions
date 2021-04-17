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
        private int num;
        private BigInteger result;

        public MyThread(int num, BigInteger result) {
            this.num = num;
            this.result = result;
        }

        @Override
        public void run() {
            calculation();
        }
        private void calculation(){
             this.result= BigInteger.ONE;
            for (int i = 2; i <=this.num; i++) {
                this.result=this.result.multiply(BigInteger.valueOf(i));
            }
            System.out.println(this.result);
        }
    }
}


/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 18-Apr-21
 *   Time: 12:23 AM
 *   File: FactorialCalculationUsingMultithreading.java
 */

import java.math.BigInteger;

public class FactorialCalculationUsingMultithreading {
    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();
        int [] arr= {1000,2000,3000,4000,5000};
        MyThread[] thread= new MyThread[arr.length];

        for (int i = 0; i < arr.length; i++) {
            thread[i]= new MyThread(arr[i]);
            thread[i].start();
        }
        for (int i = 0; i < thread.length; i++) {
            thread[i].join();
        }
        for (int i = 0; i < thread.length; i++) {
            System.out.println(thread[i].result);
        }
        System.out.println(System.currentTimeMillis()-start);
    }
    private static class MyThread extends Thread{
        private int num;
        private BigInteger result;

        public MyThread(int num) {
            this.num = num;
            this.result = BigInteger.ONE;
        }

        @Override
        public void run() {
            calculation();
        }
        private void calculation(){
            for (int i = 2; i <=this.num; i++) {
                this.result=this.result.multiply(BigInteger.valueOf(i));
            }
        }
    }
}


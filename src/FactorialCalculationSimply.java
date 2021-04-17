/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 18-Apr-21
 *   Time: 12:16 AM
 *   File: FactorialCalculationSimply.java
 */

import java.math.BigInteger;

public class FactorialCalculationSimply {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        int [] arr= {1000,2000,3000,4000,5000};
        for (int j : arr) {
            calculation(j);
        }
        System.out.println(System.currentTimeMillis()-start);
    }
    private static void calculation(int n){
        BigInteger result= BigInteger.ONE;
        for (int i = 2; i <=n; i++) {
            result=result.multiply(BigInteger.valueOf(i));
        }
        System.out.println(result);
    }
}


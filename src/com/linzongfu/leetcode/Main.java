package com.linzongfu.leetcode;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(System.currentTimeMillis());
        long startTime = System.currentTimeMillis();
        int times = 10000000;
        long sum = 0;
        for (int i = 0; i < times; i++) {
            sum += i;
            if (i / 5 == 0) {
                sum += i;
            }
        }

//        for (int i = 0; i < times; i++) {
//            for (int j = 0; j < times; j++) {
//                for (int k = 0; k < times; k++) {
//                    sum += k;
//                    if (k==i){
//                        sum+=i;
////                        System.out.println("k==i");
//                    }
//                }
//            }
//        }
        long endTime = System.currentTimeMillis();
        System.out.println("Spend time = " + (endTime - startTime) + "ms");
        System.out.println("sum = " + sum);
    }
}

package com.common.algorithmes.collections;

import java.util.HashMap;

/**
 * @author zhuzhenke
 * @date 2018/12/6
 */
public class HashMapAnalyze {
    public static void main(String[] args) {
//        initTableSize();
        getMod();
    }

    /**
     * algorithm of initialCapacity
     * how to Returns a power of two size as table length for the given target capacity.
     *
     * @since jdk 1.8
     */
    private static void initTableSize() {
        //this constructor will init HashMap's table size according to initialCapacity param
        //it would invoke java.util.HashMap.tableSizeFor
        HashMap<String, String> hashMap = new HashMap<>(13);

        int tableSize = tableSizeFor(16);
        System.out.println(tableSize);
    }

    static final int MAXIMUM_CAPACITY = 1 << 30;

    /**
     * Returns a power of two size for the given target capacity.
     */
    static final int tableSizeFor(int cap) {
        //cap:10000
        //n:1111
        int n = cap - 1;
        //n >>> 1:111   1111|111:1111
        n |= n >>> 1;
        //n >>> 2:11    1111|10:1111
        n |= n >>> 2;
        //n >>> 4:0     1111|0:1111
        n |= n >>> 4;
        //n >>> 8:0     1111|0:1111
        n |= n >>> 8;
        //n >>> 16:0    1111|0:1111
        n |= n >>> 16;
        //return 16
        return (n < 0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1;
    }

    static final int tableSizeFor13(int cap) {
        //cap:1101
        //n:1100
        int n = cap - 1;
        //n >>> 1:110   1100|110:1110
        n |= n >>> 1;
        //n >>> 2:10    1110|11:1111
        n |= n >>> 2;
        //n >>> 4:0     1111|0:1111
        n |= n >>> 4;
        //n >>> 8:0     1111|0:1111
        n |= n >>> 8;
        //n >>> 16:0    1111|0:1111
        n |= n >>> 16;
        //return 16
        return (n < 0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1;
    }

    private static void getMod() {
        long times = Integer.MAX_VALUE;
        int n = (int) Math.pow(2d, 6d);
        int index = 0;
        long start = System.currentTimeMillis();
        for (int i = 0; i < times; i++) {
            index = i & (n - 1);
        }
        long end1 = System.currentTimeMillis();
        for (int i = 0; i < times; i++) {
            index = i % n;
        }
        long end2 = System.currentTimeMillis();

        System.out.println("& cost : " + (end1 - start));
        System.out.println("% cost : " + (end2 - end1));
        //& cost : 1611
        //% cost : 5933
    }
}

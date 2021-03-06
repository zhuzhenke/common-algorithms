package com.common.algorithms.basic;

/**
 * @author zhuzhenke
 * @date 2018/11/24
 */
public class SortingTestSampleData {
    public static int[] sortedStandardData = new int[]{
            1, 2, 3, 4, 5, 6, 7, 8, 9, 10
    };
    private static int[] sortingData1 = new int[]{
            10, 5, 6, 8, 4, 7, 9, 2, 1, 3
    };
    private static int[] sortingData2 = new int[]{
            5, 8, 4, 6, 1, 3, 10, 7, 9, 2
    };
    private static int[] sortingData3 = new int[]{
            3, 5, 4, 6, 1, 10, 9, 2, 8, 7
    };
    private static int[] sortingData4 = new int[]{
            10, 9, 8, 7, 6, 5, 4, 3, 2, 1
    };

    public static int[][] sortingData = new int[][]{
            sortedStandardData, sortingData2, sortingData3, sortingData4
    };


    public static int[] hasEqualSortedStandardData = new int[]{
            1, 3, 3, 4, 4, 6, 7, 8, 8, 10
    };
    private static int[] hasEqualSortingData1 = new int[]{
            10, 4, 6, 8, 4, 7, 8, 3, 1, 3
    };
    private static int[] hasEqualSortingData2 = new int[]{
            4, 8, 4, 6, 1, 3, 10, 7, 8, 3
    };
    private static int[] hasEqualSortingData3 = new int[]{
            3, 4, 4, 6, 1, 10, 8, 3, 8, 7
    };
    private static int[] hasEqualSortingData4 = new int[]{
            10, 8, 8, 7, 6, 4, 4, 3, 3, 1
    };

    public static int[][] hasEqualSortingData = new int[][]{
            hasEqualSortingData1, hasEqualSortingData2, hasEqualSortingData3, hasEqualSortingData4
    };
}

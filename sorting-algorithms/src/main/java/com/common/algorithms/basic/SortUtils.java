package com.common.algorithms.basic;

/**
 * @author zhuzhenke
 * @date 2018/11/24
 */
public class SortUtils {
    public static boolean sortedArray(int[] sortResultData, int[] sortedStandardData, boolean asc) {
        if (sortResultData == null || sortResultData.length == 0) {
            return true;
        }
        int current = sortResultData[0];

        for (int sorting : sortResultData) {
            if (asc && sorting < current) {
                return false;
            } else if (!asc && sorting > current) {
                return false;
            }
        }
        if (sortedStandardData != null) {
            for (int i = 0; i < sortedStandardData.length; i++) {
                if (sortedStandardData[i] != sortResultData[i]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void check(int[] sortingData) {
        if (sortingData == null || sortingData.length == 0) {
            throw new IllegalArgumentException("sortingData can not be empty!");
        }
    }

    public static String printArray(int[] array, boolean print) {
        check(array);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i : array) {
            stringBuilder.append(i).append(",");
        }
        String resultStr = stringBuilder.toString().substring(0, stringBuilder.toString().length() - 1);
        if (print) {
            System.out.println(resultStr);
        }
        return resultStr;
    }

    public static void swap(int[] swapArray, int i, int j) {
        check(swapArray);
        if (i < 0 || i > swapArray.length - 1) {
            throw new ArrayIndexOutOfBoundsException("illegal index i:" + i);
        }
        if (j < 0 || j > swapArray.length - 1) {
            throw new ArrayIndexOutOfBoundsException("illegal index j:" + j);
        }
        int temp = swapArray[i];
        swapArray[i] = swapArray[j];
        swapArray[j] = temp;
    }
}

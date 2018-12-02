package com.common.algorithms.sorting;

import com.common.algorithms.basic.Sort;
import com.common.algorithms.basic.SortUtils;

/**
 * documentation:https://en.wikipedia.org/wiki/Counting_sort
 * comment:it may not be a sort algorithm
 * worst-case performance:O(n)
 *
 * @author zhuzhenke
 * @date 2018/12/2
 */
public class CountingSort implements Sort {
    @Override
    public int[] sort(int[] sortingData) {
        SortUtils.check(sortingData);
        return sort1(sortingData);
//        return sort2(sortingData);
    }

    private int[] sort1(int[] sortingData) {
        int maxValue = getMaxValue(sortingData);
        //get max,check all numbers must be bigger or equal 0
        int[] count = new int[maxValue + 1];
        //count every number
        for (int value : sortingData) {
            count[value] = count[value] + 1;
        }
        //output
        int[] result = new int[sortingData.length];
        int resultIndex = 0;
        for (int countIndex = 0; countIndex < count.length; countIndex++) {
            int countValue = count[countIndex];
            while (countValue-- > 0) {
                result[resultIndex++] = countIndex;
            }
        }
        return result;
    }

    private int[] sort2(int[] sortingData) {
        int maxValue = getMaxValue(sortingData);
        //get max,check all numbers must be bigger or equal 0
        int[] count = new int[maxValue + 1];
        //count every number
        for (int value : sortingData) {
            count[value] = count[value] + 1;
        }

        for (int i = 1; i < count.length; i++) {
            count[i] = count[i] + count[i - 1];
        }
        //output
        int[] result = new int[sortingData.length];
        for (int value : sortingData) {
            result[count[value] - 1] = value;
            count[value] = count[value] - 1;
        }
        return result;
    }

    private int getMaxValue(int[] sortingData) {
        int max = sortingData[0];
        for (int value : sortingData) {
            if (value < 0) {
                throw new IllegalArgumentException("value could not be negative:" + value);
            }
            if (value > max) {
                max = value;
            }
        }
        return max;
    }
}

package com.common.algorithms.sortingtest;

import com.common.algorithms.basic.Sort;
import com.common.algorithms.basic.SortUtils;

/**
 * documentation:https://en.wikipedia.org/wiki/Selection_sort
 * gif link:https://upload.wikimedia.org/wikipedia/commons/9/94/Selection-Sort-Animation.gif
 * worst-case performance:О(n2)
 *
 * @author zhuzhenke
 * @date 2018/11/24
 */
public class SelectionSort implements Sort {
    @Override
    public int[] sort(int[] sortingData) {
        SortUtils.check(sortingData);

        for (int index = 0; index < sortingData.length; index++) {
            int smallestIndex = index;
            int smallestValue = sortingData[index];
            for (int j = index; j < sortingData.length; j++) {
                if (sortingData[j] < smallestValue) {
                    smallestValue = sortingData[j];
                    smallestIndex = j;
                }
            }
            sortingData[smallestIndex] = sortingData[index];
            sortingData[index] = smallestValue;
        }
        return sortingData;
    }
}

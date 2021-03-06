package com.common.algorithms.sorting;

import com.common.algorithms.basic.Sort;
import com.common.algorithms.basic.SortUtils;

/**
 * documentation:https://en.wikipedia.org/wiki/Insertion_sort
 * gif demo:https://upload.wikimedia.org/wikipedia/commons/0/0f/Insertion-sort-example-300px.gif
 * worst-case performance:O(n^2)
 *
 * @author zhuzhenke
 * @date 2018/11/24
 */
public class InsertionSort implements Sort {

    @Override
    public int[] sort(int[] sortingData) {
        SortUtils.check(sortingData);

        for (int i = 1; i < sortingData.length; i++) {
            int currentValue = sortingData[i];
            int j = i;
            while (j - 1 >= 0 && currentValue < sortingData[j - 1]) {
                sortingData[j] = sortingData[j - 1];
                j--;
            }
            sortingData[j] = currentValue;
        }

        return sortingData;
    }
}

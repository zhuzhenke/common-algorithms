package com.common.algorithms.sorting;

import com.common.algorithms.basic.Sort;
import com.common.algorithms.basic.SortUtils;

/**
 * documentation:https://en.wikipedia.org/wiki/Bubble_sort
 * gif link:https://upload.wikimedia.org/wikipedia/commons/c/c8/Bubble-sort-example-300px.gif
 * worst-case performance:O(n^2)
 *
 * @author zhuzhenke
 * @date 2018/11/24
 */
public class BubbleSort implements Sort {
    @Override
    public int[] sort(int[] sortingData) {
        SortUtils.check(sortingData);

        for (int j = sortingData.length - 1; j > 0; j--) {
            for (int i = 0; i < j; i++) {
                if (sortingData[i] > sortingData[i + 1]) {
                    SortUtils.swap(sortingData, i, i + 1);
                }
            }
        }

        return sortingData;
    }
}

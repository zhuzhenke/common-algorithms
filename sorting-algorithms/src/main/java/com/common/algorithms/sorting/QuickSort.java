package com.common.algorithms.sorting;

import com.common.algorithms.basic.Sort;
import com.common.algorithms.basic.SortUtils;

/**
 * documentation:https://en.wikipedia.org/wiki/Quicksort
 * gif link:https://upload.wikimedia.org/wikipedia/commons/6/6a/Sorting_quicksort_anim.gif
 * worst-case performance:O(n^2)
 *
 * @author zhuzhenke
 * @date 2018/11/24
 */
public class QuickSort implements Sort {

    @Override
    public int[] sort(int[] sortingData) {
        SortUtils.check(sortingData);

        quickSort(sortingData, 0, sortingData.length - 1);

        return sortingData;
    }

    private void quickSort(int[] sortingData, int start, int end) {
        if (start > end) {
            return;
        }
        int middle = getQuickSortMiddle(sortingData, start, end);
        quickSort(sortingData, start, middle - 1);
        quickSort(sortingData, middle + 1, end);
    }


    /**
     * one side
     */
    public int getQuickSortMiddle(int[] sortingData, int start, int end) {
        int i = start;
        int pivot = end;
        for (int j = start; j < end; j++) {
            if (sortingData[j] < sortingData[pivot]) {
                SortUtils.swap(sortingData, i, j);
                i++;
            }
        }
        SortUtils.swap(sortingData, i, pivot);
        return i;
    }
}

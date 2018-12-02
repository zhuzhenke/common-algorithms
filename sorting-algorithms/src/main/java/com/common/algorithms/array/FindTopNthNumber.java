package com.common.algorithms.array;

import com.common.algorithms.basic.SortUtils;
import com.common.algorithms.sorting.QuickSort;

/**
 * @author zhuzhenke
 * @date 2018/12/2
 */
public class FindTopNthNumber {
    public int findNthSmallestNumber(int[] sortingData, int n) {
        SortUtils.check(sortingData);

        return findNthSmallestNumber(sortingData, 0, sortingData.length - 1, n);
    }

    private int findNthSmallestNumber(int[] sortingData, int start, int end, int n) {
        if (start == end) {
            return sortingData[start];
        }

        int pivotIndex = new QuickSort().getQuickSortMiddle(sortingData, start, end);
        int middle = pivotIndex - start + 1;
        if (n == middle) {
            return sortingData[pivotIndex];
        }
        if (n < middle) {
            return findNthSmallestNumber(sortingData, start, pivotIndex - 1, n);
        }
        return findNthSmallestNumber(sortingData, pivotIndex + 1, end, n - middle);
    }
}

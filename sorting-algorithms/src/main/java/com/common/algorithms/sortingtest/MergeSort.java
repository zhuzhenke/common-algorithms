package com.common.algorithms.sortingtest;

import com.common.algorithms.basic.Sort;
import com.common.algorithms.basic.SortUtils;

import java.util.Arrays;

/**
 * documentation:https://en.wikipedia.org/wiki/Merge_sort
 * gif link:https://upload.wikimedia.org/wikipedia/commons/c/cc/Merge-sort-example-300px.gif
 * worst-case performance:O(n log n)
 *
 * @author zhuzhenke
 * @date 2018/11/24
 */
public class MergeSort implements Sort {

    @Override
    public int[] sort(int[] sortingData) {
        SortUtils.check(sortingData);
        splitDate(sortingData, 0, sortingData.length - 1);
        return sortingData;
    }

    private void splitDate(int[] sortingData, int start, int end) {
        if (end - start < 1) {
            return;
        }
        int middle = (start + end) / 2;
        splitDate(sortingData, start, middle);
        splitDate(sortingData, middle + 1, end);
        mergeData(sortingData, start, middle, end);
    }

    private void mergeData(int[] sortingData, int start, int middle, int end) {
        int[] left = Arrays.copyOfRange(sortingData, start, middle + 1);
        int[] right = Arrays.copyOfRange(sortingData, middle + 1, end + 1);

        int i = 0;
        int j = 0;

        for (int k = start; k <= end; k++) {
            if (i < left.length && j < right.length) {
                if (left[i] <= right[j]) {
                    sortingData[k] = left[i];
                    i++;
                } else {
                    sortingData[k] = right[j];
                    j++;
                }
            } else {
                if (i >= left.length) {
                    sortingData[k] = right[j];
                    j++;
                } else if (j >= right.length) {
                    sortingData[k] = left[i];
                    i++;
                }
            }
        }
    }


}

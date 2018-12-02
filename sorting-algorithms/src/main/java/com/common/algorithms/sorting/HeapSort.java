package com.common.algorithms.sorting;

import com.common.algorithms.basic.Sort;
import com.common.algorithms.basic.SortUtils;

/**
 * documentation:https://en.wikipedia.org/wiki/Heapsort
 * gif link:https://upload.wikimedia.org/wikipedia/commons/1/1b/Sorting_heapsort_anim.gif
 * worst-case performance:O(nlog n)
 *
 * @author zhuzhenke
 * @date 2018/12/2
 */
public class HeapSort implements Sort {
    @Override
    public int[] sort(int[] sortingData) {
        int highIndex = sortingData.length - 1;
        while (highIndex > 0) {
            for (int i = 1; i <= highIndex; i++) {
                sortBiggestToIndex0(sortingData, i);
            }
            SortUtils.swap(sortingData, 0, highIndex);
            highIndex--;
        }
        return sortingData;
    }

    public static void sortBiggestToIndex0(int[] sortingData, int sortIndex) {
        while (sortIndex > 0 && sortingData[sortIndex] > sortingData[(sortIndex - 1) / 2]) {
            SortUtils.swap(sortingData, sortIndex, (sortIndex - 1) / 2);
            sortIndex = (sortIndex - 1) / 2;
        }

    }

}

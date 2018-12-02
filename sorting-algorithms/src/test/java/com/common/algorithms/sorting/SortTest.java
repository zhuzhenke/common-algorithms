package com.common.algorithms.sorting;

import com.common.algorithms.basic.Sort;
import com.common.algorithms.basic.SortUtils;
import com.common.algorithms.basic.SortingTestSampleData;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author zhuzhenke
 * @date 2018/11/24
 */
public class SortTest {

    @Test
    public void testCorrectUtils() {
        for (int[] sortingData : SortingTestSampleData.sortingData) {
            boolean soringResult = SortUtils.sortedArray(sortingData, SortingTestSampleData.sortedStandardData, true);
            System.out.println(soringResult);
//            Assert.assertEquals(soringResult,true);
        }
    }

    @Test
    public void testInsertionSort() {
        sort(new InsertionSort());

    }

    @Test
    public void testMergeSort() {
        sort(new MergeSort());
    }

    @Test
    public void testSelectionSort() {
        sort(new SelectionSort());
    }

    @Test
    public void testBubbleSort() {
        sort(new BubbleSort());
    }

    @Test
    public void testQuickSort() {
        sort(new QuickSort());
    }

    @Test
    public void testHeapSort() {
        sort(new HeapSort());
    }

    private void sort(Sort sort) {

        for (int i = 0; i < SortingTestSampleData.sortingData.length; i++) {
            int[] sortingData = SortingTestSampleData.sortingData[i];
            int[] sortedResultData = sort.sort(sortingData);
            boolean soringResult = SortUtils.sortedArray(sortedResultData, SortingTestSampleData.sortedStandardData, true);
            if (!soringResult) {
                System.out.println("i:" + i +
                        ",sortedResultData:" + SortUtils.printArray(sortedResultData, false));
            }
            Assert.assertEquals(soringResult, true);
        }
    }
}

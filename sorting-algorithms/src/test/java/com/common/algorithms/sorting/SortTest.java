package com.common.algorithms.sorting;

import com.common.algorithms.basic.Sort;
import com.common.algorithms.basic.SortUtils;
import com.common.algorithms.basic.SortingTestSampleData;
import org.junit.Assert;
import org.junit.Test;

import java.util.PriorityQueue;

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

    @Test
    public void testCountingSort() {
        sort(new CountingSort());
    }

    @Test
    public void testBucketSort() {
        sort(new BucketSort());
    }

    private void sort(Sort sort) {

        for (int i = 0; i < SortingTestSampleData.sortingData.length; i++) {
            int[] sortingData = SortingTestSampleData.sortingData[i];
            int[] sortedResultData = sort.sort(sortingData);
            boolean soringResult = SortUtils.sortedArray(sortedResultData, SortingTestSampleData.sortedStandardData, true);
            if (!soringResult) {
                System.out.println("sortingData:i:" + i +
                        ",sortedResultData:" + SortUtils.printArray(sortedResultData, false));
            }
            Assert.assertEquals(soringResult, true);
        }

        for (int i = 0; i < SortingTestSampleData.hasEqualSortingData.length; i++) {
            int[] sortingData = SortingTestSampleData.hasEqualSortingData[i];
            int[] sortedResultData = sort.sort(sortingData);
            boolean soringResult = SortUtils.sortedArray(sortedResultData, SortingTestSampleData.hasEqualSortedStandardData, true);
            if (!soringResult) {
                System.out.println("hasEqualSortingData:i:" + i +
                        ",sortedResultData:" + SortUtils.printArray(sortedResultData, false));
            }
            Assert.assertEquals(soringResult, true);
        }
    }

    @Test
    public void testMathFloor() {
        System.out.println("Math.floor(4.2d):" + Math.floor(4.2d));//4.0
        System.out.println("Math.floor(4.7d):" + Math.floor(4.7d));//4.0
        System.out.println("Math.ceil(4.2d):" + Math.ceil(4.2d));//5.0
        System.out.println("Math.ceil(4.7d):" + Math.ceil(4.7d));//5.0
        System.out.println("Math.round(4.2d):" + Math.round(4.2d));//4
        System.out.println("Math.round(4.7d):" + Math.round(4.7d));//5
    }
}

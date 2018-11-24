package com.common.algorithms.sortingtest;

import com.common.algorithms.basic.Sort;
import com.common.algorithms.basic.SortUtils;
import com.common.algorithms.basic.SortingTestSampleData;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author zhuzhenke
 * @date 2018/11/24
 */
public class InsertionSortTest {

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
        Sort sort = new InsertionSort();
        for (int[] sortingData : SortingTestSampleData.sortingData) {
            int[] sortedResultData = sort.sort(sortingData);
            boolean soringResult = SortUtils.sortedArray(sortedResultData, SortingTestSampleData.sortedStandardData, true);
            if (!soringResult) {
                System.out.println("sortingData:" + SortUtils.printArray(sortingData, false) +
                        ",sortedResultData" + SortUtils.printArray(sortedResultData, false));
            }
            Assert.assertEquals(soringResult, true);
        }
    }
}

package com.common.algorithms.sorting;

import com.common.algorithms.array.FindTopNthNumber;
import com.common.algorithms.basic.SortingTestSampleData;
import org.junit.Test;

/**
 * @author zhuzhenke
 * @date 2018/12/2
 */
public class FindTopNthNumberTest {
    @Test
    public void testFindTopNthNumber() {
        int value1 = new FindTopNthNumber().findNthSmallestNumber(SortingTestSampleData.sortedStandardData, 7);
        System.out.println(value1);

        int value2 = new FindTopNthNumber().findNthSmallestNumber(SortingTestSampleData.hasEqualSortedStandardData, 5);
        System.out.println(value2);
    }
}

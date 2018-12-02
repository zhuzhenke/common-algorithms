package com.common.algorithms.sorting;

import com.common.algorithms.array.FindMaxSubArray;
import com.common.algorithms.array.MaxSubArrayRecord;
import org.junit.Test;

/**
 * @author zhuzhenke
 * @date 2018/11/25
 */
public class FindMaxSubArrayTest {
    @Test
    public void testFindMaxSubArray() {
        int[] array = new int[]{
                13, -3, -25, 20, -3, -16, -23, 18, 20, -7, 12, -5, -22, 15, -4, 7
        };
        MaxSubArrayRecord record = new FindMaxSubArray().findMaxSubArray(array);
        System.out.println(record.toString());
    }
}

package com.common.algorithms.array;

import com.common.algorithms.basic.SortUtils;
import com.common.algorithms.domain.MaxSubArrayRecord;

/**
 * @author zhuzhenke
 * @date 2018/11/25
 */
public class FindMaxSubArray {

    public MaxSubArrayRecord findMaxSubArray(int[] array) {
        SortUtils.check(array);
        return findMaxSubArray(array, 0, array.length - 1);
    }

    public MaxSubArrayRecord findMaxSubArray(int[] array, int start, int end) {
        if (start == end) {
            return new MaxSubArrayRecord(start, end, array[start]);
        }
        int middle = (start + end) / 2;
        MaxSubArrayRecord leftMax = findMaxSubArray(array, start, middle);
        MaxSubArrayRecord rightMax = findMaxSubArray(array, middle + 1, end);
        MaxSubArrayRecord middleMax = findCrossMiddle(array, start, middle, end);
        if (leftMax.getMax() >= rightMax.getMax() && leftMax.getMax() >= middleMax.getMax()) {
            return leftMax;
        }
        if (rightMax.getMax() >= leftMax.getMax() && rightMax.getMax() >= middleMax.getMax()) {
            return rightMax;
        }
        return middleMax;
    }

    private MaxSubArrayRecord findCrossMiddle(int[] array, int start, int middle, int end) {
        int leftSumMax = 0;
        int rightSumMax = 0;
        int leftSum = 0;
        int rightSum = 0;
        int leftIndex = middle;
        int rightIndex = middle;

        for (int i = middle; i >= start; i--) {
            leftSum += array[i];
            if (leftSum > leftSumMax) {
                leftIndex = i;
                leftSumMax = leftSum;
            }
        }

        for (int j = middle + 1; j <= end; j++) {
            rightSum += array[j];
            if (rightSum > rightSumMax) {
                rightIndex = j;
                rightSumMax = rightSum;
            }
        }

        return new MaxSubArrayRecord(leftIndex, rightIndex, leftSumMax + rightSumMax);
    }


}

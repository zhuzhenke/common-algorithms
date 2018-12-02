package com.common.algorithms.sorting;

import com.common.algorithms.basic.Sort;
import com.common.algorithms.basic.SortUtils;

/**
 * @author zhuzhenke
 * @date 2018/12/2
 */
public class BucketSort implements Sort {

    @Override
    public int[] sort(int[] sortingData) {
        SortUtils.check(sortingData);

        int bucketSize = (int) Math.round(Math.sqrt(sortingData.length)) + 1;
        int[][] buckets = new int[bucketSize][];
        int max = SortUtils.getMaxValue(sortingData);
        double avgContain = Math.ceil((double) max / (double) bucketSize);

        for (int value : sortingData) {
            int bucketIndex = (int) Math.ceil(value / avgContain) - 1;
            if (bucketIndex < 0) {
                bucketIndex = 0;
            }
            int[] bucketIndexs = buckets[bucketIndex];
            if (bucketIndexs == null || bucketIndexs.length == 0) {
                bucketIndexs = new int[1];
                bucketIndexs[0] = value;
                buckets[bucketIndex] = bucketIndexs;
            } else {
                int[] newBucketIndexs = new int[bucketIndexs.length + 1];
                System.arraycopy(bucketIndexs, 0, newBucketIndexs, 0, bucketIndexs.length);
                newBucketIndexs[bucketIndexs.length] = value;
                buckets[bucketIndex] = newBucketIndexs;
            }
        }

        Sort sort = new InsertionSort();
        for (int a = 0; a < buckets.length; a++) {
            int[] bucket = buckets[a];
            if (bucket == null || bucket.length == 0) {
                continue;
            }
            bucket = sort.sort(bucket);
            buckets[a] = bucket;
        }

        int[] result = new int[sortingData.length];
        int resultIndex = 0;
        for (int[] bucket : buckets) {
            if (bucket == null || bucket.length == 0) {
                continue;
            }
            for (int bucketValue : bucket) {
                result[resultIndex++] = bucketValue;
            }
        }

        return result;
    }
}

package com.common.algorithms.domain;

import lombok.Data;

/**
 * @author zhuzhenke
 * @date 2018/11/25
 */
@Data
public class MaxSubArrayRecord {
    private int start;
    private int end;
    private int max;

    public MaxSubArrayRecord(int start, int end, int max) {
        this.start = start;
        this.end = end;
        this.max = max;
    }

    @Override
    public String toString() {
        return "MaxSubArrayRecord{" +
                "start=" + start +
                ", end=" + end +
                ", max=" + max +
                '}';
    }
}

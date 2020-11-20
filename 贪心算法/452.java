package com;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by wWX945273 on 2020/11/20.
 */
public class Solution452 {
    public int findMinArrowShots(int[][] points) {
        if (points.length == 0) return 0;
        Arrays.sort(points, Comparator.comparing(o -> o[1]));
        int pre = points[0][1];
        int res = 1;
        for (int i=1; i<points.length; i++){
            if (points[i][0] > pre){
                res++;
                pre = points[i][1];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Solution452 solution452 = new Solution452();
        int[][] ints = {{10, 16}, {2, 8}, {1, 6}, {7, 12}};
        int res = solution452.findMinArrowShots(ints);
        System.out.println(res);
    }
}

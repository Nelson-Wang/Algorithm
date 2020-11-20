
package com;

import java.util.Arrays;

/**
 * Created by wWX945273 on 2020/11/18.
 */
public class Solution455 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int left = 0, right = 0, count = 0;
        while (left<g.length && right<s.length){
            if (g[left]<=s[right]){
                count++;
                left++;
            }
            right++;
        }
        return count;
    }
}

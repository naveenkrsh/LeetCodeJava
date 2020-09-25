package array.singleNumber;
//https://leetcode.com/problems/single-number/
//Leetcode: 136
public class Solution {
    public int singleNumber(int[] nums) {
        int result=0;
        for(int i=0; i< nums.length; i++){
            result = result ^ nums[i];
        }
        return result;
    }
}

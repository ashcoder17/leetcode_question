class Solution {
    public int majorityElement(int[] nums) {
        
        int n = nums.length;
        Arrays.sort(nums);
        int maj_element = n/2;
        
        int result= nums[n/2];
        
        return result;
        
    }
}
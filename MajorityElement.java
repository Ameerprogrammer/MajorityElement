class Solution {
    public int majorityElement(int[] nums) {

        int candidate = nums[0];
        int count = 1;

        //one pointer
        for(int i = 0; i < nums.length; i++) {

            if(nums[i] == candidate) {
                count++;
            }

            if(nums[i] != candidate) {
                count--;
            }

            if(count == 0) {
                candidate = nums[i]; 
                count = 1;
            }
        }

        return candidate;
    }
}
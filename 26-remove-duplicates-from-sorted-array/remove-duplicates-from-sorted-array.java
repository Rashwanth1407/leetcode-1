class Solution {
    public int removeDuplicates(int[] nums) {
        int off = 0;
        int cm = 0;
        int unique = 1;
        while(cm< nums.length-1){
            if(nums[cm]==nums[cm+1]){
                cm++;
                continue;

            }
            else{
                nums[off+1] = nums[cm+1];
                off++;
                unique++;
                cm++;
            }
            
        }
        return unique;
        
    }
}
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int lftP = 0;
        int rgtP = numbers.length -1;
        while(lftP < rgtP|| lftP ==rgtP){
            if(numbers[lftP]+numbers[rgtP]==target){
                return new int[] {lftP+1,rgtP+1};
            }
            else if(numbers[lftP]+numbers[rgtP]<target){
                lftP++;
            }
            else if(numbers[lftP]+numbers[rgtP]>target){
                rgtP--;
            }
            else{
                return new int[] {};
            }
        }
        return new int[] {};

        
    }
}
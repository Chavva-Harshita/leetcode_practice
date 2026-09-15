class Solution {
    public int pivotIndex(int[] nums) {
        int totalsum=0;
        for(int i=0;i<nums.length;i++){
            totalsum+=nums[i];
        }   //calcualte totalsum once
        int leftsum=0;
        for(int i=0;i<nums.length;i++){ //now split the array and check if sum of both parts is same or not
            int rightsum=totalsum-leftsum-nums[i];
            if(leftsum==rightsum) return i;
        
        leftsum+=nums[i];//add elements to leftsum
        }
    return -1;
}
}
public int bigDiff(int[] nums) {
  int min=nums[0];
  int max=nums[0];
  for(int i=0;i<nums.length;i++){
    min=Math.min(nums[i],min);
    max=Math.max(nums[i],max);
  }
  return max-min;
}


public int centeredAverage(int[] nums) {
  int max=nums[0];
  int min=nums[0];
  int sum=0;
  for(int i=0;i<nums.length;i++){
    min=Math.min(nums[i],min);
    max=Math.max(nums[i],max);
    sum=sum+nums[i];
  }
  return (sum-min-max)/(nums.length-2);
}


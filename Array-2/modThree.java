public boolean modThree(int[] nums) {
  int count=0;
  for(int i=0;i<nums.length-2;i++){
    if(nums[i]%2==0&&nums[i+1]%2==0&&nums[i+2]%2==0) count=1;
    if(nums[i]%2==1&&nums[i+1]%2==1&&nums[i+2]%2==1) count=1;
  }
  if(count==1) return true;
  return false;
}


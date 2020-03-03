public boolean unlucky1(int[] nums) {
  if (nums.length>=3)
  for (int i=0;i<2;i++){
    if (nums[i]==1&&nums[i+1]==3)
    return true;
  }
  if (nums.length>=2&&nums[nums.length-2]==1&&nums[nums.length-1]==3)
  return true;
  else
  return false;
}


public int maxTriple(int[] nums) {
  int a=nums[0];
  int b=nums[nums.length/2];
  int c=nums[nums.length-1];
  if (a>b&&a>c)
  return a;
  if (b>a&&b>c)
  return b;
  else
  return c;
}


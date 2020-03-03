public int[] frontPiece(int[] nums) {
  int[] a=new int[2];
  if (nums.length<2)
  return nums;
  if (nums.length>=2)
  a[0]=nums[0];
  a[1]=nums[1];
  return a;
}


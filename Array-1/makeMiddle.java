public int[] makeMiddle(int[] nums) {
  int[] a=new int[2];
  a[0]=nums[nums.length/2-1];
  a[1]=nums[nums.length/2];
  return a;
}


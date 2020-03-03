public int[] maxEnd3(int[] nums) {
  int[] a=new int[3];
  if (nums[0]>nums[2])
  a[0]=a[1]=a[2]=nums[0];
  else
  a[0]=a[1]=a[2]=nums[2];
  return a;
}


public int[] makeLast(int[] nums) {
  int[] a=new int[2*nums.length];
  a[a.length-1]=nums[nums.length-1];
  for (int i=0;i<a.length-2;i++)
  a[i]=0;
  return a;
}


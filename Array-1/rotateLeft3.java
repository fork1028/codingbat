public int[] rotateLeft3(int[] nums) {
  int[] a=new int[3];
  a[0]=nums[1];
  a[1]=nums[2];
  a[2]=nums[0];
  return a;
}


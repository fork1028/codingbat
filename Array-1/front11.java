public int[] front11(int[] a, int[] b) {
  if (a.length>0&&b.length>0){
    int[] nums=new int[2];
    nums[0]=a[0];
    nums[1]=b[0];
    return nums;
  }
  if (a.length==0&&b.length==0){
    return a;
  }
  if (a.length==0){
    int[] nums=new int[1];
    nums[0]=b[0];
    return nums;
  }
  else{
    int[] nums=new int[1];
    nums[0]=a[0];
    return nums;
  }
}


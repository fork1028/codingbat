public int[] copyEvens(int[] nums, int count) {
  int[] output=new int[count];
  int j=0;
  for(int i=0;i<nums.length;i++){
    if(nums[i]%2==0&&j<count) {
      output[j]=nums[i];
      j++;
    }
  }
  return output;
}


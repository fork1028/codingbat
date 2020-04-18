public int[] copyEndy(int[] nums, int count) {
  int index = 0;
  int[] arr =new int[count];
  for(int i=0;i<nums.length;i++){
    if((nums[i]>=0&&nums[i]<=10)||(nums[i]>=90&&nums[i]<=100)){
      arr[index]=nums[i];
      index++;
      if(index==count) return arr;
    }
  }
  return arr;
}

public int sum67(int[] nums) {
  boolean f=false;
  int sum=0;
  for(int i=0;i<nums.length;i++){
    if(nums[i]==6) f=true;
    if(f==false) sum=sum+nums[i];
    if(nums[i]==7) f=false;
  }
  return sum;
  
  /*int sum=0;
  int start=-1;
  for(int i=0;i<nums.length;i++){
    if(nums[i]==6) start=i;
    if(start==-1) sum=sum+nums[i];
    if(nums[i]==7) start=-1;
  }
  return sum;*/
}


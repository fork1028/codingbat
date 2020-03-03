public String[] fizzArray2(int n) {
  String[] nums=new String[n];
  int a=0;
  for(int i=0;i<nums.length;i++){
    nums[i]=String.valueOf(a);//nums[i]=""+a;
    a++;
  }
  return nums;
}


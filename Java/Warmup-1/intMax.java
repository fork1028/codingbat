public int intMax(int a, int b, int c) {
  int max=-100; // min-integer
  int[] arr={a,b,c};
  for(int i=0;i<3;i++){
    if(arr[i]>max) max=arr[i];
  }
  return max;
}


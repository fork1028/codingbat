public int[] fizzArray3(int start, int end) {
  int[] a=new int[end-start];
  for(int i=0;i<a.length;i++){
    a[i]=start;
    start++;
  }
  return a;
}


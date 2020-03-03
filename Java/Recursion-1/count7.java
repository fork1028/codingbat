public int count7(int n) {
  int count=0;
  if(n%10==7) return 1+count7(n/10);
  if(n/10==0) return count;
  return count7(n/10);
}


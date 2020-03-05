public boolean hasOne(int n) {
  while(n!=0){
    int remainder=n%10;
    if(remainder==1) return true;
    n/=10;
  }
  return false;
}


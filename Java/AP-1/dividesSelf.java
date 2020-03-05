public boolean dividesSelf(int n) {
  int num=n;
  while(n!=0){
    int remainder=n%10;
    if(remainder==0) return false;
    if(num%remainder!=0) return false;
    n/=10;
  }
  return true;
}


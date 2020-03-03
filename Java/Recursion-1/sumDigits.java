public int sumDigits(int n) {
  if(n/10==0) return n%10;
  return sumDigits(n/10)+n%10;
}


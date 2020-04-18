public int scoresSpecial(int[] a, int[] b) {
  int maxA=0;
  int maxB=0;
  for(int i=0;i<a.length;i++){
    if(a[i]%10==0||a[i]%40==0||a[i]%90==0){
      if(a[i]>maxA) maxA=a[i];
    }
  }
  for(int i=0;i<b.length;i++){
    if(b[i]%10==0||b[i]%40==0||b[i]%90==0){
      if(b[i]>maxB) maxB=b[i];
    }
  }
  return maxA+maxB;
}


public int scoresAverage(int[] scores) {
  int mid=scores.length/2;
  int fst=average(scores,0,mid);
  int scd=average(scores,mid,scores.length);
  if(fst>scd) return fst;
  return scd;
}

public int average(int[] scores, int start, int end){
  int sum=0;
  for(int i=start;i<end;i++){
    sum+=scores[i];
  }
  return sum/(end-start);
}


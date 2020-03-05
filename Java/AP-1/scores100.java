public boolean scores100(int[] scores) {
  for(int i=0;i<scores.length;i++){
    if(scores[i]==100){
      int j=i+1;
      if(j<scores.length&&scores[j]==100) return true;
    }
  }
  return false;
}


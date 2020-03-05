public boolean scoresIncreasing(int[] scores) {
  for(int i=0;i<scores.length;i++){
    for(int j=i+1;j<scores.length;j++){
      if(scores[i]>scores[j]) return false;
    }
  }
  return true;
}


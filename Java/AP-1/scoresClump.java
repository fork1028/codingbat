public boolean scoresClump(int[] scores) {
  for(int i=0;i<scores.length;i++){
    int j=i+1;
    int k=j+1;
    if(j<scores.length&&k<scores.length){
      if(scores[k]-scores[i]<=2) return true;
    }
  }
  return false;
}


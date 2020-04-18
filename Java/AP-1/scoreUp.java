public int scoreUp(String[] key, String[] answers) {
  int score = 0;
  for(int i=0;i<key.length;i++){
    if(answers[i].equals("?")){
      score+=0;
      continue;
    }
    if(key[i].equals(answers[i])){
      score+=4;
      continue;
    }
    if(!key[i].equals(answers[i])){
      score-=1;
      continue;
    }
  }
  return score;
}


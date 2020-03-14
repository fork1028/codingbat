int countXX(String str) {
  int count=0;
  for(int i=0;i<=str.length()-2;i++){
    if(str.substring(i,i+1).equals("x")){
      if(str.substring(i+1,i+2).equals("x"))
      count++;
    }
  }
  return count;
}


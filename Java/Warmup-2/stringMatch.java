public int stringMatch(String a, String b) {
  int count=0;
  int length=Math.min(a.length(),b.length());
  for(int i=0;i<length-1;i++){
    String subA = a.substring(i,i+2);
    String subB = b.substring(i,i+2);
    if(subA.equals(subB)) count++;
  }
  return count;
}


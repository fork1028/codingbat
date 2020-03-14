public int last2(String str) {
  if(str.length()<2) return 0;
  String end=str.substring(str.length()-2,str.length());
  int count=0;
  for(int i=0;i<str.length()-2;i++){
    if(str.charAt(i)==end.charAt(0)&&str.charAt(i+1)==end.charAt(1))
    count++;
  }
  return count;
}


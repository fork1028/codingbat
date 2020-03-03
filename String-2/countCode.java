public int countCode(String str) {
  int i=0;
  int count=0;
  while (i<str.length()-3){
    String a=str.substring(i,i+2)+str.substring(i+3,i+4);
    i++;
    if (a.equals("co"+"e"))
    count++;
  }
  return count;
}


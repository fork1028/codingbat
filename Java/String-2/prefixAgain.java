public boolean prefixAgain(String str, int n) {
  int i=0;
  String a=str.substring(0,n);
  while (i<str.length()-n){ //!i<=str.length()-n
    String b=str.substring(i+1,i+n+1); //!String b=str.substring(i,i+n);
    if (a.equals(b))
    return true;
    i++;
  }
  return false;
}


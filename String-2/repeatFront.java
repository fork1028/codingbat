public String repeatFront(String str, int n) {
  int i=0;
  String result="";
  while (i<n){
    result+=str.substring(0,n-i);
    i++;
  }
  return result;
}


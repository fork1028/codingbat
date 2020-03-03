public String repeatEnd(String str, int n) {
  int i=0;
  String result="";
  while (i<n){
    result+=str.substring(str.length()-n);
    i++;
  }
  return result;
}


public String doubleChar(String str) {
  String result = "";
  int i=0;
  while (i<str.length()){
    result += str.substring(i,i+1)+str.substring(i,i+1);
    i++;
  }
  return result;
}


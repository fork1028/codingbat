public String stringSplosion(String str) {
  String output="";
  int j=1;
  for(int i=0;i<str.length();i++){
    output+=str.substring(0,j);
    j++;
  }
  return output;
}

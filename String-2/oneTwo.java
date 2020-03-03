public String oneTwo(String str) {
  String c="";
  if(str.length()>=3){
    for(int i=0;i<str.length()-2;i++){
      String a=str.substring(i,i+1);
      String b=str.substring(i+1,i+3);
      c=c+b+a;
      i=i+2;
    }
  }
  return c;
}
  

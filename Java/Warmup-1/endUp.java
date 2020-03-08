public String endUp(String str) {
  int i=str.length();
  int count=0;
  if(str.length()<=2){
    return str.toUpperCase();
  }
  str=str.substring(0,i-3)+str.substring(i-3,i).toUpperCase();
  return str;
}


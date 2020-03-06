public String notString(String str) {
  if(str.length()>2){
    String sub=str.substring(0,3);
    if(!sub.equals("not")) return "not "+str;
  }
  else{
    return "not "+str;
  }
  return str;
}

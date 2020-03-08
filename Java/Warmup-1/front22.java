public String front22(String str) {
  if(str.length()>=2){
    String sub=str.substring(0,2);
    return sub+str+sub;
  }
  return str+str+str;
}


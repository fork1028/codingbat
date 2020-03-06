public String front3(String str) {
  if(str.length()<3) return str+str+str;
  String sub=str.substring(0,3);
  return sub+sub+sub;
}


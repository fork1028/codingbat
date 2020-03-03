public boolean bobThere(String str) {
  int i=0;
  if (str.length()>3)
  while (i<str.length()-2){
    String a=str.substring(i,i+1)+str.substring(i+2,i+3);
    if (a.equals("bb"))
    return true;
    i++;
  }
  if (str.length()==3
  &&str.substring(0,1).equals("b")&&str.substring(2,3).equals("b"))
  return true;
  return false;
  
  
}


public boolean xyzThere(String str) {
  int i=0;
  if (str.length()>3)
  while (i<str.length()-2){
    if (str.substring(i,i+3).equals("xyz")
    &&!str.substring(str.length()-4).equals(".xyz"))
    return true;
    i++;
  }
  if (str.length()<=3&&str.equals("xyz"))
  return true;
  else
  return false;
}


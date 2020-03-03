public boolean frontAgain(String str) {
  if (str.length()>=3 
  && str.substring(0,2).equals(str.substring(str.length()-2,str.length())))
  return true;
  if (str.length()==2)
  return true;
  if (str.length()>=3 
  && !str.substring(0,2).equals(str.substring(str.length()-2,str.length())))
  return false;
  else
  return false;
}


public String without2(String str) {
  if (str.length()>2 
  && str.substring(0,2).equals(str.substring(str.length()-2,str.length())))
  return str.substring(2);
  if (str.length()>2 
  && !str.substring(0,2).equals(str.substring(str.length()-2,str.length())))
  return str;
  if (str.length()==2)
  return "";
  else
  return str;
}


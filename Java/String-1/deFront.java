public String deFront(String str) {    
  if (str.length()>=2 && str.substring(0,1).equals("a") 
  &&str.substring(1,2).equals("b"))
  return str;
  if (str.length()>=2 && str.substring(0,1).equals("a"))
  return str.substring(0,1)+str.substring(2);
  if (str.length()>=2 && str.substring(1,2).equals("b"))
  return str.substring(1,2)+str.substring(2);
  else 
  return str.substring(2);
  
}


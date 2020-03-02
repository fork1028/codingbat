public String conCat(String a, String b) {
   if (a.length()>0 && b.length()>0 
  && !a.substring(a.length()-1,a.length()).equals(b.substring(0,1)))
  return a+b;
  if (a.length()>0 && b.length()>0 
  && a.substring(a.length()-1,a.length()).equals(b.substring(0,1)))
  return a+b.substring(1);
  if (a.length()>0 && b.length()<=0)
  return a;
  if (a.length()<=0 && b.length()>0)
  return b;
  else
  return "";
}


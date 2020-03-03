public String getSandwich(String str) {
  int a=str.indexOf("bread");
  int b=str.lastIndexOf("bread");
  if (a!=b&&a+b>1)
  return str.substring(a+5,b);
  else
  return "";
}


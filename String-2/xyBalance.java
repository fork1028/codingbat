public boolean xyBalance(String str) {
  int i=0;
  while (i<str.length()){
    if (str.indexOf("x")<0&&str.indexOf("y")<0||
    str.indexOf("y",i)>str.indexOf("x",str.indexOf("y",i)+1))
    return true;
    i++;
  }
  if (str.length()==0)
  return true;
  return false;
}


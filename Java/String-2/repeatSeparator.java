public String repeatSeparator(String word, String sep, int count) {
  int i=0;
  String res="";
  String result="";
  if (count>0)
  while (i<count){
    res+=word+sep;
    result=res.substring(0,res.length()-sep.length());
    i++;
  }
  if (count==1)
  return word;
  if (count==0)
  return "";
  return result;
}


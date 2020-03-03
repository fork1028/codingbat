public String startWord(String str, String word) {
  if (word.length()<=str.length() && word.length()>1
  && word.substring(1).equals(str.substring(1,word.length())))
  return str.substring(0,word.length());
  if (word.length()<=str.length() && word.length()==1)
  return str.substring(0,1);
  else
  return "";
}


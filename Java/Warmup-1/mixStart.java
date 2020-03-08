public boolean mixStart(String str) {
  if(str.length()>=3){
    String sub=str.substring(1,3);
    if(sub.equals("ix")) return true;
  }
  return false;
}


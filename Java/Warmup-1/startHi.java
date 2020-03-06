public boolean startHi(String str) {
  if(str.length()<2) return false;
  String sub=str.substring(0,2);
  if(sub.equals("hi")) return true;
  return false;
}


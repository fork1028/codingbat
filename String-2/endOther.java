public boolean endOther(String a, String b) {
  String A=a.toLowerCase();
  String B=b.toLowerCase();
  if (A.length()>=B.length()&&B.equals(A.substring(A.length()-B.length())))
  return true;
  if (A.length()<B.length()&&A.equals(B.substring(B.length()-A.length())))
  return true;
  else
  return false;
}


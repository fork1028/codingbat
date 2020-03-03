public String mixString(String a, String b) {
  int i=0;
  String result="";
  String res="";
  if (a.length()<=b.length())
  while (i<a.length()){
    String a1=a.substring(i,i+1);
    String b1=b.substring(i,i+1);
    String b2=b.substring(i+1);
    res+=a1+b1;
    result=res+b2;
    i++;
  }
  if (a.length()>b.length())
  while (i<b.length()){
    String a1=a.substring(i,i+1);
    String b1=b.substring(i,i+1);
    String a2=a.substring(i+1);
    res=res+a1+b1;
    result=res+a2;
    i++;
  }
  if (a.length()==0)
  return b;
  if (b.length()==0)
  return a;
  return result;
}


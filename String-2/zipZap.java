public String zipZap(String str) {
  int a=0;
  int b=0;
  String c="";
  String d="";        
  for(int i=0;i<str.length()-1;i++){
    a=str.indexOf("z",i);
    b=str.indexOf("p",i+2);
    if(a>=0&&b-a==2){
    c=str.substring(0,a+1);
    d=str.substring(b);
    str=c+d;
    }
  }
  return str;
}


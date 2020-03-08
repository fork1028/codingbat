public String startOz(String str) {
  if(str.length()>=2){
    String sub=str.substring(0,2);
    if(sub.charAt(0)=='o'&&sub.charAt(1)=='z') return "oz";
    if(sub.charAt(0)=='o') return "o";
    if(sub.charAt(1)=='z') return "z";
  }
  if(str.equals("o")) return str;
  return "";
}


boolean doubleX(String str) {
  int index=str.indexOf('x');
  for(int i=0;i<str.length()-1;i++){
    if(i==index&&str.charAt(i)=='x'&&str.charAt(i+1)=='x') return true;
  }
  return false;
}


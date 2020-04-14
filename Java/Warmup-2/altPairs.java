public String altPairs(String str) {
  String output="";
  for(int i=0;i<str.length();i+=4){
    if(i==str.length()-1){
      output+=str.substring(i,i+1);
    }
    else{
      output+=str.substring(i,i+2);
    }
  }
  return output;
}

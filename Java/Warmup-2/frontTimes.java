public String frontTimes(String str, int n) {
  String output="";
  if(str.length()>=3){
    for(int i=0;i<n;i++){
      output+=str.substring(0,3);
    }
  }
  else{
    for(int i=0;i<n;i++){
      output+=str;
    }
  }
  return output;
}


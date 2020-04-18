public String[] wordsWithout(String[] words, String target) {
  int length=0;
  for(int i=0;i<words.length;i++){
    if(!words[i].equals(target)) length++;
  }
  String[] result = new String[length];
  int index=0;
  for(int i=0;i<words.length;i++){
    if(!words[i].equals(target)){
      result[index]=words[i];
      index++;
    }
  }
  return result;
}


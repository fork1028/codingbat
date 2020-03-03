public boolean catDog(String str) {
  int i=0;
  int cat=0;
  int dog=0;
  while (i<str.length()-2){
    String a = str.substring(i,i+3);
    if (a.equals("cat"))
    cat++;
    if (a.equals("dog"))
    dog++;
    i++;
  }
  if (dog==cat)
  return true;
  else
  return false;
}


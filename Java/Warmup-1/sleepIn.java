public boolean sleepIn(boolean weekday, boolean vacation) {
  if(!weekday&&!vacation) return true;
  if(weekday&&!vacation) return false;
  else return true;
}

public boolean squirrelPlay(int temp, boolean isSummer) {
  if(temp >= 60 && temp <= 90 || isSummer == true && temp >=60 && temp <=100)
  {
    return true;
  }
  return false;
}

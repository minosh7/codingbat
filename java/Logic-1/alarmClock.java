public String alarmClock(int day, boolean vacation) {
  String alarm = "";
  if(vacation == false)
  {
    if(day == 1 || day == 2 || day == 3 || day == 4 || day == 5)
    {
      alarm = "7:00";
    }
    if(day == 0 || day == 6)
    {
      alarm = "10:00";
    }
  }
  if(vacation == true)
  {
    if(day == 1 || day == 2 || day == 3 || day == 4 || day == 5)
    {
      alarm = "10:00";
    }
    if(day == 0 || day == 6)
    {
      alarm = "off";
    }
  }
  return alarm;
}

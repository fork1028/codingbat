def parrot_trouble(talking, hour):
  if talking == True:
    return hour<7 or hour>20
  else:
    return False


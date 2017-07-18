/*
sleepIn:
The parameter weekday is true if it is a weekday, and the parameter vacation
is true if we are on vacation. We sleep in if it is not a weekday or we're 
on vacation. Return true if we sleep in.
*/
public boolean sleepIn(boolean weekday, boolean vacation) {
  return (!weekday || vacation);
}

/*
monkeyTrouble:
We have two monkeys, a and b, and the parameters aSmile and bSmile indicate
if each is smiling. We are in trouble if they are both smiling or if neither
of them is smiling. Return true if we are in trouble.
*/
public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
  return (aSmile && bSmile || !aSmile && !bSmile);
}

/*
sumDouble:
Given two int vaues, return their sum. Unless the two values are the same,
then return double their sum.
*/
public int sumDouble(int a, int b) {
  int sum = a + b;
  if (a == b){
    sum *= 2;
  }

  return sum;  
}

/*
diff21:
Given an int n, return the absolute difference between n and 21,
except return double the absolute difference if n is over 21.
*/
public int diff21(int n) {
  int dif = 21 - n;
  if (n > 21){
    dif = (n -21) * 2;
  }

  return dif;
}

/*
parrotTrouble:
We have a loud talking parrot. The "hour" parameter is the current hour time in
the range 0..23. We are in trouble if the parrot is talking and the hour is
before 7 or after 20. Return true if we are in trouble.
*/
public boolean parrotTrouble(boolean talking, int hour) {
  return (talking && (hour < 7 || hour > 20));
}

/*
makes10:
GIven 2 ints, a and b, return true if one of them is 10 or if their sum is 10.
*/
public boolean makes10(int a, int b) {
  return (a == 10 || b == 10 || a + b == 10);
}

/*
nearHundred:
Given an int n, return true if it is within 10 of 100 or 200.
*/
public boolean nearHundred(int n) {
  return ((Math.abs(100 - n) <= 10) || (Math.abs(200 - n) <= 10));
}

/*
posNeg:
Given 2 int values, return true if one is negative and one is positive.
Except if the parameter "negative" is true, then return true only if both are negative.
*/
public boolean posNeg(int a, int b, boolean negative) {
  if (negative){
    return(a < 0 && b < 0);
  }

  return((a < 0 && b >= 0) || (a >= 0 && b < 0));
}

/*
notString:
Given a string, return a new string where "not " has been added to the front. 
However, if the string already begins with "not", return the string unchanged.
*/
public String notString(String str) {
  if (str.length() >= 3 && str.substring(0,3).equals("not")){
    return str;
  }
  
  return ("not " + str);
}

/*
missingChar:
Given a non-empty string and an int n, return a new string where the 
char at index n has been removed.
*/
public String missingChar(String str, int n) {
  String front = str.substring(0, n);
  String back = str.substring(n+1, str.length());
  
  return front + back;
}

/*
frontBack:
Given a string, return a new string where the first and last chars
have been exchanged.
*/
public String frontBack(String str) {
  if (str.length() <= 1) return str;
  
  String middle = str.substring(1, str.length()-1);
  
  return (str.charAt(str.length()-1) + middle + str.charAt(0));
}

/*
front3:
Given a string, we'll say that the front is the first 3 chars of the string. 
If the string length is less than 3, the front is whatever is there. 
Return a new string which is 3 copies of the front.
*/
public String front3(String str) {
  String front;
  
  if (str.length() >= 3){
    front = str.substring(0,3);
  }
  else{
    front = str;
  }
  
  return (front + front + front);
}
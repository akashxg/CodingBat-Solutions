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

/*
Given a string, take the last char and return a new string with the last 
char added at the front and back, so "cat" yields "tcatt". The original 
string will be length 1 or more.
*/
public String backAround(String str) {
  char last = str.charAt(str.length()-1);
  return last + str + last;
}

/*
Return true if the given non-negative number is a multiple of 3 or a 
multiple of 5. Use the % "mod" operator
*/
public boolean or35(int n) {
  return (n % 3 == 0 || n % 5 == 0);
}

/*
Given a string, take the first 2 chars and return the string with 
the 2 chars added at both the front and back, so "kitten" yields 
"kikittenki". If the string length is less than 2, use whatever 
chars are there.
*/
public String front22(String str) {
  String front2;
  if (str.length() <= 2) {
    front2 = str;
  } else {
    front2 = str.substring(0, 2);
  }
  
  return front2 + str + front2;
}

// Given a string, return true if the string starts with "hi" and false otherwise.
public boolean startHi(String str) {
  if (str.length() < 2) return false;
  
  String front;
  if (str.length() == 2) {
    front = str;
  } else {
    front = str.substring(0, 2);
  }
  
  return (front.equals("hi"));
  
}

// Given two temperatures, return true if one is less than 0 and the other is greater than 100.
public boolean icyHot(int temp1, int temp2) {
  return ((temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0));
}

// Given 2 int values, return true if either of them is in the range 10..20 inclusive.
public boolean in1020(int a, int b) {
  return ((a >= 10 && a <= 20) || (b >= 10 && b <= 20));
}

/*
We'll say that a number is "teen" if it is in the range 13..19 inclusive. 
Given 3 int values, return true if 1 or more of them are teen.
*/
public boolean hasTeen(int a, int b, int c) {
  return (a>=13 && a<=19) ||
         (b>=13 && b<=19) ||
         (c>=13 && c<=19);
}

/*
Given a string, if the string "del" appears starting at index 1, return a 
string where that "del" has been deleted. Otherwise, return the string
 unchanged.
*/
 public String delDel(String str) {
  if (str.length() >= 4 && str.substring(1, 4).equals("del")){
    return (str.charAt(0) + str.substring(4));
  }
  
  return str;
}

/*
Return true if the given string begins with "mix", except the 'm' can 
be anything, so "pix", "9ix" .. all count.
*/
public boolean mixStart(String str) {
  if (str.length() < 3) return false;
  return (str.substring(1,3).equals("ix"));
}

/*
We'll say that a number is "teen" if it is in the range 13..19 inclusive. 
Given 2 int values, return true if one or the other is teen, but not both.
*/
public boolean loneTeen(int a, int b) {
  boolean aTeen = (a >= 13 && a <= 19);
  boolean bTeen = (b >= 13 && b <= 19);
  
  return (aTeen && !bTeen) || (!aTeen && bTeen);
}

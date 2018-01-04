// Given a string, return a string where for every char in the original, there are two chars.
public String doubleChar(String str) {
  String result = "";
  for (int i=0; i<str.length(); i++) {
    result  = result + str.charAt(i) + str.charAt(i);
  }
  return result;
}

// Return the number of times that the string "hi" appears anywhere in the given string.
public int countHi(String str) {
  int count = 0;
  for (int i=0;i<str.length()-1;i++) {
    if(str.substring(i,i+2).equals("hi")) count++;
  }
  return count;
}


// Return true if the string "cat" and "dog" appear the same number of times in the given string.
public boolean catDog(String str) {
  int countC = 0;
  int countD = 0;
  
  for (int i=0;i<str.length()-2;i++) {
    if (str.substring(i,i+3).equals("cat")) countC++;
    if (str.substring(i,i+3).equals("dog")) countD++;
  }
  
  return (countC == countD);
}

/*
Return the number of times that the string "code" appears anywhere in the given 
string, except we'll accept any letter for the 'd', so "cope" and "cooe" count.
*/
public int countCode(String str) {
  int count = 0;
  for (int i=0;i<str.length()-3;i++) {
    if (str.substring(i,i+2).equals("co") && str.charAt(i+3)=='e') count++;
  }
  return count;
}

/*
Given two strings, return true if either of the strings appears at the very end 
of the other string, ignoring upper/lower case differences (in other words, the 
computation should not be "case sensitive").
*/
public boolean endOther(String a, String b) {
  String a1 = a.toLowerCase();
  String b1 = b.toLowerCase();
  return (a1.endsWith(b1) || b1.endsWith(a1));
}

/*
Return true if the given string contains an appearance of "xyz" where the xyz 
is not directly preceeded by a period (.). So "xxyz" counts but "x.xyz" does not.
*/
public boolean xyzThere(String str) {
  for (int i=0;i<str.length()-2;i++) {
    if (str.substring(i,i+3).equals("xyz")) {
      if (i == 0 || str.charAt(i-1) != '.') {
        return true;
      }
    }
  }
  return false;
}

// Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char.
public boolean bobThere(String str) {
  for (int i=0;i<str.length()-2;i++) {
    if (str.charAt(i) == 'b' && str.charAt(i+2) == 'b') return true;
  }
  return false;
}

/*
We'll say that a String is xy-balanced if for all the 'x' chars in the string, 
there exists a 'y' char somewhere later in the string. So "xxy" is balanced, 
but "xyx" is not. One 'y' can balance multiple 'x's. Return true if the given 
string is xy-balanced.
*/
public boolean xyBalance(String str) {
  for (int i=str.length()-1; i >=0; i--) {
    if (str.charAt(i) == 'x') return false;
    else if (str.charAt(i) == 'y') return true;
  }
  return true;


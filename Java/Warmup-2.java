/*
Given a string and a non-negative int n, return a larger 
string that is n copies of the original string.
*/
public String stringTimes(String str, int n) {
  String result = "";
  for (int i=0; i < n; i++) {
    result += str;
  }
  
  return result;
}

/*
Given a string and a non-negative int n, we'll say that the 
front of the string is the first 3 chars, or whatever is 
there if the string is less than length 3. Return n copies 
of the front;
*/
public String frontTimes(String str, int n) {
  String front = "";
  String result = "";
  if (str.length() <= 3) {
    front = str;
  } else {
    front = str.substring(0, 3);
  }
  
  for (int i = 0; i < n; i++) {
    result += front;
  }
  
  return result;
}

/*
Count the number of "xx" in the given string. We'll say 
that overlapping is allowed, so "xxx" contains 2 "xx".
*/
int countXX(String str) {
  int count = 0;
  
  for (int i = 0; i < str.length()-1; i++) {
    if (str.charAt(i) == 'x' && str.charAt(i + 1) == 'x') count++;
  }
  
  return count;
}

/*
Given a string, return true if the first instance of "x" 
in the string is immediately followed by another "x".
*/
boolean doubleX(String str) {
  int firstOccurence = str.indexOf("x");
  if (firstOccurence == str.length()-1) {
    return false;
  } else {
    return (str.charAt(firstOccurence+1) == 'x');
  }
}

/*
Given a string, return a new string made of every other 
char starting with the first, so "Hello" yields "Hlo".
*/
public String stringBits(String str) {
  String result = "";
  for (int i=0; i < str.length(); i += 2) {
    result += str.charAt(i);
  }
  
  return result;
}

// Given a non-empty string like "Code" return a string like "CCoCodCode".
public String stringSplosion(String str) {
  String result = "";
  for (int i = 0; i < str.length(); i++) {
    result += str.substring(0, i + 1);
  }
  
  return result;
}

/*
Given a string, return the count of the number of times that a substring 
length 2 appears in the string and also as the last 2 chars of the string,
 so "hixxxhi" yields 1 (we won't count the end substring).
*/
 public int last2(String str) {
  if (str.length() < 2) return 0;
  int count = 0;
  String lastTwo = str.substring(str.length()-2);
  
  for (int i=0; i < str.length()-2; i++) {
    String stringTwo = str.substring(i, i+2);
    if (stringTwo.equals(lastTwo)) count++;
  }
  
  return count;
}

// Given an array of ints, return the number of 9's in the array.
public int arrayCount9(int[] nums) {
  int count = 0;
  
  for (int i=0; i<nums.length;i++) {
    if (nums[i] == 9) count++;
  }
  
  return count;
}

/*
Given an array of ints, return true if one of the first 4 elements
in the array is a 9. The array length may be less than 4.
*/
public boolean arrayFront9(int[] nums) {
  int arr = nums.length;
  
  if (arr > 4) arr = 4;
  for (int i=0; i<arr; i++) {
    if (nums[i] == 9) return true;
  }
  
  return false;
}

/*
Given an array of ints, return true if the sequence of
numbers 1, 2, 3 appears in the array somewhere.
*/
public boolean array123(int[] nums) {
  for (int i=0; i<nums.length-2; i++) {
    if (nums[i]==1 && nums[i+1]==2 && nums[i+2]==3) return true;
  }
  
  return false;
}

/*
Given 2 strings, a and b, return the number of the positions 
where they contain the same length 2 substring. So "xxcaazz" 
and "xxbaaz" yields 3, since the "xx", "aa", and "az" 
substrings appear in the same place in both strings.
*/
public int stringMatch(String a, String b) {
  int length = Math.min(a.length(), b.length());
  int count = 0;
  
  for (int i=0; i<length-1; i++) {
   String aTwo = a.substring(i, i+2);
   String bTwo = b.substring(i, i+2);
   if (aTwo.equals(bTwo)) count ++;
  }
  
  return count;
}

/*
Given a string, return a version where all the "x" have been removed. 
Except an "x" at the very start or end should not be removed.
*/
public String stringX(String str) {
  String result = "";
  
  for (int i=0; i<str.length(); i++) {
    if (!(i > 0 && i < (str.length()-1) && str.charAt(i) == 'x')) {
      result += str.substring(i, i+1);
    }
  }
  
  return result;
}

/*
Given a string, return a string made of the chars at 
indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".
*/
public String altPairs(String str) {
  String result = "";
  
  for (int i=0; i<str.length(); i+= 4) {
    int end = i + 2;
    if (end > str.length()) {
      end = str.length();
    }
    result += str.substring(i, end);
  }
  
  return result;
}

/*
Suppose the string "yak" is unlucky. Given a string, return a
 version where all the "yak" are removed, but the "a" can be 
 any char. The "yak" strings will not overlap.
*/
 public String stringYak(String str) {
  String result = "";
  
  for (int i=0; i<str.length(); i++) {
    if (i+2<str.length() && str.charAt(i)=='y' && str.charAt(i+2)=='k') {
      i =  i + 2;
    } else { 
      result = result + str.charAt(i);
    }
  }
  
  return result;
}

/*
Given an array of ints, return the number of times that 
two 6's are next to each other in the array. Also count 
instances where the second "6" is actually a 7.
*/
public int array667(int[] nums) {
  int count = 0;
  
  for (int i=0; i<nums.length-1; i++) {
    if (nums[i] == 6 && nums[i+1] == 6 || nums[i] == 6 && nums[i+1] == 7) count++; 
  }
  
  return count;
}

/*
Given an array of ints, we'll say that a triple is a 
value appearing 3 times in a row in the array. Return 
true if the array does not contain any triples.
*/
public boolean noTriples(int[] nums) {
  for (int i=0; i<nums.length-2; i++) {
    if (nums[i] == nums[i+1] && nums[i+1] == nums[i+2]) return false;
  }
  
  return true;
}

/*
Given an array of ints, return true if it contains 
a 2, 7, 1 pattern: a value, followed by the value plus 
5, followed by the value minus 1. Additionally the 271 c
ounts even if the "1" differs by 2 or less from the correct value.
*/
public boolean has271(int[] nums) {
  for (int i=0; i<nums.length-2; i++) {
    if (nums[i+1] == (nums[i] + 5) && Math.abs(nums[i+2] - (nums[i]-1)) <= 2) return true;
  }
  
  return false;
}

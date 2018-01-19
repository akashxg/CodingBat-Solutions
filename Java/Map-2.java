/*
Given an array of strings, return a Map<String, Integer> containing a key for 
every different string in the array, always with the value 0. For example the s
tring "hello" makes the pair "hello":0. We'll do more complicated counting 
later, but for this problem the value is simply 0.
*/
public Map<String, Integer> word0(String[] strings) {
  Map<String, Integer> map = new HashMap<String, Integer>();
  for (String s : strings) {
    map.put(s,0);
  }
  return map;
}

/*
Given an array of strings, return a Map<String, Integer> containing a key 
for every different string in the array, and the value is that string's length.
*/
public Map<String, Integer> wordLen(String[] strings) {
  Map<String, Integer> map = new HashMap<String, Integer>();
  for (String s : strings) {
    map.put(s, s.length());
  }
  return map;
}

/*
Given an array of non-empty strings, create and return a Map<String, String> 
as follows: for each string add its first character as a key with its last 
character as the value.
*/
public Map<String, String> pairs(String[] strings) {
  Map<String, String> map = new HashMap<String, String>();
  for (String s : strings) {
    map.put(s.substring(0,1), s.substring(s.length()-1));
  }
  return map;
}

/*
The classic word-count algorithm: given an array of strings, return a 
Map<String, Integer> with a key for each different string, with the value 
the number of times that string appears in the array.
*/
public Map<String, Integer> wordCount(String[] strings) {
  Map<String, Integer> map = new HashMap<String, Integer>();
  for (String s : strings) {
    if (!map.containsKey(s)) {
      map.put(s, 1);
    } else {
      int count = map.get(s);
      map.put(s, count + 1);
    }
  }
  return map;
}

/*
Given an array of non-empty strings, return a Map<String, String> with a 
key for every different first character seen, with the value of all the 
strings starting with that character appended together in the order they 
appear in the array.
*/
public Map<String, String> firstChar(String[] strings) {
  Map<String, String> map = new HashMap<String, String>();
  for (String s : strings) {
    map.put(s.substring(0,1), (map.get(s.substring(0,1)) == null ? "" : map.get(s.substring(0,1))) +s);
  }
  return map;
}

/*
Loop over the given array of strings to build a result string like this: 
when a string appears the 2nd, 4th, 6th, etc. time in the array, append 
the string to the result. Return the empty string if no string appears a 2nd time.
*/
public String wordAppend(String[] strings) {
  String result = "";
  Map<String, Integer> map = new HashMap<String, Integer>();
  for (String s : strings) {
    int i = 0;
    if (map.containsKey(s)) {
      i = map.get(s)+1;
      map.put(s, i);
      if (i%2 == 0) {
        result += s;
      }
    } else {
      map.put(s, i+1);
    }
  }
  return result;
}

/*
Given an array of strings, return a Map<String, Boolean> where each different string 
is a key and its value is true if that string appears 2 or more times in the array.
*/
public Map<String, Boolean> wordMultiple(String[] strings) {
  Map<String, Boolean> map = new HashMap<String, Boolean>();
  for (String s:strings) {
    if (!map.containsKey(s)) map.put(s,false);
    else map.put(s,true);
  }
  return map;
}


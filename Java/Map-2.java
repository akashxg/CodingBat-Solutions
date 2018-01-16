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

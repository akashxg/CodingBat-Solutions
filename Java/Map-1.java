/*
mapBully:
Modify and return the given map as follows: if the key "a" has a value, set the key "b" 
to have that value, and set the key "a" to have the value "". Basically "b" is a bully, 
taking the value and replacing it with the empty string.
*/
public Map<String, String> mapBully(Map<String, String> map) {
  if (map.containsKey("a")){
    map.put("b", map.get("a"));
    map.put("a", "");
  }
  
  return map;
}

/*
mapShare:
Modify and return the given map as follows: if the key "a" has a value, set the key "b" to 
have that same value. In all cases remove the key "c", leaving the rest of the map unchanged.
*/
public Map<String, String> mapShare(Map<String, String> map) {
  if (map.containsKey("a")){
    map.put("b", map.get("a"));
  }
  
  map.remove("c");
  return map;
}

/*
mapAB:
Modify and return the given map as follows: for this problem the map may or may not contain 
the "a" and "b" keys. If both keys are present, append their 2 string values together and 
store the result under the key "ab".
*/
public Map<String, String> mapAB(Map<String, String> map) {
  if (map.containsKey("a") && map.containsKey("b")){
    map.put("ab", (map.get("a") + map.get("b")));
  }
  
  return map;
}

/*
topping1:
Given a map of food keys and topping values, modify and return the map as follows: if the 
key "ice cream" is present, set its value to "cherry". In all cases, set the key "bread" 
to have the value "butter".
*/
public Map<String, String> topping1(Map<String, String> map) {
  if (map.containsKey("ice cream")){
    map.put("ice cream", "cherry");
  }
  
  map.put("bread", "butter");
  return map;
}

/*
topping2:
Given a map of food keys and their topping values, modify and return the map as follows: 
if the key "ice cream" has a value, set that as the value for the key "yogurt" also. If 
the key "spinach" has a value, change that value to "nuts".
*/
public Map<String, String> topping2(Map<String, String> map) {
  if (map.containsKey("ice cream")){
    map.put("yogurt", (map.get("ice cream")));
    if (map.containsKey("spinach")){
      map.put("spinach", "nuts");
    }
  }
  
  return map;
}

/*
topping3:
Given a map of food keys and topping values, modify and return the map as follows: if the 
key "potato" has a value, set that as the value for the key "fries". If the key "salad" has 
a value, set that as the value for the key "spinach".
*/
public Map<String, String> topping3(Map<String, String> map) {
  if (map.containsKey("potato")){
    map.put("fries", (map.get("potato")));
  }  
  
  if (map.containsKey("salad")){
    map.put("spinach", (map.get("salad")));
  }
 
 return map; 
}

/*
mapAB3:
Modify and return the given map as follows: if exactly one of the keys "a" or "b" 
has a value in the map (but not both), set the other to have that same value in the map.
*/
public Map<String, String> mapAB3(Map<String, String> map) {
  if (map.containsKey("a") && map.containsKey("b")){
    return map;
  }
  
  if (map.containsKey("a")){
    map.put("b", (map.get("a")));
  }
  
  if (map.containsKey("b")){
    map.put("a", (map.get("b")));
  }
  
  return map;
}

/*
mapAB4:
Modify and return the given map as follows: if the keys "a" and "b" have values that have 
different lengths, then set "c" to have the longer value. If the values exist and have the 
same length, change them both to the empty string in the map.
*/
public Map<String, String> mapAB4(Map<String, String> map) {
  if (map.containsKey("a") && map.containsKey("b")){
    if (map.get("a").length() != map.get("b").length()){
      if (map.get("a").length() > map.get("b").length()){
        map.put("c", (map.get("a")));
      } else {
        map.put("c", (map.get("b")));
      }
    } else {
      map.put("a", "");
      map.put("b", "");
    }
  }
  
  return map;
}


// Return the number of even ints in the given array.
public int countEvens(int[] nums) {
  int count = 0;
  for (int i:nums){
    if (i % 2 == 0){
      count += 1;
    }
  }  
  return count;
}

// Given an array length 1 or more of ints, return the difference 
// between the largest and smallest values in the array.
public int bigDiff(int[] nums) {
  int large = nums[0];
  int small = nums[0];
  
  for (int i:nums){
    if (large < i){
      large = i;
    } else if (i <= small){
      small = i; 
    }
  }
  return (large - small);
}


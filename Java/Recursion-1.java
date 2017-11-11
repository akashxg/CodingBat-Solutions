// 	Given n of 1 or more, return the factorial of n, which is 
// n * (n-1) * (n-2) ... 1. Compute the result recursively (without loops).
public int factorial(int n) {
  if (n == 1) return 1;
  
  return n * factorial(n-1);
}


/* We have a number of bunnies and each bunny has two big floppy ears. 
We want to compute the total number of ears across all the bunnies 
recursively (without loops or multiplication).
*/
public int bunnyEars(int bunnies) {
  if (bunnies == 0){
    return 0;
  } else {
    return 2 + bunnyEars(bunnies - 1);
  }
}

/*
The fibonacci sequence is a famous bit of mathematics, and it happens to have a recursive definition. 
The first two values in the sequence are 0 and 1 (essentially 2 base cases). Each subsequent value is 
the sum of the previous two values, so the whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13, 21 and so on. 
Define a recursive fibonacci(n) method that returns the nth fibonacci number, with n=0 representing 
the start of the sequence.
*/
public int fibonacci(int n) {
  if (n <= 1) return n;
  
  return fibonacci(n - 1) + fibonacci(n - 2);
}


/*
We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies (1, 3, ..) have the normal 
2 ears. The even bunnies (2, 4, ..) we'll say have 3 ears, because they each have a raised foot. 
Recursively return the number of "ears" in the bunny line 1, 2, ... n 
(without loops or multiplication)
*/
public int bunnyEars2(int bunnies) {
  if (bunnies == 0) return 0;
  
  if (bunnies % 2 != 0){
    return 2 + bunnyEars2(bunnies - 1);  
  }
  
  return 3 + bunnyEars2(bunnies - 1);
}

/*
We have triangle made of blocks. The topmost row has 1 block, the next row down has 2 blocks, 
the next row has 3 blocks, and so on. Compute recursively (no loops or multiplication) the total 
number of blocks in such a triangle with the given number of rows.
*/
public int triangle(int rows) {
  if (rows <= 1) return rows;
  
  return rows + triangle(rows - 1);
}

// Given a non-negative int n, return the sum of its digits recursively (no loops).
public int sumDigits(int n) {
  if (n <= 1) return n;
  
  return n % 10 + sumDigits(n / 10);
}

/*
Given a non-negative int n, return the count of the occurrences of 7 as a digit, 
so for example 717 yields 2.
*/
public int count7(int n) {
  if (n == 0) return 0;
  
  if (n % 10 == 7) {
    return 1 + count7(n/10);
  }
  
  return count7(n / 10);
}

/*
Given a non-negative int n, compute recursively (no loops) the count of the occurrences 
of 8 as a digit, except that an 8 with another 8 immediately to its left counts double, 
so 8818 yields 4.
*/
public int count8(int n) {
  if (n == 0) return 0;
  
  if (n % 10 == 8) {
    if (n / 10 % 10 == 8) {
      return 2 + count8(n/10);
    }
    return 1 + count8(n/10);
  }
  
  return count8(n / 10);
}

/*
Given base and n that are both 1 or more, compute recursively (no loops) the value of 
base to the n power, so powerN(3, 2) is 9 (3 squared).
*/
public int powerN(int base, int n) {
  if (n == 1) return base;
  
  return base * powerN(base, n - 1);
}

// Given a string, compute recursively (no loops) the number of lowercase 'x' 
// chars in the string.
public int countX(String str) {
  if (str.length() == 0) return 0;
  
  if (str.charAt(0) == 'x') {
    return 1 + countX(str.substring(1));
  }
  
  return countX(str.substring(1));
}

// Given a string, compute recursively (no loops) the number of times lowercase 
// "hi" appears in the string.
public int countHi(String str) {
  if (str.length() < 2) return 0;
  
  if (str.charAt(0) == 'h' && str.charAt(1) == 'i') { 
    return 1 + countHi(str.substring(2));
  }
  
  return countHi(str.substring(1));
}

// Given a string, compute recursively (no loops) a new string where all the lowercase 
// 'x' chars have been changed to 'y' chars.
public String changeXY(String str) {
  if (str.length() == 0) return str;
  
  if (str.charAt(0) == 'x') {
    return 'y' + changeXY(str.substring(1));
  }
  
  return str.charAt(0) + changeXY(str.substring(1)); 
}


// Given a string, compute recursively (no loops) a new string where all appearances 
// of "pi" have been replaced by "3.14".
public String changePi(String str) {
  if (str.length() < 2) return str;
  
  if (str.charAt(0) == 'p' && str.charAt(1) == 'i') {
    return "3.14" + changePi(str.substring(2));
  }
  
  return str.charAt(0) + changePi(str.substring(1));
}

// Given a string, compute recursively a new string where all the 'x' chars have 
// been removed.
public String noX(String str) {
  if (str.length() == 0) return str;
  
  if (str.charAt(0) == 'x') {
    return noX(str.substring(1));
  }
  
  return str.charAt(0) + noX(str.substring(1));
}

/*
Given an array of ints, compute recursively if the array contains a 6. We'll use the convention 
of considering only the part of the array that begins at the given index. In this way, a recursive 
call can pass index+1 to move down the array. The initial call will pass in index as 0.
*/
public boolean array6(int[] nums, int index) {
  if (index == nums.length) return false;
  
  if (nums[index] == 6) {
    return true;
  }
  
  return array6(nums, index + 1);
}

/*
Given an array of ints, compute recursively the number of times that the value 11 appears in the array.
We'll use the convention of considering only the part of the array that begins at the given index. 
In this way, a recursive call can pass index+1 to move down the array. The initial call will pass 
in index as 0.
*/
public int array11(int[] nums, int index) {
  if (index == nums.length) return 0;
  
  if (nums[index] == 11) {
    return 1 + array11(nums, index + 1);
  }
  
  return array11(nums, index + 1);
}

/*
Given an array of ints, compute recursively if the array contains somewhere a value followed 
in the array by that value times 10. We'll use the convention of considering only the part of the 
array that begins at the given index. In this way, a recursive call can pass index+1 to move down 
the array. The initial call will pass in index as 0.
*/
public boolean array220(int[] nums, int index) {
  if (index >= nums.length - 1) return false;
  
  if (nums[index] * 10 == nums[index + 1]) {
    return true;
  }
  
  return array220(nums, index + 1);
}

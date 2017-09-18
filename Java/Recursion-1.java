// 	Given n of 1 or more, return the factorial of n, which is 
// n * (n-1) * (n-2) ... 1. Compute the result recursively (without loops).
public int factorial(int n) {
  if (n == 1) return 1;
  
  return n * factorial(n-1);
}


// We have a number of bunnies and each bunny has two big floppy ears. 
// We want to compute the total number of ears across all the bunnies 
// recursively (without loops or multiplication).
public int bunnyEars(int bunnies) {
  if (bunnies == 0){
    return 0;
  } else {
    return 2 + bunnyEars(bunnies - 1);
  }
}

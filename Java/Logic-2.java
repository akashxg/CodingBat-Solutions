/*
We want to make a row of bricks that is goal inches long. We have a number of small 
bricks (1 inch each) and big bricks (5 inches each). Return true if it is possible 
to make the goal by choosing from the given bricks. This is a little harder than it 
looks and can be done without any loops.
*/
public boolean makeBricks(int small, int big, int goal) {
  if (goal > small + big*5) return false;
  if (goal % 5 > small) return false;
  return true;
}

/*
Given 3 int values, a b c, return their sum. However, if one of the values 
is the same as another of the values, it does not count towards the sum.
*/
public int loneSum(int a, int b, int c) {
  if (a==b&&b==c) return 0;
  if (a==b) return c;
  if (b==c) return a;
  if (a==c) return b;
  return a+b+c;
}

/*
Given 3 int values, a b c, return their sum. However, if one of the values 
is 13 then it does not count towards the sum and values to its right do not 
count. So for example, if b is 13, then both b and c do not count.
*/
public int luckySum(int a, int b, int c) {
  if (a==13) return 0;
  if (b==13) return a;
  if (c==13) return a+b;
  return a+b+c;
}

/*
Given 3 int values, a b c, return their sum. However, if any of the values is 
a teen -- in the range 13..19 inclusive -- then that value counts as 0, except 
15 and 16 do not count as a teens. Write a separate helper "public int fixTeen(int n) 
{"that takes in an int value and returns that value fixed for the teen rule. In this 
way, you avoid repeating the teen code 3 times (i.e. "decomposition"). Define the helper 
below and at the same indent level as the main noTeenSum().
*/
public int fixTeen(int n) {
  if (n == 15 || n == 16) return n;
  if (13 <= n && n <=19) return 0;
  return n;
}

public int noTeenSum(int a, int b, int c) {
  return (fixTeen(a) + fixTeen(b) + fixTeen(c));
}

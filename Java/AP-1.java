// Given an array of scores, return true if each score is equal or greater than the one before. 
public boolean scoresIncreasing(int[] scores) {
  for (int i = 1; i < scores.length; i ++){
    if (scores[i] < scores[i - 1]){
      return false;
    }
  }
  return true;
}

// Given an array of scores, return true if there are scores of 100 next to each other in the array.
public boolean scores100(int[] scores) {
  for (int i = 1; i < scores.length; i++){
    if (scores[i] == 100){
      if (scores[i - 1] == 100){
        return true;
      }
    }
  }
  return false;
}

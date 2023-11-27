public class Min_Steps_To_One {
  public static int countMinStepsToOne(int n) {
    int[] storage = new int[n+1];
    return countMinStepsToOne(n, storage);
  }

  public static int countMinStepsToOne(int n, int[] storage) {
    if(n==1 || n==0){
      storage[n] = 0;
      return storage[n];
    }
    if(storage[n]!=0){
      return storage[n];
    }
    int op1 = countMinStepsToOne(n-1,storage);
    int min = op1;
    if(n%3==0){
      int op2 = countMinStepsToOne(n/3,storage);
      if(op2<min){
        min = op2;
      }
    }
    if(n%2==0){
      int op3 = countMinStepsToOne(n/2,storage);
      if(op3<min){
        min = op3;
      }
    }
    storage[n] = 1 + min;
    return storage[n];
  }
}

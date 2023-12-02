public class Knapsack {
  public static int knapsack(int[] weights, int[] values, int n, int maxWeight){
    return knapsack(weights, values, n, maxWeight,0);
  }
  public static int knapsack(int[] weights, int[] values, int n, int maxWeight,int i) {
    if(n==0 || i >= weights.length){
      return 0;
    }
    if(weights[i]<=maxWeight){
      return Math.max(values[i] + knapsack(weights, values, n-1, maxWeight-weights[i],i+1),knapsack(weights, values, n, maxWeight,i+1));
    }else{
      return knapsack(weights, values, n, maxWeight,i+1);
    }
  }
}

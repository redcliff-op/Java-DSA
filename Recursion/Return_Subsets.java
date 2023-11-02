public class Return_Subsets {
  public static int[][] subsethelper(int arr[], int start){
    if (start>arr.length-1){
        int output[][] = new int[1][0];
        return output;
    }
    int[][] smallAns = subsethelper(arr, start+1);
    int ans[][] = new int [2*smallAns.length][];
  
    for(int i = 0; i<smallAns.length; i++){
        ans[i] = new int[smallAns[i].length];
        for(int j = 0; j<smallAns[i].length; j++){
            ans[i][j] = smallAns[i][j];
        }
    }
    for(int i = smallAns.length; i<ans.length; i++){
        ans[i] = new int[smallAns[i-smallAns.length].length+1];
        ans[i][0] = arr[start];
        for(int j = 1; j<ans[i].length; j++){
            ans[i][j] = smallAns[i-smallAns.length][j-1];
        }
    }
    
    return ans;   
  }
  public static int[][] subsets(int input[]) {
    return subsethelper(input, 0);
  }
}

public class All_Indexes {
  public static int[] allIndexes(int input[], int x){
    return allIndexesHelper(input, x, 0, 0);
  }
  public static int[] allIndexesHelper(int input[],int x,int index,int foundSoFar){
    if(index==input.length){
      int answer[] = new int[foundSoFar];
      return answer;
    }
    if(input[index]==x){
      int answer[] = allIndexesHelper(input, x, index+1, foundSoFar+1);
      answer[foundSoFar]=index;
      return answer;
    }else{
      int answer[] = allIndexesHelper(input, x, index+1, foundSoFar);
      return answer;
    }
  }
  public static void main(String[] args) {
    int temp[] = {1,2,3,45,2,2,4,1,5,4,2,1,5,2};
    int answer[] = allIndexes(temp, 2);
    for(int e:answer){
      System.out.print(e+" ");
    }
  }
}

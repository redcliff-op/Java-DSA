public class Split_Array {
  public static boolean splitArray(int input[]) {
		return splitArrayHelper(input,0,0,0);
	}
  public static boolean splitArrayHelper(int input[],int i,int rsum, int lsum){
    if(input.length==i){
      if(rsum==lsum){
        return true;
      }else{
        return false;
      }
    }
    if(input[i]%5==0){
      lsum += input[i];
    }else if(input[i]%3==0){
      rsum += input[i];
    }else{
      return splitArrayHelper(input, i+1, rsum+input[i], lsum) || splitArrayHelper(input, i+1, rsum, lsum+input[i]); 
    }
    return splitArrayHelper(input, i+1, rsum, lsum);
  }  
  public static void main(String[] args) {
    int test[] = {1,4,3};
    System.out.println(splitArray(test));
  }
}

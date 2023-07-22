public class Sum_Of_Array {
  public static int sum(int input[]) {
    return sumHelper(input, 0);
 	}
  public static int sumHelper(int input[],int index){
    if(index==input.length){
      return 0;
    }
    return input[index] + sumHelper(input,index+1);
  }
  public static void main(String[] args) {
    int test[] = {1,2,3,4};
    System.out.println(sum(test));
  }
}

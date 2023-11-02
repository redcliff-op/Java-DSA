public class Return_Permutations {
  public static String[] permutationOfString(String input){
    if(input.length()==0){
      String res[] = {""};
      return res;
    }
		String recans[] = permutationOfString(input.substring(1));
    String result[] = new String[recans.length*input.length()];
    int k = 0;
    for(int i=0;i<recans.length;i++){
      for(int j=0;j<=recans[i].length();j++){
        result[k++] = recans[i].substring(0, j) + input.charAt(0) + recans[i].substring(j);
      }
    }
    return result;
	}
  public static void main(String[] args) {
    String test[] = permutationOfString("abc");
    for(String s:test){
      System.out.println(s);
    }
  }
}

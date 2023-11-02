public class Remove_Consecutive_Duplicates{
  public static String removeConsecutiveDuplicates(String input){
    if(input.length()==0||input.length()==1){
      return input;
    }
    if(input.charAt(0)==input.charAt(1)){
      return ""+removeConsecutiveDuplicates(input.substring(1));
    }else{
      return input.charAt(0)+removeConsecutiveDuplicates(input.substring(1));
    }
  }
  public static void main(String[] args) {
    System.out.println(removeConsecutiveDuplicates("Helloolmfaoooo"));
  }
}
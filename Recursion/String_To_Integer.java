public class String_To_Integer {
  public static int convertStringToInt(String input){
    if(input.length()==1){
      int temp = input.charAt(0) - 48;
      return temp;
    }
    return (input.charAt(0)-48)*((int)Math.pow(10,input.length()-1))+convertStringToInt(input.substring(1));
  }
  public static void main(String[] args) {
    System.out.println(convertStringToInt("31212"));
  }
}

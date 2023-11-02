public class Replace_Characters_Recursively {
  public static String replaceCharacter(String input, char c1, char c2) {
    if(input.length()==0){
      return input;
    }
    if(input.charAt(0)==c1){
      return c2 + replaceCharacter(input.substring(1), c1, c2);
    }else{
      return input.charAt(0) + replaceCharacter(input.substring(1), c1, c2);
    }
	}  
  public static void main(String[] args) {
    System.out.println(replaceCharacter("HelloLmao",'o','i'));
  }
}

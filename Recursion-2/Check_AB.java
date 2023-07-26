public class Check_AB {
  
  public static boolean checkAB(String input) {
    if(input.length()==0){
      return true;
    }
    if(input.charAt(0)=='a'){
      if(input.length()>1 && (input.charAt(1)=='b'&&input.charAt(2)=='b')){
        return checkAB(input.substring(3));
      }else{
        return checkAB(input.substring(1));
      }
    }
    return false;
	}
  public static void main(String[] args) {
    System.out.println(checkAB("ab"));
  }
}

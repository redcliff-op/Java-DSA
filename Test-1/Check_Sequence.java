public class Check_Sequence {
  public static boolean checkSequence(String a, String b) {
    if(a.length()==0){
      return false;
    }
    if(b.length()==0){
      return true;
    }
    if(a.charAt(0)==b.charAt(0)){
      return checkSequence(a.substring(1), b.substring(1));
    }else{
      return checkSequence(a.substring(1),b);
    }
	}
  public static void main(String[] args) {
    String a = "abchjsgsuohhdhyrikkknddg";
    String b = "coding";
    System.out.println(checkSequence(a, b));
  }
}

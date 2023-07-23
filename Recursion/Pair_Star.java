public class Pair_Star {
  public static String addStar(String input){
    if(input.length()==0||input.length()==1){
      return input;
    }
    if(input.substring(0, 1).equals(input.substring(1, 2))){
      return input.charAt(0)+"*"+addStar(input.substring(1));
    }else{
      return input.charAt(0) + addStar(input.substring(1));
    }
  }
  public static void main(String[] args) {
    String temp = "hellosirrlmaoo";
    System.out.println(addStar(temp));
  }
}

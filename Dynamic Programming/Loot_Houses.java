public class Loot_Houses {
  public static int maxMoneyLooted(int[] houses) {
    if(houses.length==0){
      return 0;
    }
    int result[] = new int[houses.length+1];
    result[0] = houses[0];
    result[1] = Math.max(houses[1], houses[0]);
    for(int i=2;i<houses.length;i++){
      result[i] = Math.max(houses[i] + result[i-2],result[i-1]);
    }
    return result[houses.length-1];
  }
}

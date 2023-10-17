class Pair<T,U>{
  public T minimum;
  public U maximum;
  public Pair(T minimum, U maximum){
    this.minimum = minimum;
    this.maximum = maximum;
  }
}

public class Minimum_And_Maximum {
  public static Pair<Integer, Integer> getMinAndMax(BinaryTreeNode<Integer> root) {
    if(root==null){
      Pair<Integer,Integer> output = new Pair<Integer,Integer>(Integer.MAX_VALUE, Integer.MIN_VALUE);
      return output;
    }
    int minimum = Integer.MAX_VALUE;
    int maximum = Integer.MIN_VALUE;
    if(root.data<minimum){
      minimum = root.data;
    }
    if(root.data>maximum){
      maximum = root.data;
    }
    Pair<Integer,Integer> left = getMinAndMax(root.left);
    Pair<Integer,Integer> right = getMinAndMax(root.right);
    int min = Math.min(minimum,Math.min(left.minimum, right.minimum));
    int max = Math.max(maximum,Math.max(left.maximum, right.maximum));
    Pair<Integer,Integer> output = new Pair<Integer,Integer>(min,max);
    return output;
  }
}

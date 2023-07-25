public class Binary_Search {
  public static int searchHelper(int nums[], int target, int low, int high){
    if(low==high){
      return -1;
    }
    int mid = (low+high)/2;
    if(nums[mid]==target){
      return mid;
    }else if(target>nums[mid]){
      return searchHelper(nums,target,mid+1,high);
    }else{
      return searchHelper(nums,target,low,mid-1);
    }
    
  }
  public static int search(int []nums, int target) {
    return searchHelper(nums,target,0,nums.length-1);
  }
  public static void main(String[] args) {
    int test[] = {1,2,5,7,8,9,11,15,168,5454};
    System.out.println(search(test,5));
  }
}

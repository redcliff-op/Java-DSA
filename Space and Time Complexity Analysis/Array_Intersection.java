import java.util.Arrays;

public class Array_Intersection {
  public static void intersection(int[] arr1, int[] arr2) {
    Arrays.sort(arr1);
    Arrays.sort(arr2);
    if(arr1.length<=arr2.length){
      for(int i=0;i<arr2.length;i++){
        if(Arrays.binarySearch(arr1,arr2[i])>=0){
          System.out.print(arr2[i]+" ");
        }
      }
    }else{
      for(int i=0;i<arr1.length;i++){
        if(Arrays.binarySearch(arr2,arr1[i])>=0){
          System.out.print(arr1[i]+" ");
        }
      }
    }
  }


  // Method 2

  public static void intersection2(int[] arr1, int[] arr2) {
    Arrays.sort(arr1);
    Arrays.sort(arr2);

    int i = 0, j = 0;

    while (i < arr1.length && j < arr2.length) {
        if (arr1[i] == arr2[j]) {
            System.out.print(arr1[i] + " ");
            i++;
            j++;
        } else if (arr1[i] < arr2[j]) {
            i++;
        } else {
            j++;
        }
    }
}
}

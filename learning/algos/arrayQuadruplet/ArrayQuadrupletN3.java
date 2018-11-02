import java.io.*;
import java.util.*;

class ArrayQuadrupletN3 {
  
  static int[] findArrayQuadruplet(int[] arr, int s) {
    // your code goes here
    Arrays.sort(arr);
    int n = arr.length;
    for(int i=0;i<n-3;i++) {
      for(int j=i+1;j<n-2;j++) {
        int r = s-(arr[i]+arr[j]);
        int low = j+1;
        int high = n-1;
        while(low<high) {
          if(arr[low]+arr[high]<r) {
            low++;
          } else if (arr[low]+arr[high]>r) {
            high--;
          } else {
            return new int[]{arr[i], arr[j], arr[low], arr[high]};
          }
        }
      }
    }
    return new int[]{};
  }

  public static void main(String[] args) {
    int arr[] = new int[]{2, 7, 4, 0, 9, 5, 1, 3};
    int s=20;
    int res[] = findArrayQuadruplet(arr, s);
    if(res.length>0) {
      System.out.println("["+res[0]+", "+res[1]+", "+res[2]+", "+res[3]+"]");
    } else {
      System.out.println("[]");
    }
  }

}
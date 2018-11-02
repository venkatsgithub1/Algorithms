import java.io.*;
import java.util.*;

class ArrayQuadrupletOptimizedn4 {
  
  static int[] findArrayQuadruplet(int[] arr, int s) {
    // your code goes here
    Arrays.sort(arr);
    int n = arr.length;
    for(int i=0;i<n-3;i++) {
      for(int j=i+1;j<n-2;j++) {
        for(int k=j+1;k<n-1;k++) {
          for(int l=k+1;l<n;l++) {
            if(arr[i]+arr[j]+arr[k]+arr[l]==s) {
              return new int[]{arr[i], arr[j], arr[k], arr[l]};
            }
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
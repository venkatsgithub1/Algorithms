import java.io.*;
import java.util.*;

class ArrayQuadrupletn4 {
  
  static int[] findArrayQuadruplet(int[] arr, int s) {
    // your code goes here
    List<Integer> list = new ArrayList<>();
    List<Integer> temp = new ArrayList<>();
    int n = arr.length;
    for(int i=0;i<n-3;i++) {
      for(int j=i+1;j<n-2;j++) {
        for(int k=j+1;k<n-1;k++) {
          for(int l=k+1;l<n;l++) {
            if(arr[i]+arr[j]+arr[k]+arr[l]==s) {
              temp.clear();
              temp.add(arr[i]);
              temp.add(arr[j]);
              temp.add(arr[k]);
              temp.add(arr[l]);
              Collections.sort(temp);
              
              if(list.size()==temp.size()) {
                if(list.get(0)>temp.get(0)) {
                  list.clear();
                  list.addAll(temp);
                }
              } else {
                list.addAll(temp);
              }
            }
          }
        }
      }
    }
    if(list.size()>0) {
      return new int[]{list.get(0),list.get(1),list.get(2),list.get(3)};
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
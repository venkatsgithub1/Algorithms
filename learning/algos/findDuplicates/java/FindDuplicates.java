import java.io.*;
import java.util.*;

class FindDuplicates {

  static int[] findDuplicates(int[] arr1, int[] arr2) {
    // your code goes here
    Set<Integer> set = new HashSet<>();
    List<Integer> list = new ArrayList<>();
    for(int i=0;i<arr1.length;i++) {
      set.add(arr1[i]);
    }
    for(int i=0;i<arr2.length;i++) {
      if(set.contains(arr2[i]) && !list.contains(arr2[i])) {
        list.add(arr2[i]);
      }
    }
    int res[] = new int[list.size()];
    Collections.sort(list);
    for(int i=0;i<list.size();i++) {
      res[i]=list.get(i);
    }
    return res;
  }

  public static void main(String[] args) {
	int res[] = findDuplicates(new int[]{1, 2, 3, 5, 6, 7}, new int[]{3, 6, 7, 8, 20});
    for(Integer i:res) {
      System.out.println(i);
    }
  }

}
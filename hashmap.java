import java.util.*;
public class hashmap {
 public static void main(String[] args) {
    HashMap<Integer,Integer> map=new HashMap<>();
    int a[]={1,2,3,4,5,2,1,2,4,3,4,3,1};
    for (int i = 0; i < a.length; i++) {
        map.put(a[i],map.getOrDefault(a[i], 0)+1);
    }
    for (Map.Entry<Integer,Integer> i : map.entrySet()) {
        System.out.println(i.getKey()+" "+i.getValue());
    }
 }   
}

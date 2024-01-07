import java.util.*;

public class frequency {
    public static void main(String[] args) {
        int arr[]={2,2,3,4,4,5,4};
        HashMap<Integer,Integer> hs=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            hs.put(arr[i],hs.getOrDefault(arr[i],0)+1);
        }

        for(int i:hs.keySet()){
            System.err.print(i+"->"+hs.get(i)+" ");
        }
        System.err.println();
    }
}

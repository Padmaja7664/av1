
import java.util.*;

public class rank {
    public static void main(String[] args) {
        int arr[]={20, 15, 2, 2, 98, 6};
        HashMap<Integer,Integer> hs=new HashMap<>();
        int a[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            a[i]=arr[i];
        }
        Arrays.sort(a);
        int j=1;
        for(int i:a){
            if(!hs.containsKey(i)){
                hs.put(i,j);
                j++;
            }  
        }
        for(int i=0;i<arr.length;i++){
            System.err.print(hs.get(arr[i])+" ");
        }
        System.err.println();
    }
}

import java.util.*;

public class rmvDupFrmUnsorted {
    
    public static void main(String[] args) {
        int arr[]={2,2,2,1,1,0,4,4,3,2};
        HashMap<Integer,Integer> hs=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(!hs.containsKey(arr[i])){
                System.err.print(arr[i]+" ");
                //System.err.println();
                hs.put(arr[i],1);
            }
            
        }
    }
}

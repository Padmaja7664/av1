import java.util.*;
public class repeatingEle {
    
    public static void main(String[] args) {
        int arr[]={2,4,2,2,2,9};
        //find repeating element in arr  TC->O(n) SC->O(n)

        HashMap<Integer,Integer> hs =new HashMap<>();
        for(int i:arr){
            hs.put(i,hs.getOrDefault(i,0)+1);
        }
        for(int i:hs.keySet()){
            if(hs.get(i)>1){
                System.err.print(i+" ");
            }   
        }
        System.err.println();
        for(int i:hs.keySet()){
            if(hs.get(i)==1){
                System.err.print(i+" ");
            } 
        }
        System.err.println();
    }
}

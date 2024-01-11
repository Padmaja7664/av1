import java.util.*;

public class symmetricPair {
    public static void main(String[] args) {
        int arr[][]={{1,0},{0,1},{2,3},{3,0},{0,3},{2,2}};
        HashMap<Integer,Integer> hs=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int first=arr[i][0];
            int sec=arr[i][1];
            if(hs.get(sec)!=null && hs.get(sec)==first){
                System.err.print(first+" "+sec+" ");
                System.err.println();
            }
            else{
                hs.put(first,sec);
            }
                
        }
    }
}

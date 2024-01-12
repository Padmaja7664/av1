import java.util.*;

public class maxProd {
    int arr[]={1,-1,2,3,4,5,-1};
        int n=arr.length;
        int pref=1;
        int suff=1;
        
        int prod=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(pref==0) pref=1;
            if(suff==0) suff=1;
            pref*=arr[i];
            suff*=arr[n-i-1];
            prod=Math.max(prod,Math.max(pref,suff));
        }
        System.err.println(prod);
}

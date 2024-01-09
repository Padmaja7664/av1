import java.util.*;

public class NextPermutation {

    //the next permutation is nothing but like the dictionary words 
    //here we need to find the array in which when the elements are combined are just greater than previous 
    //eg {1,2,3}->123 so next permutation is {1,3,2}->132

    public static List<Integer> solve(List<Integer> li){
        int n=li.size();
        int ind=-1; //the breakdown index
        for(int i=n-2;i>=0;i--){
            if(li.get(i)<li.get(i+1)){
                ind=i;
                break;
                //once we get the break down point we break the loop
            }
        }
        if(ind==-1){
            //if we didn't get the breakdown point then we reverse the whole array
            Collections.reverse(li);
            return li;
        }
        for(int i=n-1;i>ind;i--){
            if(li.get(i)>li.get(ind)){
                //swap a[ind] and a[i]
                int temp=li.get(i);
                li.set(i,li.get(ind));
                li.set(ind,temp);
                break;
            }
        }
        List<Integer> rev=li.subList(ind+1,n);
        Collections.reverse(rev);
        return li;
    }

    public static void main(String[] args) {
        List<Integer> li=Arrays.asList(new Integer[]{1,2,3});
       // List<Integer> ans=solve(li);
        System.err.println(solve(li));
    }
    
}

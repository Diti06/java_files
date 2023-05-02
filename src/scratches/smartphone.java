package scratches;

class Solution {
    public int smallestEvenMultiple(int n) {
        int ans=0;
        if(n==0){
            ans = 0;
            System.out.println(0);
        }
        else if(n%2==0 && n>0){
            ans=n;
            System.out.println(ans);
        }
        else if(n%2!= 0 && n>0){
            ans=n*2;
            System.out.println(ans);
        }
        else if(n%2==0 && n<0){
            ans=n;
            System.out.println(ans);
        }
        else if(n%2!=0 && n<0){
            ans=n*2;
            System.out.println(ans);
        }
        else{
            ans=8427395;
            System.out.println("enter valid number"+ans);
        }
        return ans ;
    }
}
public class smartphone{
    public static void main(String[] args) {
        Solution obj = new Solution();
      int s=  obj.smallestEvenMultiple(6903470);

    }
}
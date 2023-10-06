class Solution {
    public int integerBreak(int n) {
        if(n==2) return 1;
        if(n==3) return 2;
        
        int count3=n/3;
        int rem=n%3;
        
        if(rem==0)
            return (int)Math.pow(3,count3);
   else if(rem==1)
            return (int)Math.pow(3,count3-1)*4;
    else
            return (int)Math.pow(3,count3)*2;
        
    }
}
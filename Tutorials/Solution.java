class Solution {
    public int reverse(int x) {
        int y;
        int rev = 0;
        if(x<0){
            x = x*(-1);
            while(x!=0){
                rev = rev*10 + x%10;
                x = x/10;
            }
            y = rev*(-1);
        }
        else if(x>0){
            while(x!=0){
                rev = rev*10 + x%10;
                x = x/10;
            }
            y = rev;
        }
        else if(x==0){
            y = rev;
        }
        
        return(y);
    }
}
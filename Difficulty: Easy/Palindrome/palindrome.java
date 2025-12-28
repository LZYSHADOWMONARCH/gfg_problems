class Solution {
    public boolean isPalindrome(int n) {
        // code here
        int x=n;
        int reverse=0;
        while(n>0){
            int ld=n%10;
            n=n/10;
            reverse=reverse*10+ld;
            
        }
        if(reverse == x){
            return true;
        }
        else{
            return false;
        }
    }
}
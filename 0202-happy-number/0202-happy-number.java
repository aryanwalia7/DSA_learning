class Solution {
    public int fuc(int temp){
        int sum=0;
        while(temp>0){
            int t=temp%10;
            temp=temp/10;
            sum+=t*t;

        }
        return sum;
    }
    public boolean isHappy(int n) {
        int slow=n;
        int fast=n;
        while(fast!=1){
            slow=fuc(slow);
            fast=fuc(fast);
            fast=fuc(fast);
            if(slow==fast&&slow!=1){
                return false;
            }
           
        }
        return true;
    }
}
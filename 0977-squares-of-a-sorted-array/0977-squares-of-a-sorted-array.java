class Solution {
    public int[] sortedSquares(int[] nums) {
        ArrayList<Integer> pos=new ArrayList<>();
        ArrayList<Integer> neg= new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0){
                pos.add(nums[i]);
            }else{
                neg.add(nums[i]);
            }
        }
        if(neg.size()==0){
            for(int i=0;i<nums.length;i++){
                nums[i]=nums[i]*nums[i];
            }
            return nums;
        }else if(pos.size()==0){
            for(int i=0;i<nums.length;i++){
                nums[i]=nums[i]*nums[i];
            }
            int l=0; int r=nums.length-1;
            while(l<r){
                int temp=nums[l];
                nums[l]=nums[r];
                nums[r]=temp;
                l++;
                r--;
            }
            return nums;

        }
        for(int i=0;i<pos.size();i++){
            pos.set(i,pos.get(i)*pos.get(i));
        }
        for(int i=0;i<neg.size();i++){
            neg.set(i,neg.get(i)*neg.get(i));
        }
        Collections.reverse(neg);
        int i=0; int j=0; int k=0;
        while(i<neg.size()&&j<pos.size()){
            if(neg.get(i)<=pos.get(j)){
                nums[k]=neg.get(i);
                i++;
                k++;
            }else{
                nums[k]=pos.get(j);
                j++;
                k++;
            }
        }
        while(i<neg.size()){
            nums[k]=neg.get(i);
            i++;
            k++;
        }
        while(j<pos.size()){
            nums[k]=pos.get(j);
            j++;
            k++;
        }
        return nums;
    }
}
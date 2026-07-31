// class Solution {
//     public int kthFactor(int n, int k) {
//         ArrayList<Integer> ans= new ArrayList<>();
//         ans.add(1);
//         for(int i=1;i<=n;i++){
//             if(n%i==0) ans.add(i);
//         }
//         if(k>=ans.size()) return -1;
//         return(ans.get(k));
        
//     }
// }
class Solution {
    public int kthFactor(int n, int k) {
        int c=0;
        for(int i=1;i<=n;i++){
            if(n%i==0) {
                ++c;
            if(c==k) return i;
            }
        }
        return -1; 
    }
}
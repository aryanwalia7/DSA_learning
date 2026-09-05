// class Solution {

//     public int climb(int n,int arr[]){
//         if(n==0) return 1;
//         if(n<0) return 0;
//         if(arr[n]!=0){
//             return arr[n];
//         }

//         arr[n]=climb(n-1,arr)+climb(n-2,arr);
//         return arr[n];
//     }
//     public int climbStairs(int n) {
//        int arr[]=new int[n+1];
//        int a=climb(n,arr);
//        return a;
//     }
// }
class Solution {
    HashMap<Integer,Integer> map= new HashMap<>();
    public int climb(int i,int n){
       if(i==n)return 1;
       if(i>n) return 0;
       if(map.containsKey(i)) return map.get(i);
       int ans=climb(i+1,n)+climb(i+2,n);
       map.put(i,ans);
       return ans;
    }
    public int climbStairs(int n) {
      return climb(0,n);
    }
}
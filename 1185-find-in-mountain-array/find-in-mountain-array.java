/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int binarySearch(int st,int end,MountainArray mountainArr,int target,boolean side){
         int ans=-1;
          while(st<=end){
            int mid=st+(end-st)/2;
              if(mountainArr.get(mid)==target){
                 ans=mid;
                 return ans;
              }else if(mountainArr.get(mid)<target){
                  if(side){
                      st=mid+1;
                  }else{
                    end=mid-1;
                  }
              }else{
                   if(side){
                     end=mid-1;
                   }else{
                      st=mid+1;
                   }
              }
          } 

          return ans;
    }
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int ans=-1;
        int peak=-1;
         int st=0;
         int end=mountainArr.length()-1;

         while(st<=end){
            int mid=st+(end-st)/2;

             if(mountainArr.get(mid)>mountainArr.get(mid+1)){
                peak=mid;
                end=mid-1;
             }else if(mountainArr.get(mid)<mountainArr.get(mid+1)){
                st=mid+1;
             }
         }
            
       int min=binarySearch(0,peak,mountainArr,target,true);
       int max=binarySearch(peak+1,mountainArr.length()-1,mountainArr,target,false);

         if(min!=-1){
            return min;
         }

         return max;
    }
}
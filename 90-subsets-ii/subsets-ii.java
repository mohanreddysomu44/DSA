class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
          findSol(nums,new ArrayList<>(),0);
          return ans;
    }
    
      void findSol(int []nums,List<Integer> sub,int ind){
             if(ind==nums.length){
                ans.add(new ArrayList<>(sub));
                return;
             }

             sub.add(nums[ind]);
             findSol(nums,sub,ind+1);
             sub.remove(sub.size()-1);
              int index=ind+1;
              while(index<nums.length && nums[index]==nums[index-1]){
                   index++;
              }
              findSol(nums,sub,index);
      }
     
}
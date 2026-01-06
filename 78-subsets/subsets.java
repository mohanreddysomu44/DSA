class Solution {
       List<List<Integer>> ans=new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
          List<Integer> sub=new ArrayList<>();
        findSol(nums,0,sub);           
          return ans;

    }

    public void findSol(int [] nums,int ind,List<Integer> sub){
          if(ind==nums.length){
              ans.add(new ArrayList<>(sub));
              return;
          }

              sub.add(nums[ind]);
              findSol(nums,ind+1,sub);
              sub.remove(sub.size()-1);
               findSol(nums,ind+1,sub);
          
    }
}
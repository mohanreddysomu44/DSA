class Solution {
     List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {        
        List<Integer> sub=new ArrayList<>();
        Arrays.sort(candidates);
        findSol(candidates,target,0,sub);
        return ans;
    }

    public void findSol(int [] candidates,int target,int inx,List<Integer> sub){
                 if(target==0){
                     ans.add(new ArrayList<>(sub));
                     return;
                 }

                 if(inx>=candidates.length){
                    return;
                 }

                 if(target<0){
                      return;
                 }

              if(candidates[inx]<=target){
                 sub.add(candidates[inx]);
                  findSol(candidates,target-candidates[inx],inx+1,sub);
                  sub.remove(sub.size()-1);
              }
                int j=inx+1;
                while(j<candidates.length && candidates[j]==candidates[inx]){
                     j++;
                }
              findSol(candidates,target,j,sub);

    }
}
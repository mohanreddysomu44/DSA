class Solution {
public:
    vector<string> restoreIpAddresses(string s) {
        vector<string> ans;
         backtracking(0,"",0,ans,s);
         return ans;
    }
    void  backtracking(int start,string current,int dots,vector<string>& ans,string s){
         if(dots==4 && start==s.size()){
             ans.push_back(current);
             return;
         }
         if(dots>=4 || start>=s.size()){
            return;
         }
         for(int len=1;len<=3;len++){
            string part=s.substr(start,len);
            if(isValid(part)){
             string next=(current.size()==0)?part:current+"."+part;
              backtracking(start+len,next,dots+1,ans,s);
            }
         }
    }
   bool isValid(string part) {
    if (part.size() > 3) return false;
    if (part.size() > 1 && part[0] == '0') return false; 
    int p = stoi(part);
    return p >= 0 && p <= 255;
}
};
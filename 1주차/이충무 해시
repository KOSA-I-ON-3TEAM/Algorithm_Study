#include<unordered_map>
#include<vector>
#include<string>


class Solution {
public:
    vector<int> findDuplicates(vector<int>& nums) {
        unordered_map<int,int> h;
        vector<int> v;
        
        for(int i=0;i<nums.size();i++){
            h[nums[i]]++;
        }
        
        for(auto e : h){
            if(e.second > 1)
                v.push_back(e.first);
        }
        
        return v;
    }
};

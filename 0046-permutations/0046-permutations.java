class Solution {
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        dfs(new ArrayList<>(), nums);
        return result;
    }

    public void dfs(List<Integer> subset, int[]nums){
        if(subset.size() == nums.length){
            result.add(new ArrayList<>(subset));
            return;
        }
        
        for(int i=0; i<nums.length;i++){
            if(subset.contains(nums[i])) continue;
            subset.add(nums[i]);
            dfs(subset, nums);
            subset.remove(subset.size()-1);
        }
    }
}
class Solution {
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        
        dfs(0, new ArrayList<>(), nums);
        
        return result;
    }

    public void dfs(int index, List<Integer> subset, int[]nums){
        result.add(new ArrayList<>(subset));
        
        for(int i=index; i<nums.length;i++){
            subset.add(nums[i]);
            dfs(i+1, subset, nums);
            subset.remove(subset.size()-1);
        }
    }
}
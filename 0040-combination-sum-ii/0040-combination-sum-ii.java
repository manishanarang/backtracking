class Solution {
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        dfs(0, candidates, new ArrayList<>(),0, target);
        return result;
    }
    
    public void dfs(int i, int[] candidates, List<Integer> subset, int sum, int target){
        
        if(sum == target){
            result.add(new ArrayList<>(subset));
            return;
        }
        if(i >= candidates.length || sum > target){
            return;
        }
        
        
        subset.add(candidates[i]);
        dfs(i+1, candidates, subset, sum+candidates[i], target);
        subset.removeLast();
        while((i+1)<candidates.length && candidates[i] == candidates[i+1]){
            i++;
        }
        
        dfs(i+1, candidates, subset, sum, target);
    }
}
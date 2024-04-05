class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        dfs(candidates, 0 , 0, new ArrayList<>(), target);
        return result;
    }

    public void dfs(int[] candidates, int index, int total, List<Integer> combination, int target){
        if(total == target){
            result.add(new ArrayList<>(combination));
            return;
        }
        else if(total > target) return;

        for (int i = index; i < candidates.length; ++i) {
             combination.add(candidates[i]);
             dfs(candidates, i, total+candidates[i], combination, target);
             combination.removeLast();
      }
    }

}
//https://www.geeksforgeeks.org/problems/all-unique-permutations-of-an-array/0

class Solution {
    static void swap(ArrayList<Integer> arr , int i,int j){
        int temp = arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j, temp);
    }
    
    static void solver(ArrayList<Integer> arr, int n, int pos, Set<ArrayList<Integer>> res){
        if (pos >= n) {
            res.add(new ArrayList<>(arr));
            return ;
        }
        for(int i=pos;i<n;i++){
            swap(arr,pos,i);
            solver(arr,n,pos+1,res);
            swap(arr,pos,i);
        }
    }
    static ArrayList<ArrayList<Integer>> uniquePerms(ArrayList<Integer> arr , int n) {
        Set<ArrayList<Integer>> res = new HashSet<>();
        solver(arr,n,0,res);
        ArrayList<ArrayList<Integer>> result = new ArrayList<>(res);
        Collections.sort(result, (a, b) -> {
            for (int i = 0; i < a.size() && i < b.size(); i++) {
                if (!a.get(i).equals(b.get(i))) {
                    return a.get(i) - b.get(i);
                }
            }
            return a.size() - b.size();
        });
        return result;
    }
};
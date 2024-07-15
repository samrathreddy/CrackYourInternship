//https://www.geeksforgeeks.org/problems/chocolate-distribution-problem3825/1
class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        Collections.sort(a);
        int i=0;
        int min = Integer.MAX_VALUE;
        for(int j=m-1;j<n;j++){
            min=Math.min(min,a.get(j)-a.get(i++));
        }
        return min;
    }
}
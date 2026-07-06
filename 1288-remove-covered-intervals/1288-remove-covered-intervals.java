class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        int cnt = 0;

        for (int i = 0; i < intervals.length; i++) {
            int a = intervals[i][0];
            int b = intervals[i][1];
            boolean covered = false;
            for (int j = 0; j < intervals.length; j++) {
                int c = intervals[j][0];
                int d = intervals[j][1];
                if (i != j && (c <= a && d >= b)) {
                    covered = true;
                    break;
                }
            }
            if (!covered) {
                cnt++;
            }
        }
        return cnt;
    }
}

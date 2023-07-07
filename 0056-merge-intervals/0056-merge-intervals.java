class Solution {
    public int[][] merge(int[][] intervals) {
      Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        int index = 0;
        for (int[] interval : intervals) {
            if (index > 0 && interval[0] <= intervals[index - 1][1]) {
                intervals[index - 1][1] = Math.max(intervals[index - 1][1], interval[1]);
            } else {
                intervals[index++] = interval;
            }
        }

        return Arrays.copyOf(intervals, index);
    }
}
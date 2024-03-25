//   452. Minimum Number of Arrows to Burst Balloons     (Leetcode)


class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, Comparator.comparingInt(interval -> interval[1]));
        int arrowCount = 0;
        long lastArrowPosition = Long.MIN_VALUE;
      
        for (int[] interval : points) {   
            if (interval[0] > lastArrowPosition) {
                arrowCount++;  
                lastArrowPosition = interval[1];  
            }
        }

        return arrowCount;
    }
}

class Solution {
    static class Point implements Comparable<Point> {
        int x;
        int y;
        int sq;
        int i;

        public Point(int x, int y, int sq, int i) {
            this.x = x;
            this.y = y;
            this.sq = sq;
            this.i = i;
        }

        @Override
        public int compareTo(Point p2) {
            return this.sq - p2.sq;
        }
    }

    public int[][] kClosest(int[][] points, int k) {

        PriorityQueue<Point> pq = new PriorityQueue<>();

        for (int i = 0; i < points.length; i++) {
            int sq = points[i][0] * points[i][0] +
                     points[i][1] * points[i][1];

            pq.add(new Point(points[i][0], points[i][1], sq, i));
        }

        int[][] ans = new int[k][2];

        for (int i = 0; i < k; i++) {
            Point p = pq.remove();
            ans[i][0] = p.x;
            ans[i][1] = p.y;
        }

        return ans;
    }
}
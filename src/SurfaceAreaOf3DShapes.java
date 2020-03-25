/**892.三维形体的表面积
 * 在 N * N 的网格上，我们放置一些 1 * 1 * 1  的立方体。
 *
 * 每个值 v = grid[i][j] 表示 v 个正方体叠放在对应单元格 (i, j) 上。
 *
 * 请你返回最终形体的表面积。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：[[2]]
 * 输出：10
 * 示例 2：
 *
 * 输入：[[1,2],[3,4]]
 * 输出：34
 * 示例 3：
 *
 * 输入：[[1,0],[0,2]]
 * 输出：16
 * 示例 4：
 *
 * 输入：[[1,1,1],[1,0,1],[1,1,1]]
 * 输出：32
 * 示例 5：
 *
 * 输入：[[2,2,2],[2,1,2],[2,2,2]]
 * 输出：46
 *  
 *
 * 提示：
 *
 * 1 <= N <= 50
 * 0 <= grid[i][j] <= 50
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/surface-area-of-3d-shapes
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。*/
public class SurfaceAreaOf3DShapes {
    //98.68 75
    public int surfaceArea(int[][] grid) {
        int area = 0;
        int n = grid.length;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                int num = grid[i][j];
                if (num > 0) {
                    area += num * 4 + 2;
                    if (j < n - 1) {
                        area -= Math.min(num, grid[i][j + 1]) * 2;
                    }
                    if (i < n - 1) {
                        area -= Math.min(num, grid[i + 1][j]) * 2;
                    }
                }
            }
        }
        return area;
    }

    public static void main(String[] args){
        SurfaceAreaOf3DShapes surfaceAreaOf3DShapes = new SurfaceAreaOf3DShapes();
        System.out.println(surfaceAreaOf3DShapes.surfaceArea(new int[][]{{2}}));
        System.out.println(surfaceAreaOf3DShapes.surfaceArea(new int[][]{{1,2},{3,4}}));
        System.out.println(surfaceAreaOf3DShapes.surfaceArea(new int[][]{{1,0},{0,2}}));
        System.out.println(surfaceAreaOf3DShapes.surfaceArea(new int[][]{{1,1,1},{1,0,1},{1,1,1}}));
        System.out.println(surfaceAreaOf3DShapes.surfaceArea(new int[][]{{2,2,2},{2,1,2},{2,2,2}}));
    }
}

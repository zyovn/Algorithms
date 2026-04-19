import java.util.*;

class Solution {
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    public int solution(int[][] maps) {
        int answer = 0;
        visited = new boolean[maps.length][maps[0].length];
        
        bfs(0, 0, maps);
        
        answer = maps[maps.length - 1][maps[0].length - 1];
        
        if (answer == 1) return -1;
        else return answer;
    }
    
    private void bfs(int x, int y, int maps[][]) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x, y});
        visited[x][y] = true;
        
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int cx = cur[0];
            int cy = cur[1];
            
            for (int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];
                
                if (nx < 0 || nx >= maps.length || ny < 0 || ny >= maps[0].length) continue;
                if (!visited[nx][ny] && maps[nx][ny] == 1) {
                    visited[nx][ny] = true;
                    maps[nx][ny] = maps[cx][cy] + 1;
                    q.add(new int[]{nx, ny});
                }
            }
        }
    }
}
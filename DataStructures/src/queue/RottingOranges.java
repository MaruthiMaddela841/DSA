package queue;

import java.util.LinkedList;
import java.util.Queue;

// https://leetcode.com/problems/rotting-oranges/
// MULTI-SOURCE BFS
public class RottingOranges {
	
	//Without extra class
	public int orangesRotting(int[][] grid) {
        Queue<int[]> queue=new LinkedList<>();
        int fresh=0;
        int min=0;
        int[] dr = {-1, 1, 0, 0};
        int[] dc = { 0, 0,-1, 1};

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2){
                    queue.add(new int[]{i, j});
                }else if(grid[i][j]==1){
                    fresh++;
                }
            }
        }
        if(fresh==0) return 0;
        while(!queue.isEmpty()){
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] p=queue.poll();
                for(int r=0;r<dr.length;r++){
                    int nr=p[0]+dr[r];
                    int nc=p[1]+dc[r];
                    if(nr >= 0 && nr < grid.length && nc >= 0 && nc < grid[0].length){
                        if(grid[nr][nc] == 1){
                            grid[nr][nc] =2;
                            fresh--;
                            if(fresh==0) return min+1;
                            queue.add(new int[]{nr,nc});
                        }
                    }
                }
            }
            min++;
        }
        return -1;
    }
	
	//WithExtraClass
	public int orangesRottingWithClass(int[][] grid) {
        Queue<Position> queue=new LinkedList<>();
        int fresh=0;
        int min=0;
        int[] dr = {-1, 1, 0, 0};
        int[] dc = { 0, 0,-1, 1};

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2){
                    queue.add(new Position(i,j));
                }else if(grid[i][j]==1){
                    fresh++;
                }
            }
        }
        if(fresh==0) return 0;
        while(!queue.isEmpty()){
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Position p=queue.poll();
                for(int r=0;r<dr.length;r++){
                    int nr=p.row+dr[r];
                    int nc=p.col+dc[r];
                    if(nr >= 0 && nr < grid.length && nc >= 0 && nc < grid[0].length){
                        if(grid[nr][nc] == 1){
                            grid[nr][nc] =2;
                            fresh--;
                            if(fresh==0) return min+1;
                            queue.add(new Position(nr,nc));
                        }
                    }
                }
            }
            min++;
        }
        return -1;
    }
}

class Position{
    int row;
    int col;
    public Position(int row,int col){
        this.row=row;
        this.col=col;
    }
}

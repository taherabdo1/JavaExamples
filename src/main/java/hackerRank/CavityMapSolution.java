package hackerRank;

import java.util.Scanner;

public class CavityMapSolution {

	 void solveCavityMap() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String grid[] = new String[n];
        for(int grid_i=0; grid_i < n; grid_i++){
            grid[grid_i] = in.next();
        }
        for(int i=1; i < n-1; i++){
           for(int j=1; j < n-1; j++){
            if(grid[i].charAt(j) > grid[i-1].charAt(j) && grid[i].charAt(j) > grid[i].charAt(j+1)&& grid[i].charAt(j) > grid[i].charAt(j-1) && grid[i].charAt(j) > grid[i+1].charAt(j)){
                grid[i] = grid[i].substring(0, j) + "X"+ grid[i].substring(j+1, grid[i].length());
            }
           }       
        }
        for(int grid_i=0; grid_i < n-1; grid_i++){
            System.out.println(grid[grid_i]);
        }        
        System.out.print(grid[n-1]);

    }
}

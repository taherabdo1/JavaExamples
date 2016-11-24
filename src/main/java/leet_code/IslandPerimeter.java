package leet_code;

/**
 * 
 * URL: https://leetcode.com/contest/leetcode-weekly-contest-10/problems/island-
 * perimeter/
 * 
 * You are given a map in form of a two-dimensional integer grid where 1
 * represents land and 0 represents water. Grid cells are connected
 * horizontally/vertically (not diagonally). The grid is completely surrounded
 * by water, and there is exactly one island (i.e., one or more connected land
 * cells). The island doesn't have "lakes" (water inside that isn't connected to
 * the water around the island). One cell is a square with side length 1. The
 * grid is rectangular, width and height don't exceed 100. Determine the
 * perimeter of the island.
 * 
 */
public class IslandPerimeter {
	int result = 0;
	boolean[][] visited;

	public int islandPerimeter(int[][] grid) {
		visited = new boolean[grid.length][grid[0].length];
		// go for the first node of the island

		for (int i = 0; i < grid.length; i++) {
			boolean flag = false;
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j] == 1) {
					getIslandPerimeterForNode(grid, i, j);
					flag = true;
					break;
				}
			}
			if(flag)
				break;
		}
		return result;
	}

	private void getIslandPerimeterForNode(int[][] grid, int v, int h) {
		visited[v][h] = true;
		int adjacentNodesCount = countAdjacent(grid, v, h);

		if (result == 0 && adjacentNodesCount == 0) {
			result = 4;
			return;
		}
		// base case to break the recursion
		if (adjacentNodesCount == 0)
			return;

		result += (4 - adjacentNodesCount);

		if (v < grid.length - 1) {
			if (grid[v + 1][h] == 1 && visited[v + 1][h] == false) {
				getIslandPerimeterForNode(grid, v + 1, h);
			}
		}

		if (v > 0) {
			if (grid[v - 1][h] == 1 && visited[v - 1][h] == false) {
				getIslandPerimeterForNode(grid, v - 1, h);
			}
		}

		if (h < grid[0].length - 1) {
			if (grid[v][h + 1] == 1 && visited[v][h + 1] == false) {
				getIslandPerimeterForNode(grid, v, h + 1);
			}
		}

		if (h > 0) {
			if (grid[v][h - 1] == 1 && visited[v][h - 1] == false) {
				getIslandPerimeterForNode(grid, v, h - 1);
			}
		}

	}

	private int countAdjacent(int[][] matrix, int v, int h) {
		int result = 0;

		if (v > 0) {
			if (matrix[v - 1][h] == 1)
				result++;
		}
		if (v < matrix.length - 1) {
			if (matrix[v + 1][h] == 1)
				result++;
		}
		if (h > 0) {
			if (matrix[v][h - 1] == 1)
				result++;
		}
		if (h < matrix[0].length - 1) {
			if (matrix[v][h + 1] == 1)
				result++;
		}

		return result;

	}

	public static void main(String[] args) {
		IslandPerimeter testObject = new IslandPerimeter();
		int[][] islandMatrix = { { 0, 1, 0, 0 }, { 1, 1, 1, 0 },
				{ 0, 1, 0, 0 }, { 1, 1, 0, 0 } };
		int[][] islandMatrix2 = { { 1, 0 } };
		int[][] islandMatrix3 = { { 0, 1 } };

		System.out.println(testObject.islandPerimeter(islandMatrix));
		testObject.result = 0;
		System.out.println(testObject.islandPerimeter(islandMatrix2));
		testObject.result = 0;
		System.out.println(testObject.islandPerimeter(islandMatrix3));

	}
}

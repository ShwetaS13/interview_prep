package com.cracking.recursionAndDynamicProg;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by Shweta on 8/22/2017.
 * <p>
 * Cracking the coding interview - Chapter 8 - Recursion and Dynamic Programming
 * <p>
 * Imagine a robot sitting on the upper left corner of grid with r rows and c columns.
 * The robot can only move in two directions, right and down, but certain cells are "off limits" such that
 * the robot cannot step on them.
 * Design an algorithm to find a path for the robot from the top left to the bottom right.
 */
public class RobotInAGrid {

    public static void main(String[] args) {
        boolean[][] grid = new boolean[3][3];
        RobotInAGrid rg = new RobotInAGrid();
        System.out.println(rg.getPath(grid));

    }

    public ArrayList<Point> getPath(boolean[][] grid) {
        if (grid == null || grid.length == 0) {
            return null;
        }
        ArrayList<Point> path = new ArrayList<>();
        HashSet<Point> failedPoints = new HashSet<>();
        if (getPath(grid, grid.length, grid[0].length - 1, path, failedPoints)) {
            return path;
        }

        return null;
    }

    private boolean getPath(boolean[][] grid, int row, int column, ArrayList<Point> path, HashSet<Point> failedPoints) {
        if (row < 0 || column < 0 || !grid[row][column]) {
            return false;
        }

        Point p = new Point(row, column);

        if (failedPoints.contains(p)) {
            return false;
        }

        boolean isAtOrigin = (row == 0) && (column == 0);

        if (isAtOrigin || getPath(grid, row - 1, column, path, failedPoints) || getPath(grid, row, column - 1, path, failedPoints)) {
            path.add(p);
            return true;
        }

        failedPoints.add(p);
        return false;
    }

    /**
     * My solution - goes from source to destination
     */
    private ArrayList<Point> mySolution(boolean[][] grid) {
        if (grid == null || grid.length <= 0) {
            return null;
        }

        HashSet<Point> failedPoints = new HashSet<>();
        ArrayList<Point> path = new ArrayList<>();

        if(mySolution(grid, 1, 1, path, failedPoints)){
            return path;
        }

        return null;
    }

    private boolean mySolution(boolean[][] grid, int row, int col, ArrayList<Point> path, HashSet<Point> failedPoints){
        if(row >= grid.length || col >= grid[row].length || !grid[row][col]){
            return false;
        }

        Point p = new Point(row, col);
        if(failedPoints.contains(p)){
            return false;
        }

        boolean isAtDestination = ((row == grid.length - 1) && (col == grid[row].length - 1));
        if(isAtDestination || mySolution(grid, row + 1, col, path, failedPoints) || mySolution(grid, row, col + 1, path, failedPoints)){
            path.add(p);
            return true;
        }

        failedPoints.add(p);
        return false;
    }

}

class Point{
    int row;
    int column;

    public Point(int row, int column) {
        this.row = row;
        this.column = column;
    }
}
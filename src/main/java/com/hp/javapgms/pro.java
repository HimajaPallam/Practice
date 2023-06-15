/*
 * package com.hp.javapgms;
 * 
 * import java.util.Scanner;
 * 
 * public class pro {
 * 
 * public static void funcHopSkipJump(int[][] matrix) { // Write your code here
 * int n = matrix.length; int m = matrix[0].length; int row=0,col=0; int
 * direction = 0; int[] dx = {0,1,0,-1}; int[] dy = {1,0,-1,0}; boolean[][]
 * visited = new boolean[n][m]; while(true){ if(visited[row][col]){ break; }
 * visited[row][col] = true; int nextRow = row+dx[direction]; int nextCol =
 * col+dy[direction]; if(nextRow >=0 && nextRow<n && nextCol >=0 && nextCol <m
 * && !visited[nextRow][nextCol]){ row = nextRow; col = nextCol; } else{
 * direction = (direction +1) % 4; row += dx[direction]; col += dy[direction]; }
 * } System.out.println(matrix[row][col]); }
 * 
 * public static void main(String[] args) { Scanner in = new Scanner(System.in);
 * // input for matrix int matrix_row = in.nextInt(); int matrix_col =
 * in.nextInt(); int matrix[][] = new int[matrix_row][matrix_col]; for(int idx =
 * 0; idx < matrix_row; idx++) { for(int jdx = 0; jdx < matrix_col; jdx++) {
 * matrix[idx][jdx] = in.nextInt(); } }
 * 
 * 
 * funcHopSkipJump(matrix); } }
 * 
 * 
 * 
 * 
 * 
 * //////////////////////////////////////////////////////////////////// public
 * class Solution { public static int funcSum(int[] inputArr) { int answer = 0;
 * // Write your code here int maxEnd =0; //traversing for(int i: inputArr){
 * maxEnd = maxEnd+i; maxEnd = Integer.max(maxEnd,0); answer =
 * Integer.max(answer,maxEnd); }
 * 
 * return answer; }
 * 
 * public static void main(String[] args) { Scanner in = new Scanner(System.in);
 * //input for inputArr int inputArr_size = in.nextInt(); int inputArr[] = new
 * int[inputArr_size]; for(int idx = 0; idx < inputArr_size; idx++) {
 * inputArr[idx] = in.nextInt(); }
 * 
 * int result = funcSum(inputArr); System.out.print(result);
 * 
 * } }
 * 
 * ///////////////////////////////////////////////////////////////////////
 * public class Solution { public static void funcSubstring(String inputStr) {
 * // Write your code here int n =inputStr.length(); String res =null;
 * boolean[][] dp = new boolean[n][n]; for(int i=n-1;i>0;i--){ for(int
 * j=i;j<n;j++){ dp[i][j] = inputStr.charAt(i)==inputStr.charAt(j) && (j-i<3 ||
 * dp[i+1][j-1]); if(dp[i][j] && (res==null || j-i+1 > res.length())){ res =
 * inputStr.substring(i,j+1); } } } if(res.length() ==1){
 * System.out.println("None"); } else{ System.out.println(res); }
 * 
 * }
 * 
 * public static void main(String[] args) { Scanner in = new Scanner(System.in);
 * 
 * // input for inputStr String inputStr = in.nextLine();
 * 
 * 
 * funcSubstring(inputStr); } }
 * 
 * ///////////////////////////////////////////////////////////////////////////
 * public class Solution { public static void funcHopSkipJump(int[][] matrix) {
 * // Write your code here int n = matrix.length; int m = matrix[0].length; int
 * row=0,col=0; int direction = 0; int[] dx = {0,1,0,-1}; int[] dy = {1,0,-1,0};
 * boolean[][] visited = new boolean[n][m]; while(true){ if(visited[row][col]){
 * break; } visited[row][col] = true; int nextRow = row+dx[direction]; int
 * nextCol = col+dy[direction]; if(nextRow >=0 && nextRow<n && nextCol >=0 &&
 * nextCol <m && !visited[nextRow][nextCol]){ row = nextRow; col = nextCol; }
 * else{ direction = (direction +1) % 4; row += dx[direction]; col +=
 * dy[direction]; } } System.out.println(matrix[row][col]); }
 * 
 * public static void main(String[] args) { Scanner in = new Scanner(System.in);
 * // input for matrix int matrix_row = in.nextInt(); int matrix_col =
 * in.nextInt(); int matrix[][] = new int[matrix_row][matrix_col]; for(int idx =
 * 0; idx < matrix_row; idx++) { for(int jdx = 0; jdx < matrix_col; jdx++) {
 * matrix[idx][jdx] = in.nextInt(); } }
 * 
 * 
 * funcHopSkipJump(matrix); } }
 */
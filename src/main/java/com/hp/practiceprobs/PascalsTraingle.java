package com.hp.practiceprobs;

import java.util.ArrayList;
import java.util.List;

public class PascalsTraingle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numRows = 5;
		List<List<Integer>> paslist = new ArrayList<>();
		
		if(numRows == 0) {
			System.out.println("Empty Paylist"); //0
		}
		
		List<Integer> row = new ArrayList<Integer>();
		row.add(1);
		paslist.add(row);
		
		for(int i=1; i<numRows;i++) {
			List<Integer> currentRow = new ArrayList<Integer>();
			currentRow.add(1);
			for(int j=1;j<i;j++) {
				currentRow.add(row.get(j)+row.get(j-1));
			}
			currentRow.add(1);
			paslist.add(currentRow);
			row = currentRow;
		}
		
		
		for(List<Integer> res:paslist) {
			for(int i=0;i< res.size();i++) {
				System.out.print(res.get(i)+" ");
			}
			System.out.println();
		}
	}

}

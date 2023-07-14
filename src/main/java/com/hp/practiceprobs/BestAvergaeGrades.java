package com.hp.practiceprobs;

import java.util.*;

public class BestAvergaeGrades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class TotalCount{
			int total;
			int count;
			TotalCount(int total, int count){
				this.total = total;
				this.count = count;
			}
			
		}
		
		
		String scores[][] = {{"Bob","-87"}, {"Mike", "-35"},{"Bob", "-52"},{}, {"Jason","-35"}, {"Mike", "55"}, {"Jessica", "-99"}};
		Map<String, TotalCount> map = new HashMap<>();
		
		if(scores.length == 0) {
			System.out.println("Dont proceed to next");
		}
		
		for(String score[]: scores) {
			if(score.length == 2) {
				if(map.containsKey(score[0])) {
					TotalCount tc = map.get(score[0]);
					tc.total += Integer.parseInt(score[1]);
					tc.count += 1;
					map.put(score[0], tc);
				} else {
					map.put(score[0], new TotalCount(Integer.parseInt(score[1]),1));
				}
			}
		}
		
		int maxScore = 0;
		String student ="";
		for(Map.Entry<String, TotalCount> em: map.entrySet()) {
			int avg = em.getValue().total / em.getValue().count ;
			if(maxScore < avg) {
				maxScore = avg;
				student = em.getKey();
			}
			
		}
		
		
		int score = map.entrySet().stream().map(em-> (em.getValue().total / em.getValue().count)).max(Integer::compare).get();
		
		System.out.println(student+" scored maximum average score of "+ score);

	}

}

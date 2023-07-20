package com.hp.practiceprobs;

import java.util.*;

public class DuplicatesToDelimiters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inMsg = "abccdefgggghijk";
		List<String> res = new ArrayList<String>();
		
		boolean flag = false;
		Stack<Character> impl = new Stack<Character>();
		impl.push(inMsg.charAt(0));
		for(int i=1;i<inMsg.length();i++) {
			if(!impl.empty() && inMsg.charAt(i) == impl.peek()) {
				flag = true;
			} else if(!flag || impl.empty()) {
				impl.push(inMsg.charAt(i));
			}else if(inMsg.charAt(i) != impl.peek() && flag){
				flag = false;
				impl.pop();
				String resStr = "";
				while(!impl.empty()) {
					resStr = impl.pop()+resStr;
				}
				res.add(resStr);
				impl.push(inMsg.charAt(i));
			}
			
			
			/*
			 * if(!flag) { if(!impl.empty() && inMsg.charAt(i) == impl.peek()) { flag =
			 * true; } else { impl.push(inMsg.charAt(i)); } } else if(inMsg.charAt(i) !=
			 * impl.peek() && flag){ flag = false; impl.pop(); String resStr = "";
			 * while(impl!=null) { resStr = impl.pop()+resStr; } res.add(resStr); }
			 */
		}
		String resStr = "";
		while(!impl.empty()) {
			resStr = impl.pop()+resStr;
		}
		res.add(resStr);
		res.forEach(System.out::println);
	}

}

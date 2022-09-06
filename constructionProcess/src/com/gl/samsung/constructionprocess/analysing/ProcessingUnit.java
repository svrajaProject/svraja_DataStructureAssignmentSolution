package com.gl.samsung.constructionprocess.analysing;

import java.util.Scanner;
import java.util.Stack;

public class ProcessingUnit {

	void implement() {
		Stack<Integer> stack = new Stack<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter len: ");
		int len = sc.nextInt();
		process(stack,len, sc);
		display(stack,len);
		print(stack,len);
	}

	void process(Stack<Integer> stack,int len,Scanner sc) {
		int counter=1;
		for (int i = 0; i < len; i++) {
			System.out.println("Day: "+counter++);
			int val = sc.nextInt();
			stack.push(val);
		}
	}

	void display(Stack<Integer> stack,int len) {
		for (int i = 0; i < 5; i++) {
			for (int j = 1; j <= i; j++) {
				if (stack.search(i) < stack.search(j)) {
					stack.add(i);
					stack.pop();
				}
			}
		}
	}

	void print(Stack<Integer> stack,int len) {
		int count = 1;
		for (int i = 0; i < 5; i++) {
			System.out.println("Day:" + count++);
			System.out.println(stack);
		}
	}

	public static void main(String[] args) {
		ProcessingUnit pu = new ProcessingUnit();
		pu.implement();
	}

}

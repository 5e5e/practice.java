package com.practices.Line;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
// 문제 설명
//유클리드 공간에서, 넓이가 N인 직사각형 두 변을 각각 w, h라 한다. 이때 가능한 w, h 중 |w - h|의 최솟값을 구하시오.
//
//조건
//사각형의 넓이 N (1 <= N <= 10^13), 변의 길이 w, h는 모두 자연수이다.
//
//입력 형식
//사각형 넓이 N을 표준 입력에서 읽는다.
//
//출력 형식
//|w - h|의 최솟값을 표준 출력에 쓴다.

public class A201903161번 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(args[0]);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int N = Integer.parseInt(args[0]);
		Set<Test> testList = new HashSet<>();
		for (int i = 1; i <= N; i++) {
			if (N % i == 0) {
				testList.add(new Test(i, N / i));
			}
		}
		int diff = Integer.MAX_VALUE;
		for (Test i : testList) {
			diff = Math.min(i.getResult(), diff);
		}
//		System.out.println(testList.size());
//		System.out.println(testList.get(0));
//		Collections.sort(testList);
//		System.out.println(testList.get(0));
		System.out.println(diff);
//		for (Test i : testList) {
//			System.out.println(i);
//		}

	}

	private static class Test {

		private int result;

		public Test(int a, int b) {
			this.result = Math.abs((a - b));
		}

//		@Override
//		public boolean equals(Object o) {
//			if (this == o) return true;
//			if (!(o instanceof Test)) return false;
//			Test test = (Test) o;
//			return result == test.result;
//		}
//
//		@Override
//		public int hashCode() {
//			return Objects.hash(result);
//		}
//
//		@Override
//		public String toString() {
//			return "|w - h|" +
//					result
//					;
//		}

//		@Override
//		public int compareTo(Test o) {
//			if (this.result > o.result) return 1;
//			else return -1;
//		}

		public int getResult() {
			return result;
		}
	}
}

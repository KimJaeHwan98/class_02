	package overloading;

import java.util.ArrayList;

class TestClass01 {
		public void sumFunc() { // 같은 썸펑션이여도 다른 데이터들
			System.out.println("n을가지고 연산합니다");
		}
		public void sumFunc(int n) {
			System.out.println("n을가지고 연산합니다!");
		}
		public void sumFunc(int n , int num) {
			System.out.println(n+num+"입니다");
		}
		public void sumFunc(String n , String num) { //문자열은 스트링
			System.out.println(n+num+"입니다");
		}
	}
	
	public class Ex01 {
	public static void main(String[] args) {
		TestClass01 t = new TestClass01();
		t.sumFunc();
		t.sumFunc(10);
		t.sumFunc(10,20);
		t.sumFunc("안녕" , "하세요");
		
		
	}
	}

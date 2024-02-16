package variable;

import java.util.Scanner;

public class Testclass {
	public String name , grade;
	public int kor,eng,math,sum;
	public double avg;
	
	
	public void inputData() {
		Scanner input = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		name = input.next();
		System.out.println("국어점수를 입력하세요");
		kor = input.nextInt();
		System.out.println("영어점수를 입력하세요");
		eng = input.nextInt();
		System.out.println("수학점수를 입력하세요");
		math = input.nextInt();
		System.out.println("---모두 입력 되었습니다--");
		
	}
	
	public void operationData() {
		sum = kor + eng + math;
		avg = sum/3;
		if(avg >=90) {
			grade = "A 등급";
		}else if(avg>=80) {
			grade = "b 등급";
		}else {
			grade = "c 등급";
		}
	
	}
	public void pirntData() {
		System.out.println("이름 :" + name);
		System.out.println("국어점수 :" + kor);
		System.out.println("영어점수 :" + eng);
		System.out.println("수학점수 :" + math);
		System.out.println("점수 합 :" + sum);
		System.out.println("평균 점수 : "+avg);
		System.out.println("등급 :" + grade);
	}

}

package variable;

import java.util.Scanner;

public class Testclass {
	public String name , grade; // 스트링으로 출력 받을 값을 미리 선정해준다
	public int kor,eng,math,sum; // 인트값으로 받을 변수를 입력해준다
	public double avg; // 소수점이 나올 수 있기때문에 더블로 평균값을 등록
	
	
	public void inputData() {// 문제를 출력해줄 값 메소드 생성 / 스캐너를 이용해서 직접 적을 수 있게 한다
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
	
	public void operationData() { // 기능구현 메소드 생성/합계,평군값,등급 을 출력해주는 기능을 구현한다 
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
	public void pirntData() { // 마지막으로 기능들을 출력해줄 메소드를 생성한다.
		System.out.println("이름 :" + name);
		System.out.println("국어점수 :" + kor);
		System.out.println("영어점수 :" + eng);
		System.out.println("수학점수 :" + math);
		System.out.println("점수 합 :" + sum);
		System.out.println("평균 점수 : "+avg);
		System.out.println("등급 :" + grade);
	}

}

package variable;
class Test06 {
	public static int su;
	public int num;
	
	public void test() {
		su = 1234;
	}
	public static int num;
	public static void test2() {
		num =123;
	}//미리 만들어진거에서 미리 만든걸 사용할 수 없다.
}
public class Ex06 { //메인도 클레스 내부에 메소드이다.
	static int num;
public static void main(String[] args) {
	test1();
	num = 123;
}
public static void test1() {
	num = 123;
	System.out.println(num);
}
}

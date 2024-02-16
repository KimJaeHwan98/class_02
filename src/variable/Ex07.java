package variable;
class Test07 {
	public static final String KOREA = "대한민국";
	public static int num;
	public int su;
	static {
		num = 12345;
	}
	public void test() {System.out.println("test호출");}
}
public class Ex07 {
public static void main(String[] args) {
	//final String KOREA = "대한민국";
	//KOREA = "미국";
	System.out.println(Test07.KOREA);
	System.out.println(Test07.num);
	
	//이렇게 사용도 가능하다 보통은 Static으로 사용한다
	Test07 t = new Test07();
	System.out.println(t.KOREA);
	t.test(); // 호출
	
}// 해당하는 값을 저장 할 수 없습니다. 파이널
}// static이랑 final을 같이 사용 가능하다.

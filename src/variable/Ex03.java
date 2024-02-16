package variable;

//여러 매소드에서 필요로하는 메소드는 클래스에 만드는게 좋다
public class Ex03 {
	public String name; // 인스턴스 변수로 만들어서 사용
	public void inputData() {
		String name = "홍길동";
		for(int i =0;;) {
			//이런 일회성 변수들은 객체안에다가 만든다.
		}
	}
	public void printData() {
		System.out.println(name);
	}
}

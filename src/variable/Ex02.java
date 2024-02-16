package variable;

class Test02 { //여기다 메소드를 생성하면 계속 사용이 가능하다.
	//한번 사용하기에 만들기에는 메모리 소모가 계속되기때문에 좋지않다.
	
	public int num; // 종속되어있는 안에서는 사용이 가능하다.
	public void test1() {
		num = 100;
		System.out.println("test1 :" + num);
	}
	public void test2() { 
		//인스턴스 변수다 뉴라는 변수를 통해서 만든 변수를 객체다라고 표현한다.
		// t라는 변수는 모든걸 다 가지고있다.
		//지역변수는 해당하는 지역을 벗어나면 사라진다. 여기는 (일회용)
		System.out.println("test2 :"+ num);
	}
}

public class Ex02 {
public static void main(String[] args) {
	Test02 t = new Test02();
	t.test1(); t.test2();
}
}
// 여러공간에서 사용할때는 class에 만들고 
// 특정공간 지역변수 void에 만든다
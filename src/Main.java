//인스턴스 내부 클래스 B,정적멤버 내부클래스C,로컬 지역클래스 D를 활용한 예제

public class Main {

	public static void main(String[] args) {
		A a= new A();
		A.B b =a.new B();
		b.field01 =3;
		b.method01();
		
		A.C c=new A.C();
		c.field01=3;
		c.method01();
		A.C.method02();
		
		a.method(); //로컬 지역클래스 객체 생성을 위한 메서드 호출
	}

}

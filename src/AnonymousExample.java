//익명 클래스 활용 예제
public class AnonymousExample {
  public static void main(String[] args) {
	Anonymous anony = new Anonymous();
	anony.field.wake();
	anony.method01();
	anony.method02(new Person(){
	void study() {
		System.out.println("공부를 합니다");
	}
	void wake() {
		System.out.println("8시에 일어납니다");
		study();
	}
	});
}
}

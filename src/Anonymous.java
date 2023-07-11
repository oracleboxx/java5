// 익명 클래스 문법
public class Anonymous {
	Person field = new Person() {
		void work() {
			System.out.println("출근 합니다");
		}
	};// 첫번째 익명클래스 = >Anonymous$1.class(외부클래스명$번호.class로 컴파일된다.
	void method01() {
		Person localVar = new Person() {
			void walk() {
				System.out.println("산책을합니다");
			}
			void wake() {
				System.out.println("7시에 일어납니다.");
				walk();
			}
		}; // 두번째 익명클래스 => Anonymous$2.class
		localVar.wake();
	}
	void method02(Person person) {
		person.wake(); //오버라이딩한 메서드 호출
	}
	
}

/* 메서드 호출이 끝이 나면 메서드 소속의 매개변수나 지역변수는 스택 하지만 해당 메서드 내부의 로컬 지역
 * 클래스 객체는 메서드 호출이 끝이 나도 메모리에 남아 있다. 로컬 지역 내부 클래스에서 메서드의 매개변수나 지역변수를 복사를
 * 해놓고 사용하다 보니 값 불일치 현상이 발생할 수 있다. 결국 로컬 지역 내부에서는 매개변수나 지역변수가 메모리에 남아 있어서 값ㅇ들
 * 변경하는 경우가 발생하면 값 불일치 현상이 발생하기 떄문에 메서드 소속의 매개변수나 지역변수는 값 수정을 못하게 jdk1.7이전 
 * 에서는 final상수로 선언해서 값 수정을 못하게 하고 jdk1.8이후부터는 final을 묵시적으로 생략해도 상수로 인식되어서 값을
 * 수정할 수 가 없다.
 */
public class Outter {
	public void method01(final int arg) {
		final int localVariable =1;
		//localVariable =100;
		class Inner{ // 로컬 지역 내부 클래스 => 외부클래스$1내부 클래스명.class(Outter$1Inner.class)
			
			public void method() {
				int result =arg + localVariable;
			}
		}
	}
	public void method02(int arg) { //int arg매개변수 앞에 final이 생략된 상수로 인식
		int localVariable=1;// final이 생략된 지역상수로 인식
		localVariable =100;
		class Inner{
			public void pr() {
				int result = arg + localVariable;
			}
		}
	}
}

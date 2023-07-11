/* 매개변수와 리턴타입이 없ㅅ는 함수형 인터페이스 정의
 * FunctionalInterface 특징)
 * 1.자바 8부터 @FuntionalInterface를 사용해서 함수형 인터페이스를 정의할 수 있다
 * 2. 함수형 인터페이스에는 오직 추상메서드가 하나만 올 수 있고, 하나의 추상메서드는 꼭 정의해야한다.
 * 3. 함수형 인터페이스는 람다식 타켓 타입으로 사용하기 위한 인터페이스이다.
*/ 
public interface MyFun {
	public void method();
	
}

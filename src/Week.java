/* 1.열거 타입도 래퍼런스 형 즉 참조 타입에 해당된다. 참조 타입 종류로는 클래스형, 배열형, 인터페이스형, 열거타입형이 있다.
 * 2.한정된 값만을 갖는 데이터 타입이 열거 타입이다. 예를 들면 일,월,화,수,목,금,토 또는 봄,여름,가을,겨울
 * 열거 타입은 몇 개의 열거 상수 중에서 하나의 상수를 저장하는 데이터 타입이다.
 * 3.열거 타입 이름은 첫글자를 영문대문자로 하고 , 두번째 단어 첫글자도 영문 대문자로 하는 것이 관례화 되어 있다.
 * 즉 클래스명을 정의하는 규칙과 같다.
 * 4. 열거 타입이름은 enum키워드로 정의한다. 
 * 
 */
public enum Week {
	Monday,// 7개의 열거 상수명을 영문 대문자로 정의. 상수명은 대문자로 하는 것이 관례화 되어 있음.
	Tuesday,
	WEDNESDAY,
	Thursday,
	Friday,
	Saturday,
	SUNDAY;
	
}

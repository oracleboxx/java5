import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

public class ConsumerExample {
	public static void main(String[] args) {
		Consumer<String>consumer = t -> System.out.println(t+"8");
		//매개 값은 있고, 리턴 값이 없는 함수형 인터페이스로 accept() 추상메서드 하나가 정의 되어있다
		consumer.accept("java ");
		BiConsumer<String,String> bigConsumer = (t,u) -> System.out.println(t+u);
		//BiConsumer 내장 함수형 인터페이스는 리턴 값은 없고, 매개인자 값이 2개인 추상메서드를 가진다.
		bigConsumer.accept("java", "8");
		DoubleConsumer doubleConsumer = d -> System.out.println("java"+d);
		//DoubleConsumer 내장 함수형 인터페이스는 실수 매개값 하나를 가지고, 리턴값이 없는 추상메서드를 가진다.
		doubleConsumer.accept(8.0);
	}
}

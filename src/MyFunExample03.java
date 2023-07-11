//매개변수와 리턴 값이 있는 함수형 인터페이스 MyFun03을 활용한 예제

public class MyFunExample03 {
	static int sum(int a, int b) {
		return a+b;
		
	}
	public static void main(String[] args) {
		MyFunExample03 s ;
		MyFun03 fi;
		
		
		
		fi =(a,b) -> {
			int result = a+b;
			return result;
		};
		System.out.println("5+ 10 = "+fi.method(5, 10));
		
		fi = (x,y) -> {
			return x+y;
			};
		System.out.println("10+10 ="+fi.method(10, 10));
		
		fi =(a,b) -> a*b;
		System.out.println("10*5="+fi.method(10, 5));
		
	}

	}

}


public class A3 {
 int field01; //인스턴스 변수
 void method01() { //인스턴스 메서드
	 
 }
 static int field02; //정적변수
 static void method02() {}
   class B{
	   void method01() {
		   /* 인스턴스 멤버 내부클래스 메서드 내에서 외부 클래스의 인스턴스 변수, 인스턴스 메서드 , 정적변수
		    *  정적메서드에 접근할 수 있다.
		    */
		   field01=10;
		   method01();
		   
		   field02= 20;
		   method02();
	   }
   }
   static class C{
	   void method02() {
		   field02 =20;
		   method02();
		    
	   }
	
   }
}

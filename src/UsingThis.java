
public class UsingThis {
	public int outterField =10;
	class Inner{
		int innerField =20;
		void m() {
			MyFun04 mf =()->{
				System.out.println("outterField = "+outterField);//외부클래스 변수 접근
				System.out.println("UsignThis.this.outterField = "+UsingThis.this.outterField);
				System.out.println("innrerField ="+innerField);
				System.out.println("this.innerField="+this.innerField);
			};
			mf.method();
		}
	}//인스턴스 멤버 내부클래스 -> UsingThis$Inner.class
}

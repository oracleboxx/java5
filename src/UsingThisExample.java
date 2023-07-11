
 class UsingThis{
		
			class Inner{
				void m() {
					
				}
			}
		}
public class UsingThisExample {
 public static void main(String[] args) {
	
	UsingThis ut = new UsingThis();// 왜ㅣ
	UsingThis.Inner ininner = ut.new Inner();
	ininner.m();
}
}


public class Anonymous2 {
	//필드 즉 멤벼변수 초기값으로 설장하는 익명문법
	RemoteControl field =new RemoteControl() {
		
		@Override
		public void turnOn() {
			
		}
		
		@Override
		public void turnOff() {
		}
	};
	RemoteControl localVar =new RemoteControl() {
		
		@Override
		public void turnOn() {
			System.out.println("유튜브를 켭니다");
		}
		
		@Override
		public void turnOff() {
			System.out.println("유튜브를 끕니다");
		}
	};
	localVar.turnOn();
	

	void method02(RemoteControl rc) {
		rc.turnOn();
	}
}

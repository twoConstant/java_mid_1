[정적 중첩 클래스]
	언제 사용 가능한가? 논리적으로 같이 묶을때 사용한다.
	내부 중첩 클래스는 외부 클래스의 스테틱 변수에 접근 할 수 있다. (private이어도 가능)
	딱 그냥 내부 클래스의 private 변수에 static nested Class 가 접근 가능하다는 장점 밖에 없다.
[내부 클래스]
	딱 한 줄 정의로 내부 클래스는 외부 클래스의 인스턴스 취급하면 된다.(메모리상 외부 클래스 인스턴스에 내부 인스턴스 클래스가 포함된다.)
		외부 인스턴스 멤버 접근 가능(자기도 인스턴스니까 당연히)
		외부 스테틱 멤버 접근 가능
	생성방법 : 외부 클래스의 인스턴스에서 .으로 접근해서 new 해야됨 애초에 InnerClass는 외부 클래스의 인스턴스에만 존재하는 클래스이기때문
		독특하게 outerClassInstance.new InnerClass(); 로 생성해야된다. 모든건 .다음에 이루어진다.
	사용 이유 : 그냥 private 변수에도 내부 클래스가 접근 할 수 있기 때문에 불필요햔 get메서드를 없애면서 캡슐화를 고도화 할 수 있다.
	캡슐화 : 그냥 멤버변수가 다 private이고 필요한 메서드만 public으로 열려있는 상태
		getXXX() 메서드 자체가 외부에서 해당 클래스의 멤버변수에 접근 할 수 있는것 자체가 캡슐화 정도를 떨어뜨린다.
	InnerCalss에서 this는 OuterClass를 가르킨다.
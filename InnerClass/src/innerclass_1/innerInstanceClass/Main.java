package innerclass_1.innerInstanceClass;

import innerclass_1.innerInstanceClass.OuterClass.InnerClass;

public class Main {

    public static void main(String[] args) {
        // 이렇게 바로 생성 못한다. 항상 외부 클래스의 인스턴스를 통해 생성된다.
//        new OuterClass.InnerClass();
        OuterClass outerClass = new OuterClass();
        InnerClass innerClass = outerClass.new InnerClass();
        innerClass.print();

//        staticOuterClassValue = staticOuterClassValue
//        instanceOuterClassValue = instanceOuterClassValue
//        instanceInnerClassValue = instanceInnerClassValue
    }

}

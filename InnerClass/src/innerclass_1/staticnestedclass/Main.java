package innerclass_1.staticnestedclass;

import innerclass_1.staticnestedclass.OuterClass.StaticNestedClass;

public class Main {

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        StaticNestedClass staticNestedClass1 = new OuterClass.StaticNestedClass();
        // 그냥 단독으로 바로 생성도 가능
        StaticNestedClass staticNestedClass = new StaticNestedClass();


    }

}

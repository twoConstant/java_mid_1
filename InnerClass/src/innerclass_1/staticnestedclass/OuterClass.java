package innerclass_1.staticnestedclass;

public class OuterClass {

    static String outerStaticValue = "staticOuterValue";
    String outerInstanceValue = "instanceOuterValue";

    void print(){
        // 외부 클래스는 내부 클래스의 스테틱 변수에도 접근 불가함
        System.out.println("staticNestedValue = " + StaticNestedClass.nestedStaticValue);

    }
    public static class StaticNestedClass{
        static String nestedStaticValue = "nestedStaticValue";
        String nestedInstanceValue = "nestedInstanceValue";

        void print() {
            System.out.println("staticOuterValue = " + outerStaticValue);
            // 인스턴스 변수에 접근 불가
//            System.out.println("instanceOuterValue = " + instanceOuberValue);

        }
    }



}

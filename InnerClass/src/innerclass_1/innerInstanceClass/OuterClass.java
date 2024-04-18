package innerclass_1.innerInstanceClass;

public class OuterClass {

    static String staticOuterClassValue = "staticOuterClassValue";
    String instanceOuterClassValue = "instanceOuterClassValue";

    class InnerClass {

        String instanceInnerClassValue = "instanceInnerClassValue";

        void print() {
            System.out.println("staticOuterClassValue = " + staticOuterClassValue);
            System.out.println("instanceOuterClassValue = " + instanceOuterClassValue);
            System.out.println("instanceInnerClassValue = " + instanceInnerClassValue);
        }
    }

}

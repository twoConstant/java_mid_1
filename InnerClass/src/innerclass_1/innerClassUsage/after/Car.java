package innerclass_1.innerClassUsage.after;

import innerclass_1.innerClassUsage.before.Engine;

public class Car {
    private String model;
    private int chargeLevel;
    private Engine engine;

    // 내부 클래스가 되면서 outer클래스인 Car의 인스턴스 변수에 자유롭게 접근 가능해졋다.
    private class Engine {
        public void start() {
            System.out.println("충전 레벨 확인: " + chargeLevel);
            System.out.println(model + "의 엔진을 구동합니다.");
        }
    }


    public Car(String model, int chargeLevel) {
        this.model = model;
        this.chargeLevel = chargeLevel;
        this.engine = new Engine();
    }

    public void start() {
        engine.start();
        System.out.println(model + " 시작 완료");
    }

    // 더이상 필요없어지면서 Car의 model 정보를 외부로 부터 감출수 있게 되었다.
//    public int getChargeLevel() {
//        return this.chargeLevel;
//    }

//    public String getModel() {
//        return this.model;
//    }

}

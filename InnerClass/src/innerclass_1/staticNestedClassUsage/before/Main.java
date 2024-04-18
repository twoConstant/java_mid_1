package innerclass_1.staticNestedClassUsage.before;

public class Main {

    public static void main(String[] args) {
        // 실제로는 그냥 network밖에 사용하지 않는다. NetworkMessage를 따로 땔 필요가 없다.
        Network network = new Network();
        network.sendMessage("안녕하세요");
    }

}

package innerclass_1.staticNestedClassUsage.after;

public class Main {
    // 직관적으로 사용자는 Network 클래스만 사용하면 되겠구나 라고 생각 할 수 있음
    public static void main(String[] args) {
        Network network = new Network();
        network.sendMessage("안녕하세요.");
    }

}

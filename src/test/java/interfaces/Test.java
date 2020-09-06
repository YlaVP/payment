package interfaces;

public class Test {

    private static Operation operation;

    public static void main(String[] args) {
        User user1 = new User(1);


        outputOperation(user1);

    }

    public static void outputOperation(Operation operation) {
              operation.payOperation();

    }
}

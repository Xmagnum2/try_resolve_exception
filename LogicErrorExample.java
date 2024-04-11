package try_resolve_exception;

public class LogicErrorExample {
    public static void main(String[] args) {
        // 1から10までの合計を計算したい
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum = i;
        }
        System.out.println("Sum: " + sum);
    }
}

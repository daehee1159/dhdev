public class Multiplication {
    public static void main(String[] args) {
        System.out.println("구구단을 시작합니다.");
        for(int i = 2; i < 10; i++) {
            for(int j = 1; j < 10; j++) {
                System.out.println(i + "X" + j + "=" + i*j);
            }
        }
    }
}
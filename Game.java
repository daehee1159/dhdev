public class Game {
    public static void main(String[] args) {
        // 1. 사다리의 갯수를 담을 배열 생성
        int[] ladder = new int[4];
        // 2. 1부터 4까지의 랜덤함수를 반환
        int random = (int)(Math.random()*ladder.length)+1;
        // 3. 반환된 결과 화면출력
        System.out.println(random);

        
    }
}
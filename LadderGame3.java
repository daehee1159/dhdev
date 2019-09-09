import java.util.Scanner;
import java.util.Random;

public class LadderGame3 {
    public static void main(String[] args) {

        System.out.println("사다리게임 Start");
        System.out.println("게임에 참여할 인원을 입력해주세요.(숫자)");
        
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        System.out.println("당첨될 인원을 입력해주세요.(숫자)");
        int j = sc.nextInt();
        int selectPlayer[] = new int[j];

        for (int select = 0; select < selectPlayer.length; select++) {
            selectPlayer[select] = (int)(Math.random()*i)+1;
            for (int search = 0; search < select; search++) {
                if (selectPlayer[select] == selectPlayer[search]) {
                    select--;
                    break;
                }
            }
        }
        System.out.println("===========================");
        System.out.println("당첨자 도출 중");
        System.out.println("===========================");

        System.out.println("당첨 결과입니다.");
        for (int result = 0; result < selectPlayer.length; result++) {
            if (result > 0) {
                System.out.print(", ");
            }
            System.out.print(selectPlayer[result] + "번 커피 쏘세요!");
        }
    }
}

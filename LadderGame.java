import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
import java.util.Random;

public class LadderGame {
    public static void main(String[] args) {

        System.out.println("사다리게임 Start");
        System.out.println("게임에 참여할 인원을 입력해주세요.(숫자)");
        
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        // int[] ladder = new int[i];

        // System.out.println("당첨될 인원을 입력해주세요.(숫자)");
        // int j = sc.nextInt();
        // int[] penalty = new int[j];

        int result = (int)(Math.random()*i)+1;
        
        
        System.out.println("====================");
        System.out.println("당첨자 도출 중(1명 고정)");
        System.out.println("====================");

        

        System.out.println("당첨자를 확인하시려면 1번, 게임을 종료하시려면 2번을 눌러주세요.");
        int select = sc.nextInt();

        if(select == 1) {
            System.out.println(result + "번 당첨되셨습니다.");
        }else {
            System.out.println("게임을 종료합니다.");
        }
    }
}




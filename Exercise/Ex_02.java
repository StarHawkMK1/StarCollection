package Star;

//        *
//        **
//        ***
//        ****
//        *****     (아래 #1-1 ~ 1-3코드)
// -----------------
//            *
//           **
//          ***
//         ****
//        *****     (아래 #2코드)

public class Ex_02 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {              // #1-1코드
            for (int j = 1; j <= i; j++) {          // i값과 연동해서 별 개수 증가
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("---------------");

        for (int i = 0; i < 5; i++) {               // #1-2코드
            for (int j = 0; j <= i; j++) {          // #1과 다른 점은 i와 j의 첫항이 0에서부터 시작한다는 것 뿐.
                System.out.print("*");                                   //(#1: 1 ~ 5   vs   #2: 0 ~ 4)
            }
            System.out.println();
        }

        System.out.println("---------------");

        for (int i = 0; i < 5; i++) {               // #1-3코드
            for (int j = 0; j < i + 1; j++) {       // #2과 근본적으로 같은 코드. 다만, 조건식이 다른 이유는
                System.out.print("*");              // #3은 조건식의 부등호 연산자가 '<'이기 때문에 i에 '+1'이 첨가된 것이고,
            }                                       // #2는 조건식의 부등호 연산자가 '<='이기 때문에 '+1' 없이 i만 있는 것.
            System.out.println();
        }

        System.out.println("---------------");

        for (int i = 1; i <= 5; i++) {              // #2코드
            for (int j = 5; j > i; j--) {           // 공백을 출력하는 j for문. i값과 연동하여 공백 우선출력(4~0개)
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {          // *을 출력하는 j for문. 공백 출력 후, i값과 연동하여 *출력
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

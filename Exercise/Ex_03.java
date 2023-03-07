package Star;

//        *****
//        ****
//        ***
//        **
//        *
// -----------------
//        *****
//         ****
//          ***
//           **
//            *

public class Ex_03 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {      // 출력하는 *의 개수를 5개에서 출발하여 1개씩 줄여나감.(i의 범위내)
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("-----------------");

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i-1; j++) {    // i값과 연동하여 공백 우선출력(0~4개)
                System.out.print(" ");
            }
            for (int j = 5; j >= i; j--) {
                System.out.print("*");          // 공백 출력 후, i값과 연동하여 *출력
            }
            System.out.println();
        }
    }
}

package Star;

//        *
//         *
//          *
//           *
//            *

public class Ex_04 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == j) {
                    System.out.print("*");      // i값(행)과 j값(열)이 일치하는 경우에만 * 출력.
                } else {
                    System.out.print(" ");      // 그 외의 경우에는 공백 출력.
                }
            }
            System.out.println();
        }
    }
}

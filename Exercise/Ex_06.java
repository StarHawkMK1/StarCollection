package Star;

//        *   *
//         * *
//          *
//         * *
//        *   *

public class Ex_06 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if ((i == j) || (i + j == 6)) {
                    System.out.print("*");          // i값(행)과 j값(열)이 일치하거나 합이 6인 경우에만 * 출력.
                } else {
                    System.out.print(" ");          // 그 외의 경우에는 공백 출력.
                }
            }
            System.out.println();
        }
    }
}

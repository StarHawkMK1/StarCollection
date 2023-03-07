package Star;

//        *****
//        ******
//        *******
//        ********
//        *********

public class Ex_07 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j <= i+8; j++) {        // 근본적으로 예제1과 같은 문제. 단지 별의 개수가 5개에서 출발.
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

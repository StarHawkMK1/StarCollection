package Star;

public class _Ex_01 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {           // <몇 줄 찍을까?> i=1,2,3,4,5 -> {}안의 내용(내부for문)을 5번 반복
            for (int j = 1; j <= 5; j++) {       // <별 몇 개 찍을까?> == .print("*****")
                System.out.print("*");           // 별을 옆으로 이어서 5개 찍기 위해 print'ln' 으로 하지 않도록 주의
            }
            System.out.println();                // 별 5개 찍고 줄 바꿈. (내부 for문 1회 실행 완료 후 줄 바꿈)
        }
    }
}

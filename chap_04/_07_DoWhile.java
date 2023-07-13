package chap_04_youtube;

public class _07_DoWhile {
    public static void main(String[] args) {
        // 반복문 Do While
        int distance = 25;
        int move = 0;
        int height = 2; // 키
        while (move + height < distance){
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리 : " + move);
            move += 3;
        }
        System.out.println("도착했습니다.");
        System.out.println(" --- 반복문 #1 ---");

        //키가 엄청나게 큰 사람?
        move = 0;
        height = 25;
        while(move + height < distance){
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리 : " + move);
        }
        System.out.println("도착했습니다.");
        System.out.println(" --- 반복문 #2 ---" ); // while 조건이 거짓이므로 바로 도착했습니다로 뜸

        // Do While 반복문 --> 그냥 while문은 조건확인 후 실행, do while문은 한번 실행 후 조건확인
        do {
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리 : " + move);
            move += 3;
        } while (move + height < distance);
        System.out.println("도착했습니다."); // 조건은 거짓이지만 한번은 실행
    }
}

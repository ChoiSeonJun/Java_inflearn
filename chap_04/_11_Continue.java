package chap_04_youtube;

public class _11_Continue {
    public static void main(String[] args) {
        // Continue

        // 치킨 주문 손님중에 노쇼 손님이 있다고 가정
        // For
        int max = 20; // 최대 치킨 판매 수량
        int sold = 0; // 현재 치킨 판매 수량
        int noShow = 17; // 대기번호 17번 손님이 노쇼
        for (int i = 1; i <= 50; i++){
            System.out.println(i + "번 손님, 주문하신 치킨 나왔습니다.");
            sold++;// 판매처리

            // 손님이 없다면?
            if (i == noShow){
                System.out.println(i + "번 손님, 노쇼로 인해 다음 손님에게 기회가 넘어갑니다.");
                continue; // continue 즉시 실행을 멈추고 다음 회차의 for문을 실행한다.
            }

            if (sold == max){
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break;
            }
        }
        System.out.println("영업을 종료합니다.");
        System.out.println("------------------");
        // While 문
        sold = 0;
        int index = 1; // 손님 번호
        while (index <= 50){
            System.out.println(index + "번 손님, 주문하신 치킨 나왔습니다.");

            // 손님이 없다면 continue
            if(index == noShow){
                System.out.println(index + "번 손님, 노쇼로 인해 다음 손님에게 기회가 넘어갑니다.");
                index++; // continue를 만나게되면 맨 밑의 index++가 실행하지 않으므로 여기에도 추가해준다.
                continue;
            }

            sold++; // 판매처리
            if(sold == max){
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break;
            }
            index++;
        }
        System.out.println("영업을 종료합니다.");
    }
}

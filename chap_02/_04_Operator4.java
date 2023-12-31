package chap_02_youtube;

public class _04_Operator4 {
    public static void main(String[] args) {
        // 논리 연산자
        boolean 김치찌개 = false;
        boolean 계란말이 = false;
        boolean 제육볶음 = true;

        System.out.println(김치찌개 || 계란말이 || 제육볶음 ); // 하나라도 true(1) 이면 true(1) (괜찮은 식당)
        System.out.println(김치찌개 && 계란말이 && 제육볶음 ); // 전부 true(1)면 true, 하나라도 false(0)이면 false

        // And 연산
        System.out.println((5 > 3) && (3 > 1)); // 5 는 3보다 크고, 3 은 1 보다 크다(true)
        System.out.println((5 > 3) && (3 < 1)); // 5 는 3보다 크고, 3 은 1 보다 크다(true)

        // OR 연산
        System.out.println((5 > 3) || (3 > 1 ));
        System.out.println((5 > 3) || (3 < 1 ));
        System.out.println((5 < 3) || (3 < 1 ));

        System.out.println( 1 & 0); // 답: 0 // [&&, ||] 는 논리연산자 // [&, |] 는 [0 또는 1]로 답이 나옴
        // System.out.println(1 < 3 < 5); // 불가능한 코드

        // 논리 부정 연산자
        System.out.println(!true); // false
        System.out.println(!false); // true
        System.out.println(!(5 == 5)); // false
        System.out.println(!(5 == 3)); // true

    }
}

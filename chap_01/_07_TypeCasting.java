package chap_01_youtube;

public class _07_TypeCasting {
    public static void main(String[] args) {
        // 형변환 TypeCasting
        // 정수형에서 실수형으로
        // 실수형에서 정수형으로 변환하는것을 의미함

        int score = 93;
        System.out.println(score); // 93
        System.out.println((float)score); // (float)을 변수 앞에 적음으로서 실수형으로 형변환
        System.out.println((double)score); // (double)을 변수 앞에 적음으로서 실수형으로 형변환

        // float, double to int
        float score_f = 93.3F;
        double score_d = 98.8;
        System.out.println((int)score_f);
        System.out.println((int)score_d);

        // 정수 + 실수 연산
        score = 93 + (int)98.8; // 93 + 98
        System.out.println(score);

        score_d = 93 + 98.8;
        System.out.println(score_d);

        // 변수에 형변환된 데이터 집어넣기
        double convertedScoreDouble = score; // 191 -> 191.0
        // int -> long -> float -> double (자동 형변환)

        int convertedScoreInt = (int)score_d; // 191.8 -> 191 빨간줄 표시는 데이터 일부가 잘린다(소수점)는 의미
        // double -> float -> long -> int (수동 형변환)

        // 숫자를 문자열로
        String s1 = String.valueOf(93); // 숫자를 문자열로 변환
        s1 = Integer.toString(92); // 문자를 숫자열로 변환
        System.out.println(s1);

        String s2 = String.valueOf(98.8);
        s2 = Double.toString(98.8);
        System.out.println(s2);

        //문자열을 숫자로
        int i = Integer.parseInt("93");
        System.out.println(i); // 93
        double d = Double.parseDouble("98.8");
        System.out.println(d); // 98.8

        int error = Integer.parseInt("자바");


    }
}

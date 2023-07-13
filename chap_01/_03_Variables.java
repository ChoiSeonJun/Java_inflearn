package chap_01_youtube;

public class _03_Variables {
    public static void main(String[] args) {
        String name = "나도코딩";  // 문자열 선언
        int hour = 15;

        System.out.println(name + "님, 배송이 시작됩니다." + hour + "시에 방문 예정입니다.");
        System.out.println(name + "님, 배송이 완료되었습니다.");

        double score = 90.5;
        char grade = 'A'; // 한 글자 출력할때는 char 사용. 작은 따옴표('')로 표시
        name = "강백호";   // name 변수 재선언
        System.out.println(name + "님의 평균 점수는" + score + "점입니다.");
        System.out.println("학점은" + grade + "입니다.");


        boolean pass = true; // or false
        System.out.println("이번 시험에 합격했을까요?" + pass);


        double d = 3.14;
        float f = 3.14f; // double 변수에 넣을때는 실수 값 뒤에 "F" 나 "f"를 넣어야한다
        System.out.println(d);
        System.out.println(f);

        double e = 3.14123456789;
        float g = 3.14123456789f;
        System.out.println(e);
        System.out.println(g);  //float는 소수점 6번째 자리 너머로는 출력 못한다.

        long l = 1000000000000L; // long 자료형 변수 뒤에는 'l' 또는 'L'를 입력해야한다.
        l = 1_000_000_000_000L; // 언더바'_'는 정수형에 넣어도 상관없다. 보기 편하다는 장점이 생길 수 있다.
        System.out.println(l);

    }
}

package chap_02_youtube;

public class _05_Operator5 {
    public static void main(String[] args) {
        // 삼항 연산자
        // 결과 = (조건) ? (참 결과감 : 거짓 결과값)
        int x  = 3;
        int y = 5;
        int max = (x > y) ? x : y;
        System.out.println(max);

        int min = (x < y) ? x : y;
        System.out.println(min);

        boolean b = (x == y) ? true : false;
        System.out.println(b);

        String s = (x!=y) ? "달라요" : "같아요"; // boolean 못씀. 참 거짓만 가능하기 때문 --> "달라요"는 String 문자열
        System.out.println(s);
    }
}

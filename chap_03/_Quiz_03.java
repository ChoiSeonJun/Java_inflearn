package chap_03_youtube;
// 주민등록번호 앞번호 7자리만 표표시
public class _Quiz_03 {
    public static void main(String[] args) {
        String id = "901231-1234567"; // 주민등록번호 13자리
        System.out.println(id.substring(0, 8)); // 0~7 위치까지의 문자열 출력
        System.out.println(id.substring(0, id.indexOf("-") + 2)); // 0위치부터 하이픈 위치 + 2 직전까지
    }
}

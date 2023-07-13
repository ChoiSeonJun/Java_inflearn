package chap_03_youtube;

public class _03_StringCompare {
    public static void main(String[] args) {
        // 문자열 비교
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals(s2)); // 문자열 내용이 같으면 true, 다르면 false
        System.out.println(s1.equals("Java")); // true
        System.out.println(s2.equals("python")); // 대소문자 구분하므로 false
        System.out.println(s2.equalsIgnoreCase("python")); // 대소문자 구분없이 문자열내용 같은지 구분

        // 문자열 비교 심화
        s1 = "1234"; // 벽에 붙은 메모지의 비밀번호 정보(공개) // s2와  같은곳을 참조
        s2 = "1234"; // s1과 같은곳을 참조
        System.out.println(s1.equals(s2)); // true(내용비교)
        System.out.println(s1 == s2); // true(참조비교)

        s1 = new String("1234"); // s2과 서로 다른곳을 참조
        s2 = new String("1234"); // s1과 서로 다른곳을 참조
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1 == s2); // false
    }

}

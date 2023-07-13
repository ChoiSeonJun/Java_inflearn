package chap_06_youtube;

// 실행결과
// 이름 : 나**
// 주민등록번호 : 990130-1******
// 전화번호 : 010-1234-****

// substring() 을 이용하면 문자열의 일부를 자를 수 있음
public class _Quiz_06 {
    public static String getHiddenData(String data, int index){
        String hiddenData = data.substring(0,index); // 나코딩 -> 나
        for (int i = index; i < data.length(); i++){
        //for (int i = 0; i <data.length() - index; i++){
            hiddenData += "*";
        }

        return hiddenData;
    }

    public static void main(String[] args) {
        String name = "나코딩"; // 이름
        String id = "990130-1234567"; // 주민등록번소
        String phone = "010-1234-5678"; // 전화번호

        System.out.println("이름 : " + getHiddenData(name,1));
        System.out.println("주민등록번호 : " + getHiddenData(id,8));
        System.out.println("전화번호 : " + getHiddenData(phone,8));


    }
}

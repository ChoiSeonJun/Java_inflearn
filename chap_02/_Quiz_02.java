package chap_02_youtube;

public class _Quiz_02 {
    public static void main(String[] args) {
        // 어린이 키에 따른 놀이 기구 탑승 가능 여부를 확인하는 프로그램
        int height = 115;
        int b = 121;
        int rimit = 120;

        String result = (height >= rimit) ? "탑승 가능" : " 탑승 불가능";
        System.out.println("키가 "+ height +"cm 이므로" + result);
        String s = (b >= rimit) ? "키가 "+b+"cm 이므로 탑승 가능" : "키가 "+b+"cm 이므로 탑승 불가능";
        System.out.println(s);
    }
}

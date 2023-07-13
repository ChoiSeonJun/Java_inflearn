package chap_05_youtube;

public class _02_ArrayLoop {
    public static void main(String[] args) {
        // 배열의 순회
        String coffees[] = {"아메리카노", "카페모카", "라떼", "카푸치노"};

        // for 반복문 순회

        // 배열의 길이를 이용한 순회
        for(int i = 0; i <coffees.length; i++){
            System.out.println(coffees[i] + "하나");
        }
        System.out.println("주세요");

        // enhanced for (for-each) 반복문
        for(String coffee : coffees){  // coffees의 배열을 coffee라는 메소드로 받아서 전부 순회하겠다.
            System.out.println(coffee);
        }
        System.out.println("주세요");
    }
}

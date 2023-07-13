package chap_06_youtube;

public class _07_VariableScope {
    public static void methodA(){
       // System.out.println(number);
    }

    public static void methodB(){
        int result = 1; // 지역변수 (선언된 영역에서만 사용 가능)
    }

    public static void main(String[] args) {
        int number = 3; // 지역변수 (선언된 영역에서만 사용 가능)

        // System.out.println(result);
        for (int i = 0; i < 5; i++){    // for문의 i선언도 for문 밖에서는 사용 불가능
            System.out.println(i);
        }
        //System.out.println(i);
        {
            int j = 0;
            System.out.println(j);
            System.out.println(number);
        }
        // System.out.println(j);
    }
}

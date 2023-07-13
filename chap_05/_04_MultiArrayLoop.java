package chap_05_youtube;

public class _04_MultiArrayLoop {
    public static void main(String[] args) {
        // 다차원 배열 순회
        String[][] seats = new String[][] {
                {"A1", "A2", "A3", "A4", "A5"},
                {"B1", "B2", "B3", "B4", "B5"},
                {"C1", "C2", "C3", "C4", "C5"}
        };

        for (int i = 0; i < 3; i++){
           for (int j = 0; j < 5; j++){
               System.out.print(seats[i][j] + " ");
           }
            System.out.println( ); // 줄바꿈
        }
        System.out.println("------------------------");


        // 배열의 층마다 크기가 다르다면?
        String[][]  seats2 = {
                {"A1", "A2", "A3"},
                {"B1", "B2", "B3", "B4"},
                {"C1", "C2", "C3", "C4", "C5"}
        };

        for (int i = 0; i < seats2.length; i++){            // seats2.length = seats 의 길이이기 때문에 길이 = 3
            for (int j = 0; j < seats2[i].length; j++){     // seats2[i].length = seats[]의 길이이기 때문에 길이 = 3,4,5
                System.out.print(seats2[i][j] + " ");
            }
            System.out.println( ); // 줄바꿈
        }
        System.out.println("------------------------");

        // 세로 크기 10 x 가로 크기 15에 해당하는 영화관 좌석
        String[][] seats3 = new String[10][15];
        String[] eng = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
        for (int i = 0; i < seats3.length; i++){ // 세로
            for (int j = 0; j < seats3[i].length; j++) {
                seats3[i][j] = eng[i] + (j + 1); // 좌석당 영어와 // (j+1)을 이용해 번호를 적어줌 ex) A1,A2..
            };
            }

        // 표 구매
        seats3[7][8] = "__"; // H9
        seats3[7][9] = "__ "; // H10



        // 영화관 좌석 번호 확인
        for (int i = 0; i < seats3.length; i++){ // 세로
            for (int j = 0; j < seats3[i].length; j++) {
                System.out.print(seats3[i][j] + " ");
            };
            System.out.println();

        }
    }
}

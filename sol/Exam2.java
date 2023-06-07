import java.util.Scanner;

public class Exam2 {
    public static void drawTri(int height) {

        for(int lineNum = 1; lineNum <= height; lineNum++) {
            for(int space = 0; space < (height - lineNum); space++) {
                System.out.print(" ");
            }

            for(int star = 0; star < (2 * lineNum - 1); star++) {
                System.out.printf("*");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int height = scan.nextInt();
        drawTri(height);
        // 높이를 입력해주세요 : 3

        // 출력
        /*

                 *
                ***
               *****

        */

        // 높이를 입력해주세요 : 5

        // 출력
        /*

                *
               ***
              *****
             *******
            *********

         */


        // 높이를 입력해주세요 : 7

        // 출력
        /*

                  *
                 ***
                *****
               *******
              *********
             ***********
            *************

         */
    }
}

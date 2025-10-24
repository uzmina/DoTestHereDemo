package NumberPatterns;

public class StarPatterns {
    public static void increasingStar(int rows){
        for(int i = 1; i <= rows; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void decreasingStar(int rows){
        for(int i = rows; i >= 1; i--){
            for (int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printSquare(int rows){
        for (int i = 1; i <= rows; i++){
            for (int j = 1; j <= rows; j++){
                System.out.print("*  ");
            }
            System.out.println();
        }
    }

    public static void hillPattern(int rows){
        for(int i = 1; i <= rows; i++){
            for (int j = 5; j >= i; j--){
                System.out.print("t ");
            }
            for (int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        //increasingStar(5);
        //decreasingStar(5);
        hillPattern(5);
        //printSquare(5);
    }
}

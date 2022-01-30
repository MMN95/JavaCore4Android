import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework4 {

    public static char[][] map;
    public static final int SIZE = 5;
    public static final int DOTS_TO_WIN = 4;

    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        initMap();
        printMap();
        boolean humanWin;
        boolean aiWin = false;
        do {
            humanTurn();
            printMap();
            humanWin = checkWin(DOT_X);
            if (humanWin){
                break;
            }
            aiTurn();
            printMap();
            aiWin = checkWin(DOT_O);
            if (aiWin){
                break;
            }

        } while (!mapIsFull());
        if (humanWin) {
            System.out.println("Победил человек");
        }
        if (aiWin){
            System.out.println("Победил компьютер");
        }
        if (!(humanWin && !aiWin)){
            System.out.println("Ничья");
        }

    }

    private static boolean checkWin(char symbol) {
       //нужное кол-во символов подряд в строке
        for (char[] row : map) {
            int quantitySymbolInRow = 0;
            for (int i = 0; i < SIZE; i++) {
                if (row[i] == symbol){
                    quantitySymbolInRow++;
                } else if (quantitySymbolInRow > 0) {
                    quantitySymbolInRow = 0;
                }
                if (quantitySymbolInRow == DOTS_TO_WIN) {
                    return true;
                }
            }
        }
        //нужное кол-во символов подряд в столбце
        for (int i = 0; i < SIZE; i++) {
            int quantitySymbolInRow = 0;
            for (int j = 0; j < SIZE; j++) {
                if (map[j][i] == symbol){
                    quantitySymbolInRow++;
                } else if (quantitySymbolInRow > 0) {
                    quantitySymbolInRow = 0;
                }
                if (quantitySymbolInRow == DOTS_TO_WIN) {
                    return true;
                }
           }
        }

        //нужное кол-во символов в диагоналях
        //главная посередине
        int quantitySymbolInRow = 0;
        for (int i = 0; i < SIZE; i++) {
            if (map[i][i] == symbol) {
                quantitySymbolInRow++;
            } else if (quantitySymbolInRow > 0) {
                quantitySymbolInRow = 0;
            }
            if (quantitySymbolInRow == DOTS_TO_WIN) {
                return true;
            }
        }

       //главная верхняя
        for (int i = 0, j = 1; i < SIZE && j < SIZE; i++,j++) {
            if (map[i][j] == symbol) {
                quantitySymbolInRow++;
            } else if (quantitySymbolInRow > 0) {
                quantitySymbolInRow = 0;
            }
            if (quantitySymbolInRow == DOTS_TO_WIN) {
                return true;
            }
        }

        //главная нижняя
        for (int i = 1, j = 0; i < SIZE && j < SIZE; i++,j++) {
            if (map[i][j] == symbol) {
                quantitySymbolInRow++;
            } else if (quantitySymbolInRow > 0) {
                quantitySymbolInRow = 0;
            }
            if (quantitySymbolInRow == DOTS_TO_WIN) {
                return true;
            }
        }

       //побочная посередине
        quantitySymbolInRow = 0;
        for (int i = 0; i < SIZE; i++) {
            if (map[i][SIZE-i-1] == symbol) {
                quantitySymbolInRow++;
            } else if (quantitySymbolInRow > 0) {
                quantitySymbolInRow = 0;
            }
            if (quantitySymbolInRow == DOTS_TO_WIN) {
                return true;
            }
        }

        //побочная верхняя
        quantitySymbolInRow = 0;
        for (int i = 3, j = 0; i < SIZE && i >= 0; i--, j++) {
            if (map[i][j] == symbol) {
                quantitySymbolInRow++;
            } else if (quantitySymbolInRow > 0) {
                quantitySymbolInRow = 0;
            }
            if (quantitySymbolInRow == DOTS_TO_WIN) {
                return true;
            }
        }

        //побочная нижняя
        quantitySymbolInRow = 0;
        for (int i = 4, j = 1; i < SIZE && i >= 1; i--, j++) {
            if (map[i][j] == symbol) {
                quantitySymbolInRow++;
            } else if (quantitySymbolInRow > 0) {
                quantitySymbolInRow = 0;
            }
            if (quantitySymbolInRow == DOTS_TO_WIN) {
                return true;
            }
        }
        return false;
    }

    private static boolean mapIsFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY){
                    return false;
                }
            }
        }
        return true;
    }

    private static void aiTurn() {
       //*** Доработать искусственный интеллект, чтобы он мог блокировать ходы игрока.
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if(isCellValid(i, j)){
                    map[i][j] = DOT_X;
                    if (checkWin(DOT_X)){
                        map[i][j] = DOT_O;
                        return;
                    }
                    map[i][j] = DOT_EMPTY;
                }
            }
        }
        int x, y;
        do {
            x = new Random().nextInt(SIZE);
            y = new Random().nextInt(SIZE);
        } while (!isCellValid(x, y));
        map[x][y] = DOT_O;
    }


    private static void humanTurn() {
        int x,y;
        do {
            System.out.println("Введите координаты");
            System.out.println("Введите X");
            x = scanner.nextInt() - 1;
            System.out.println("Введите Y");
            y = scanner.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[x][y] = DOT_X;
    }

    private static boolean isCellValid(int x, int y) {
        return (x >= 0 && x < SIZE && y >= 0 && y < SIZE && map[x][y] == DOT_EMPTY);
    }

    private static void printMap() {
        for (int i = 0; i < SIZE; i++) {
            System.out.println();
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
        }
        System.out.println();
    }

    private static void initMap() {
        map = new char[SIZE][SIZE];
        for (char[] row: map) {
            Arrays.fill(row, DOT_EMPTY);
        }
    }
}

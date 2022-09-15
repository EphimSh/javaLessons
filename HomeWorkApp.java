package TikTakToe;

import java.util.Random;
import java.util.Scanner;

public class TikTakToe {

    private static int fieldSize;
    private static int SIZE = fieldSize;

    private static final char DOT_EMPTY = '•';
    private static final char DOT_HUMAN = 'X';
    private static final char DOT_AI = 'O';

    public static final String HEADER_FIRST_SYMBOL = "❤";
    public static final String SPACE_MAP_SYMBOL = " ";

    private static char[][] MAP;

    private static final Scanner in = new Scanner(System.in);
    private static final Random random = new Random();

    private static int turnsCount = 0;

    public static void main(String[] args) {
        playGroundCreate();
        mapInit(fieldSize);
        printMap();
        playGame();
    }

    private static void playGame() {
        while (true) {

            humanTurn();
            printMap();
//            check endGame
            if (checkEnd(DOT_HUMAN)) {
                break;
            }


            aiTurn();
            printMap();
//            check endGame
            if (checkEnd(DOT_AI)) {
                break;
            }
        }
    }

    private static void playGroundCreate() {

        System.out.println("Please set the field size: ");
        fieldSize = in.nextInt();

    }

    private static boolean checkEnd(char symbol) {
        if (checkWin(symbol)) {
            if (symbol == DOT_HUMAN) {
                System.out.println("HUMAN WIN");
            } else {
                System.out.println("SKYNET WIN");
            }
            return true;
        }

        // DRAW
        if (checkDraw()) {
            System.out.println("DRAW");
            return true;
        }


        return false;
    }

    private static boolean checkDraw() {
        /*for (char[] chars : MAP) {
            for (char symbol : chars) {
                if (symbol == DOT_EMPTY){
                    return false;
                }
            }
        }
        return true;*/

        return turnsCount >= SIZE * SIZE;

    }

    private static boolean checkWin(char symbol) {
        /*if (MAP[0][0] == symbol && MAP[0][1] == symbol && MAP[0][2] == symbol) {
            return true;
        }
        if (MAP[1][0] == symbol && MAP[1][1] == symbol && MAP[1][2] == symbol) {
            return true;
        }
        if (MAP[2][0] == symbol && MAP[2][1] == symbol && MAP[2][2] == symbol) {
            return true;
        }

        if (MAP[0][0] == symbol && MAP[1][0] == symbol && MAP[2][0] == symbol) {
            return true;
        }
        if (MAP[0][1] == symbol && MAP[1][1] == symbol && MAP[2][1] == symbol) {
            return true;
        }
        if (MAP[0][2] == symbol && MAP[1][2] == symbol && MAP[2][2] == symbol) {
            return true;
        }

        if (MAP[0][0] == symbol && MAP[1][1] == symbol && MAP[2][2] == symbol) {
            return true;
        }
        if (MAP[0][2] == symbol && MAP[1][1] == symbol && MAP[2][0] == symbol) {
            return true;
        }*/
        for (int i = 0; i < SIZE; i++) {
            boolean horizontalVertical = true;
            boolean diagonalLeft = true;
            boolean diagonalRight = true;
            for (int j = 0; j < SIZE; j++) {
                horizontalVertical = horizontalVertical && (MAP[i][j] == symbol) || horizontalVertical && (MAP[j][i] == symbol);
                diagonalLeft = diagonalLeft && (MAP[SIZE - j - 1][j] == symbol);
                diagonalRight = diagonalRight && (MAP[j][j] == symbol);
            }
            if (horizontalVertical) {
                return true;
            } else if (diagonalLeft || diagonalRight) {
                return true;
            }
        }
        return false;
    }


    private static void aiTurn() {
        System.out.println("\n COMPUTER TURN!");
        int rowNumber;
        int columnNumber;
        do {

            rowNumber = random.nextInt(SIZE);

            columnNumber = random.nextInt(SIZE);

            if (isCellFree(rowNumber, columnNumber)) {
                break;
            }
        } while (!isCellFree(rowNumber, columnNumber));

        MAP[rowNumber][columnNumber] = DOT_AI;
        turnsCount++;
    }

    private static void humanTurn() {
        System.out.println("\n HUMAN TURN!");
        int rowNumber;
        int columnNumber;
        while (true) {
            System.out.println("PLEASE ENTER ROW COORDINATE");
            rowNumber = in.nextInt() - 1;
            System.out.println("PLEASE ENTER COLUMN COORDINATE");
            columnNumber = in.nextInt() - 1;

            if (isCellFree(rowNumber, columnNumber)) {
                break;
            }
            System.out.printf("ERROR! CELL %s:%s IS ALREADY TAKEN ", rowNumber + 1, columnNumber + 1);
        }

        MAP[rowNumber][columnNumber] = DOT_HUMAN;
        turnsCount++;
    }

    private static boolean isCellFree(int rowNumber, int columnNumber) {
        return MAP[rowNumber][columnNumber] == DOT_EMPTY;
    }

    private static void mapInit(int fieldSize) {
        SIZE = fieldSize;
        MAP = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                MAP[i][j] = DOT_EMPTY;
            }
        }
    }

    private static void printMap() {
        printHeaderMap();
        printBodyMap();
    }

    private static void printBodyMap() {
        for (int i = 0; i < SIZE; i++) {
            printMapNumber(i);
            for (int j = 0; j < SIZE; j++) {
                System.out.print(MAP[i][j] + SPACE_MAP_SYMBOL);
            }
            System.out.println();
        }
    }

    private static void printHeaderMap() {
        System.out.print(HEADER_FIRST_SYMBOL + SPACE_MAP_SYMBOL);
        for (int i = 0; i < SIZE; i++) {
            printMapNumber(i);
        }
        System.out.println();
    }

    private static void printMapNumber(int i) {
        System.out.print(i + 1 + SPACE_MAP_SYMBOL);
    }
}

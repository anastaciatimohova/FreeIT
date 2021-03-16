import java.util.Random;
import java.util.Scanner;

public class XandO {
    public static void main(String[] args) {
        String[][] gamepad = new String[3][3];
        Scanner scan = new Scanner(System.in);
        int number = 1;
        int i;
        int j;
        for (i = 2; i >= 0; i--) {
            for (j = 0; j < gamepad[i].length; j++) {
                gamepad[i][j] = "" + number;
                number++;
            }
        }
        String players = "XO";
        Random rnd = new Random();
        String choice = "" + players.charAt(rnd.nextInt(players.length()));
        String choiceComputer;
        if (choice.equals("O")) {
            choiceComputer = "X";
        } else {
            choiceComputer = "O";
        }
        System.out.println("Вы являетесь игроком " + choice + " (выбор сделан рандомно).");
        int position;
        int changeStep = 0;
        if (choice.equals("X")) {
            while (true) {
                try {
                    System.out.println("__" + gamepad[0][0] + "__|__" + gamepad[0][1] + "__|__" + gamepad[0][2] + "__");
                    System.out.println("__" + gamepad[1][0] + "__|__" + gamepad[1][1] + "__|__" + gamepad[1][2] + "__");
                    System.out.println("  " + gamepad[2][0] + "  |  " + gamepad[2][1] + "  |  " + gamepad[2][2] + "  ");
                    System.out.println("Выберите позицию:");
                    String positionStr = scan.nextLine();
                    position = Integer.parseInt(positionStr);
                    switch (position) {
                        case 1:
                            gamepad[2][0] = choice;
                            break;
                        case 2:
                            gamepad[2][1] = choice;
                            break;
                        case 3:
                            gamepad[2][2] = choice;
                            break;
                        case 4:
                            gamepad[1][0] = choice;
                            break;
                        case 5:
                            gamepad[1][1] = choice;
                            break;
                        case 6:
                            gamepad[1][2] = choice;
                            break;
                        case 7:
                            gamepad[0][0] = choice;
                            break;
                        case 8:
                            gamepad[0][1] = choice;
                            break;
                        case 9:
                            gamepad[0][2] = choice;
                            break;
                    }
                    break;
                } catch (Exception e) {
                    System.out.println("Нет такой позиции.");
                }
            }
        } else {
            i = rnd.nextInt(3);
            j = rnd.nextInt(3);
            gamepad[i][j] = "" + choiceComputer;
            System.out.println("Компьютер ходит первым.");
            System.out.println("Компьютер выбрал позицию - " + "[" + i + "]" + "[" + j + "]");
            changeStep = 1;
        }
        int stepGame = 1;
        while (true) {
            try {
                System.out.println("__" + gamepad[0][0] + "__|__" + gamepad[0][1] + "__|__" + gamepad[0][2] + "__");
                System.out.println("__" + gamepad[1][0] + "__|__" + gamepad[1][1] + "__|__" + gamepad[1][2] + "__");
                System.out.println("  " + gamepad[2][0] + "  |  " + gamepad[2][1] + "  |  " + gamepad[2][2] + "  ");
                if ((gamepad[0][0].equals("X") && gamepad[0][1].equals("X") && gamepad[0][2].equals("X")) ||
                        (gamepad[1][0].equals("X") && gamepad[1][1].equals("X") && gamepad[1][2].equals("X")) ||
                        (gamepad[2][0].equals("X") && gamepad[2][1].equals("X")) && (gamepad[2][2].equals("X")) ||
                        (gamepad[0][0].equals("X") && gamepad[1][0].equals("X") && gamepad[2][0].equals("X")) ||
                        (gamepad[0][1].equals("X") && gamepad[1][1].equals("X") && gamepad[2][1].equals("X")) ||
                        (gamepad[0][2].equals("X") && gamepad[1][2].equals("X") && gamepad[2][2].equals("X")) ||
                        (gamepad[0][0].equals("X") && gamepad[1][1].equals("X") && gamepad[2][2].equals("X")) ||
                        (gamepad[0][2].equals("X") && gamepad[1][1].equals("X") && gamepad[2][0].equals("X"))) {
                    System.out.println("Игрок 'Х' выиграл!");
                    break;
                } else if ((gamepad[0][0].equals("O") && gamepad[0][1].equals("O") && gamepad[0][2].equals("O")) ||
                        (gamepad[1][0].equals("O") && gamepad[1][1].equals("O") && gamepad[1][2].equals("O")) ||
                        (gamepad[2][0].equals("O") && gamepad[2][1].equals("O") && gamepad[2][2].equals("O")) ||
                        (gamepad[0][0].equals("O") && gamepad[1][0].equals("O") && gamepad[2][0].equals("O")) ||
                        (gamepad[0][1].equals("O") && gamepad[1][1].equals("O") && gamepad[2][1].equals("O")) ||
                        (gamepad[0][2].equals("O") && gamepad[1][2].equals("O") && gamepad[2][2].equals("O")) ||
                        (gamepad[0][0].equals("O") && gamepad[1][1].equals("O") && gamepad[2][2].equals("O")) ||
                        (gamepad[0][2].equals("O") && gamepad[1][1].equals("O") && gamepad[2][0].equals("O"))) {
                    System.out.println("Игрок 'O' выиграл!");
                    break;
                }else if(stepGame == 9){
                    System.out.println("Вы сыграли в ничью!");
                    break;
                }
                if (changeStep == 1) {
                    stepGame++;
                    changeStep = 0;
                    System.out.println("Выберите позицию:");
                    String positionStr = scan.nextLine();
                    position = Integer.parseInt(positionStr);
                    switch (position) {
                        case 1:
                            if (gamepad[2][0].equals("X") || gamepad[2][0].equals("O")) {
                                stepGame--;
                                changeStep = 1;
                                System.out.println("Эта позиция занята.");
                            } else {
                                gamepad[2][0] = choice;
                            }
                            break;
                        case 2:
                            if (gamepad[2][1].equals("X") || gamepad[2][1].equals("O")) {
                                stepGame--;
                                changeStep = 1;
                                System.out.println("Эта позиция занята.");
                            } else {
                                gamepad[2][1] = choice;
                            }
                            break;
                        case 3:
                            if (gamepad[2][2].equals("X") || gamepad[2][2].equals("O")) {
                                stepGame--;
                                changeStep = 1;
                                System.out.println("Эта позиция занята.");
                            } else {
                                gamepad[2][2] = choice;
                            }
                            break;
                        case 4:
                            if (gamepad[1][0].equals("X") || gamepad[1][0].equals("O")) {
                                stepGame--;
                                changeStep = 1;
                                System.out.println("Эта позиция занята.");
                            } else {
                                gamepad[1][0] = choice;
                            }
                            break;
                        case 5:
                            if (gamepad[1][1].equals("X") || gamepad[1][1].equals("O")) {
                                stepGame--;
                                changeStep = 1;
                                System.out.println("Эта позиция занята.");
                            } else {
                                gamepad[1][1] = choice;
                            }
                            break;
                        case 6:
                            if (gamepad[1][2].equals("X") || gamepad[1][2].equals("O")) {
                                stepGame--;
                                changeStep = 1;
                                System.out.println("Эта позиция занята.");
                            } else {
                                gamepad[1][2] = choice;
                            }
                            break;
                        case 7:
                            if (gamepad[0][0].equals("X") || gamepad[0][0].equals("O")) {
                                stepGame--;
                                changeStep = 1;
                                System.out.println("Эта позиция занята.");
                            } else {
                                gamepad[0][0] = choice;
                            }
                            break;
                        case 8:
                            if (gamepad[0][1].equals("X") || gamepad[0][1].equals("O")) {
                                stepGame--;
                                changeStep = 1;
                                System.out.println("Эта позиция занята.");
                            } else {
                                gamepad[0][1] = choice;
                            }
                            break;
                        case 9:
                            if (gamepad[0][2].equals("X") || gamepad[0][2].equals("O")) {
                                stepGame--;
                                changeStep = 1;
                                System.out.println("Эта позиция занята.");
                            } else {
                                gamepad[0][2] = choice;
                            }
                            break;
                    }
                } else if (changeStep == 0) {
                    while (true) {
                        i = rnd.nextInt(3);
                        j = rnd.nextInt(3);
                        if (gamepad[i][j].equals("X") || gamepad[i][j].equals("O")) {
                        } else {
                            stepGame++;
                            changeStep = 1;
                            gamepad[i][j] = "" + choiceComputer;
                            System.out.println("Компьютер выбрал позицию - " + "[" + i + "]" + "[" + j + "]");
                            break;
                        }
                    }
                }
            } catch (Exception e) {
                changeStep = 1;
                stepGame--;
                System.out.println("Нет такой позиции.");
            }
        }
    }
}
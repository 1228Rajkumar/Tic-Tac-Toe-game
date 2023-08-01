package tictactoe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserTurn {
	public static final String RESET = "\u001B[0m";
	public static final String RED = "\u001B[31m";
	public static final String GREEN = "\u001B[32m";
	public static final String YELLOW = "\u001B[33m";
	public static final String BLUE = "\u001B[34m";

	private char[][] liveGameBoard = new char[3][3];
	List<Integer> possitions = new ArrayList<>();
	int[][] gamePossitions = new int[3][3];
	
	int userPossition;
	char user;
	char computer;
	boolean flag = false;
	
	ComputerTurn computerTurn = new ComputerTurn();
	Scanner scan = new Scanner(System.in);
	
	public void gameBoard() {
		for (int i = 0; i < liveGameBoard.length; i++) {
			for (int j = 0; j < liveGameBoard.length; j++) {
				liveGameBoard[i][j] = '_';
				System.out.print(YELLOW + liveGameBoard[i][j] + " | ");

			}
			System.out.println("\n" + "-----------" + RESET);
		}
	}

	public void setOption() {
		while (true) {
			int input;
			System.out.println(YELLOW+"---------- Tic-Tac-Toe Game ----------"+RESET);
			System.out.println("--------choose one-------- ");
			System.out.println("1 ----> X");
			System.out.println("2 ----> O");
			System.out.print("Enter your option: ");

			try {
				input = scan.nextInt();
				if (input == 1) {
					user = 'X';
					computer = 'O';
					break;
				} else if (input == 2) {
					user = 'O';
					computer = 'X';
					break;
				} else {
					System.err.println("--------invalid Number--------");
				}
			} catch (Exception e) {
				System.err.println("--------Please enter number only!--------");
				scan.nextLine();
			}

		}
	}

	public void locationIndentation() {
		int a = 1;
		System.out.println(YELLOW+"------Your Symbol is Highlighted in Yellow color------"+RESET);
		System.out.println("This is the location number");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				gamePossitions[i][j] = a;
				System.out.print(gamePossitions[i][j] + " | ");
				a++;
			}
			System.out.println("\n" + "-----------");
		}
	}

	

	public int[] userIndex() {
		boolean flag = true;

		while (flag) {
			try {
				System.out.print("Enter any number between (1-9): ");
				userPossition = scan.nextInt();
				if (userPossition <= 9) {
					if (!possitions.contains(userPossition)) {
						possitions.add(userPossition);
						flag = false;
						return findIndex(gamePossitions, userPossition);
					} else {
						flag = true;
						System.err.println("--------Not a Empty liveGameBoard--------");
						System.out.println();
					}
				} else {
					flag = true;
					System.err.println("--------Invalid Number--------");
					System.out.println();
				}
			} catch (Exception e) {
				System.err.println("--------Please enter number only!--------");
				System.out.println();
				scan.nextLine();
			}
		}
		return null;
	}

	public int[] findIndex(int[][] gamePossitions, int num) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (gamePossitions[i][j] == num) {
					return new int[] { i, j };
				}
			}
		}
		return null;
	}

	public void userMove() {
		int userRow;
		int usercolumn;
		int index[] = userIndex();

		if (index != null) {
			userRow = index[0];
			usercolumn = index[1];
			liveGameBoard[userRow][usercolumn] = user;
			displayBoard(liveGameBoard,user);
			flag = isGameFinished(liveGameBoard);

			if (!flag) {
				System.out.println("You moved successfly");
				computerTurn.computerMove(liveGameBoard, computer, gamePossitions, possitions, userPossition, user);
				flag =isGameFinished(liveGameBoard);
			}
		} else {
			System.err.println("--------The number is not found!--------");
		}

	}

	public void displayBoard(char[][] liveGameBoard, char user) {
		for (int i = 0; i < liveGameBoard.length; i++) {
			for (int j = 0; j < liveGameBoard.length; j++) {
				if (liveGameBoard[i][j] == user) {
					System.out.print(YELLOW + liveGameBoard[i][j] + RESET + " | ");
				} else {
					System.out.print(liveGameBoard[i][j] + " | ");
				}

			}
			System.out.println("\n" + "-----------");
		}
	}

	public boolean isGameFinished(char[][] liveGameBoard) {
		if (liveGameBoard[0][0] == 'X' && liveGameBoard[0][1] == 'X' && liveGameBoard[0][2] == 'X'
				|| liveGameBoard[1][0] == 'X' && liveGameBoard[1][1] == 'X' && liveGameBoard[1][2] == 'X'
				|| liveGameBoard[2][0] == 'X' && liveGameBoard[2][1] == 'X' && liveGameBoard[2][2] == 'X' ||

				liveGameBoard[0][0] == 'X' && liveGameBoard[1][0] == 'X' && liveGameBoard[2][0] == 'X'
				|| liveGameBoard[0][1] == 'X' && liveGameBoard[1][1] == 'X' && liveGameBoard[2][1] == 'X'
				|| liveGameBoard[0][2] == 'X' && liveGameBoard[1][2] == 'X' && liveGameBoard[2][2] == 'X' ||

				liveGameBoard[0][0] == 'X' && liveGameBoard[1][1] == 'X' && liveGameBoard[2][2] == 'X'
				|| liveGameBoard[0][2] == 'X' && liveGameBoard[1][1] == 'X' && liveGameBoard[2][0] == 'X') {

			if (user == 'X') {
				System.out.println(GREEN + "---------YOU WIN THE MATCH---------" + RESET);
				return true;
			} else if (user == 'O') {
				System.out.println(RED + "---------YOU LOSE THE MATCH---------" + RESET);
				return true;
			}
		} else if (liveGameBoard[0][0] == 'O' && liveGameBoard[0][1] == 'O' && liveGameBoard[0][2] == 'O'
				|| liveGameBoard[1][0] == 'O' && liveGameBoard[1][1] == 'O' && liveGameBoard[1][2] == 'O'
				|| liveGameBoard[2][0] == 'O' && liveGameBoard[2][1] == 'O' && liveGameBoard[2][2] == 'O' ||

				liveGameBoard[0][0] == 'O' && liveGameBoard[1][0] == 'O' && liveGameBoard[2][0] == 'O'
				|| liveGameBoard[0][1] == 'O' && liveGameBoard[1][1] == 'O' && liveGameBoard[2][1] == 'O'
				|| liveGameBoard[0][2] == 'O' && liveGameBoard[1][2] == 'O' && liveGameBoard[2][2] == 'O' ||

				liveGameBoard[0][0] == 'O' && liveGameBoard[1][1] == 'O' && liveGameBoard[2][2] == 'O'
				|| liveGameBoard[0][2] == 'O' && liveGameBoard[1][1] == 'O' && liveGameBoard[2][0] == 'O') {

			if (user == 'O') {
				System.out.println(GREEN + "---------YOU WIN THE MATCH---------" + RESET);
				return true;
			} else if (user == 'X') {
				System.out.println(RED + "---------YOU LOSE THE MATCH---------" + RESET);
				return true;
			}
		}else if((possitions.size())==9) {
			System.out.println(YELLOW + "---------THE MATCH IS TIE---------" + RESET);
			return true; 
		}
		return false;
	}

}

package tictactoe;

public class TicTacToeStart {
	
	public static void main(String[] args) {
		UserTurn userTurn = new UserTurn();
		userTurn.gameBoard();
		userTurn.setOption();
		userTurn.locationIndentation();

		while (!userTurn.flag) {
			userTurn.userMove();
		}

	}
}

package tictactoe;

import java.util.List;

public class ComputerTurn {
	
	
	public int[] computerIndex(char[][] liveGameBoard, int[][] gamePossitions, List<Integer> possitions, int userPossition, char user, char computer) {
		UserTurn tic = new UserTurn();
		int user_Possition = userPossition;

		switch (user_Possition) {
		case 1:
			if (!possitions.contains(5)) {
				possitions.add(5);
				return tic.findIndex(gamePossitions, 5);
			} 
			else if (isUser(liveGameBoard, 1,0, user) && !possitions.contains(7)) {
				possitions.add(7);
				return tic.findIndex(gamePossitions, 7);
				}
			else if (isUser(liveGameBoard, 2,0, user) && !possitions.contains(4)) {
				possitions.add(4);
				return tic.findIndex(gamePossitions, 4);
				}
			else if (isUser(liveGameBoard, 0, 2, user) && !possitions.contains(2)) {
				possitions.add(2);
				return tic.findIndex(gamePossitions, 2);
				}
			else if (isUser(liveGameBoard, 0, 1, user) && !possitions.contains(3)) {
				possitions.add(3);
				return tic.findIndex(gamePossitions, 3);
			}
			else if (isUser(liveGameBoard, 2, 1, user) && !possitions.contains(7)) {
				possitions.add(7);
				return tic.findIndex(gamePossitions, 7);
			}
			else if (isUser(liveGameBoard, 1, 2, user) && !possitions.contains(3)) {
				possitions.add(3);
				return tic.findIndex(gamePossitions, 3);
			}
			else if (!possitions.contains(2)) {
				possitions.add(2);
				return tic.findIndex(gamePossitions, 2);
			}
			else if (!possitions.contains(4)) {
				possitions.add(4);
				return tic.findIndex(gamePossitions, 4);
			};
			break;
		case 2:
			if (!possitions.contains(5)) {
				possitions.add(5);
				return tic.findIndex(gamePossitions, 5);
			} 
			else if (isUser(liveGameBoard, 1, 1, user) && !possitions.contains(8)) {
				possitions.add(8);
				return tic.findIndex(gamePossitions, 8);
			}
			else if (isUser(liveGameBoard, 0, 0, user) && !possitions.contains(3)) {
				possitions.add(3);
				return tic.findIndex(gamePossitions, 3);
			}
			else if (!possitions.contains(1)) {
				possitions.add(1);
				return tic.findIndex(gamePossitions, 1);
			} else if (!possitions.contains(3)) {
				possitions.add(3);
				return tic.findIndex(gamePossitions, 3);
			}
			else if (!possitions.contains(8)) {
				possitions.add(8);
				return tic.findIndex(gamePossitions, 8);
			}
			else if (!possitions.contains(6)) {
				possitions.add(6);
				return tic.findIndex(gamePossitions, 6);
			};
			break;
		case 3:
			if (!possitions.contains(5)) {
				possitions.add(5);
				return tic.findIndex(gamePossitions, 5);
			}
			else if (isUser(liveGameBoard, 1, 1, user) && !possitions.contains(7)) {
				possitions.add(7);
				return tic.findIndex(gamePossitions, 7);
			}
			else if (isComputer(liveGameBoard, 2, 0, computer) && isComputer(liveGameBoard, 0, 0, computer) && !possitions.contains(4)) {
				possitions.add(4);
				return tic.findIndex(gamePossitions, 4);
			}
			else if (isUser(liveGameBoard, 1, 2, user) && !possitions.contains(9)) {
				possitions.add(9);
				return tic.findIndex(gamePossitions, 9);
			}
			else if (isUser(liveGameBoard, 2, 2, user) && !possitions.contains(6)) {
				possitions.add(6);
				return tic.findIndex(gamePossitions, 6);
			}
			else if (isUser(liveGameBoard, 0, 0, user) && !possitions.contains(2)) {
				possitions.add(2);
				return tic.findIndex(gamePossitions, 2);
			}
			else if (isUser(liveGameBoard, 0, 1, user) && !possitions.contains(1)) {
				possitions.add(1);
				return tic.findIndex(gamePossitions, 1);
			}
			else if (isUser(liveGameBoard, 2, 1, user) && !possitions.contains(9)) {
				possitions.add(9);
				return tic.findIndex(gamePossitions, 9);
			}
			else if (isUser(liveGameBoard, 1, 0, user) && !possitions.contains(1)) {
				possitions.add(1);
				return tic.findIndex(gamePossitions, 1);
			}
			
			else if (!possitions.contains(8)) {
				possitions.add(8);
				return tic.findIndex(gamePossitions, 8);
				}
			else if (!possitions.contains(9)) {
				possitions.add(9);
				return tic.findIndex(gamePossitions, 9);
			}
			 else if (!possitions.contains(2)) {
				possitions.add(2);
				return tic.findIndex(gamePossitions, 2);
			}
			else if (!possitions.contains(7)) {
				possitions.add(7);
				return tic.findIndex(gamePossitions, 7);
			}
			;
			break;
		case 4:
			if (!possitions.contains(5)) {
				possitions.add(5);
				return tic.findIndex(gamePossitions, 5);
			} 
			else if (isUser(liveGameBoard, 1, 1, user) && !possitions.contains(6)) {
				possitions.add(6);
				return tic.findIndex(gamePossitions, 6);
			}
			else if (isUser(liveGameBoard, 0, 0, user) && !possitions.contains(7)) {
				possitions.add(7);
				return tic.findIndex(gamePossitions, 7);
			}
			else if (!possitions.contains(7)) {
				possitions.add(7);
				return tic.findIndex(gamePossitions, 7);
			}
			else if (!possitions.contains(1)) {
				possitions.add(1);
				return tic.findIndex(gamePossitions, 1);
			} else if (!possitions.contains(6)) {
				possitions.add(6);
				return tic.findIndex(gamePossitions, 6);
			}
			else if (!possitions.contains(3)) {
				possitions.add(3);
				return tic.findIndex(gamePossitions, 3);
			};
			break;
		case 5:
			if (!possitions.contains(1)) {
				possitions.add(1);
				return tic.findIndex(gamePossitions, 1);
			};
			break;
		case 6:
			if (!possitions.contains(5)) {
				possitions.add(5);
				return tic.findIndex(gamePossitions, 5);
			}
			else if (isUser(liveGameBoard, 1, 1, user) && !possitions.contains(4)) {
				possitions.add(4);
				return tic.findIndex(gamePossitions, 4);
			}
			else if (isUser(liveGameBoard, 0, 2, user) && !possitions.contains(9)) {
				possitions.add(9);
				return tic.findIndex(gamePossitions, 9);
			}
			else if (isUser(liveGameBoard, 2, 0, user) && isUser(liveGameBoard, 2, 1, user) && !possitions.contains(9)) {
				possitions.add(9);
				return tic.findIndex(gamePossitions, 9);
			}
			else if (!possitions.contains(9)) {
				possitions.add(9);
				return tic.findIndex(gamePossitions, 9);
			}
			else if (!possitions.contains(3)) {
				possitions.add(3);
				return tic.findIndex(gamePossitions, 3);
			}
			 else if (!possitions.contains(4)) {
				possitions.add(4);
				return tic.findIndex(gamePossitions, 4);
			}
			else if (!possitions.contains(2)) {
				possitions.add(2);
				return tic.findIndex(gamePossitions, 2);
			}
			else if (!possitions.contains(1)) {
				possitions.add(1);
				return tic.findIndex(gamePossitions, 1);
			}
			else if (!possitions.contains(7)) {
				possitions.add(7);
				return tic.findIndex(gamePossitions, 7);
			};
			break;
		case 7:
			if (!possitions.contains(5)) {
				possitions.add(5);
				return tic.findIndex(gamePossitions, 5);
			} 
			else if (isUser(liveGameBoard, 1, 1, user) && !possitions.contains(3)) {
				possitions.add(3);
				return tic.findIndex(gamePossitions, 3);
			}
			else if (isUser(liveGameBoard, 2, 2, user) && !possitions.contains(8)) {
				possitions.add(8);
				return tic.findIndex(gamePossitions, 8);
			}
			else if (isUser(liveGameBoard, 0, 0, user) && !possitions.contains(4)) {
				possitions.add(4);
				return tic.findIndex(gamePossitions, 4);
			}
			else if (isUser(liveGameBoard, 2, 1, user) && !possitions.contains(9)) {
				possitions.add(9);
				return tic.findIndex(gamePossitions, 9);
			}
			else if (isUser(liveGameBoard, 1, 2, user) && !possitions.contains(9)) {
				possitions.add(9);
				return tic.findIndex(gamePossitions, 9);
			}
			else if (isUser(liveGameBoard, 0, 1, user) && !possitions.contains(1)) {
				possitions.add(1);
				return tic.findIndex(gamePossitions, 1);
			}
			
			else if (!possitions.contains(4)) {
				possitions.add(4);
				return tic.findIndex(gamePossitions, 4);
			}
			else if (!possitions.contains(1)) {
				possitions.add(1);
				return tic.findIndex(gamePossitions, 1);
			}else if (!possitions.contains(8)) {
				possitions.add(8);
				return tic.findIndex(gamePossitions, 8);
			}
			else if (!possitions.contains(3)) {
				possitions.add(3);
				return tic.findIndex(gamePossitions, 3);
			};
			break;
		case 8:
			if (!possitions.contains(5)) {
				possitions.add(5);
				return tic.findIndex(gamePossitions, 5);
			}
			else if (isUser(liveGameBoard, 1, 1, user) && !possitions.contains(2)) {
				possitions.add(2);
				return tic.findIndex(gamePossitions, 2);
			}
			else if (isUser(liveGameBoard, 2, 0, user) && !possitions.contains(9)) {
				possitions.add(9);
				return tic.findIndex(gamePossitions, 9);
			}
			else if (!possitions.contains(7)) {
				possitions.add(7);
				return tic.findIndex(gamePossitions, 7);
			}
			else if (!possitions.contains(2)) {
				possitions.add(2);
				return tic.findIndex(gamePossitions, 2);
			} else if (!possitions.contains(9)) {
				possitions.add(9);
				return tic.findIndex(gamePossitions, 9);
			}
			else if (!possitions.contains(3)) {
				possitions.add(3);
				return tic.findIndex(gamePossitions, 3);
			}
			;
			break;
		case 9:
			if (!possitions.contains(5)) {
				possitions.add(5);
				return tic.findIndex(gamePossitions, 5);
			} 
			else if (isUser(liveGameBoard, 1, 1, user) && !possitions.contains(1)) {
				possitions.add(1);
				return tic.findIndex(gamePossitions, 1);
			}
			else if (isComputer(liveGameBoard, 0, 2, computer) && isComputer(liveGameBoard, 0, 0, computer) && !possitions.contains(2)) {
				possitions.add(2);
				return tic.findIndex(gamePossitions, 2);
			}
			else if (isComputer(liveGameBoard, 0, 0, computer) && isComputer(liveGameBoard, 2, 0, computer) && !possitions.contains(4)) {
				possitions.add(4);
				return tic.findIndex(gamePossitions, 4);
			}
			else if (isUser(liveGameBoard, 2, 1, user) && !possitions.contains(7)) {
				possitions.add(7);
				return tic.findIndex(gamePossitions, 7);
			}
			else if (isUser(liveGameBoard, 2, 0, user) && !possitions.contains(8)) {
				possitions.add(8);
				return tic.findIndex(gamePossitions, 8);
			}
			else if (isUser(liveGameBoard, 1, 2, user) && !possitions.contains(3)) {
				possitions.add(3);
				return tic.findIndex(gamePossitions, 3);
			}
			else if (isUser(liveGameBoard, 0, 2, user) && !possitions.contains(6)) {
				possitions.add(6);
				return tic.findIndex(gamePossitions, 6);
			}
			else if (isUser(liveGameBoard, 1, 0, user) && !possitions.contains(7)) {
				possitions.add(7);
				return tic.findIndex(gamePossitions, 7);
			}
			else if (!possitions.contains(8)) {
				possitions.add(8);
				return tic.findIndex(gamePossitions, 8);
			}
			else if (!possitions.contains(7)) {
				possitions.add(7);
				return tic.findIndex(gamePossitions, 7);
			}
			 
			else if (!possitions.contains(6)) {
				possitions.add(6);
				return tic.findIndex(gamePossitions, 6);
			}
			else if (!possitions.contains(1)) {
				possitions.add(1);
				return tic.findIndex(gamePossitions, 1);
			};
			break;
		}
		return null;
	}

	public void computerMove(char[][] liveGameBoard, char computer, int[][] gamePossitions, List<Integer> possitions, int userPossition, char user) {
		int comRow;
		int comColumn;
		int index[] = computerIndex(liveGameBoard, gamePossitions, possitions, userPossition, user, computer);
		UserTurn tic = new UserTurn();

		if (index != null) {
			comRow = index[0];
			comColumn = index[1];
			liveGameBoard[comRow][comColumn] = computer;
			tic.displayBoard(liveGameBoard,user);
		}
	}
	
	public boolean isUser(char[][] liveGameBoard, int row, int column, char user) {
		for (int i = 0; i < liveGameBoard.length; i++) {
			for (int j = 0; j < liveGameBoard.length; j++) {
				if (i ==row && j==column) {
					if(liveGameBoard[i][j]==user) {
						return true;
					}
				}
			}
		}
		return false;
	}
	public boolean isComputer(char[][] liveGameBoard, int row, int column, char computer) {
		for (int i = 0; i < liveGameBoard.length; i++) {
			for (int j = 0; j < liveGameBoard.length; j++) {
				if (i ==row && j==column) {
					if(liveGameBoard[i][j]==computer) {
						return true;
					}
				}
			}
		}
		return false;
	}
}

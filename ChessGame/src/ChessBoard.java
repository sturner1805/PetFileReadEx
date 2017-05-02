
public class ChessBoard {
	
	static char[][] board = new char[8][8];
	
	public static void main(String[]args){
		char[][] board = new char[8][8];
		for(int ii = 0; ii < 8; ii++){
			for (int jj = 0; jj < 8; jj++){
				board[ii][jj] = '\u2003';
			}
		}
		String piecePosition = "b.rk:a1 , b.kt:c3 , b.bs:a3 , b.qn:a4 , b.kg:a5 , b.bs:a6 , b.kt:a7 , b.rk:a8 , b.pn:b1 , b.pn:d2 , b.pn:b3 , b.pn:b4 , b.pn:b5 , b.pn:b6 , b.pn:b7 , b.pn:b8 , w.rk:h1 , w.kt:h2 , w.bs:h3 , w.qn:h4 , w.kg:h5 , w.bs:f8 , w.kt:f6 , w.rk:h8 , w.pn:g1 , w.pn:g2 , w.pn:g3 , w.pn:g4 , w.pn:g5 , w.pn:g6 , w.pn:e7 , w.pn:g8";
		String[] pieces = piecePosition.split(" , ");
		 for(int i=0 ; i < pieces.length ; i++){
			 placePiece(pieces[i], board);
		 }
		 for(int ii = 0; ii < 8; ii++){
			 for(int jj = 0; jj < 8; jj++){
				 System.out.print(board[ii][jj]);
			 }
			 System.out.println("");
		 }
	}
	
	public static void placePiece(String s, char[][] c){
		String[] piece = s.split(":");
		
		char symbol = ' ';
		switch(piece [0]){
		case "b.rk": symbol = '\u265c';
		break;
		case "b.kt": symbol = '\u265e';
		break;
		case "b.bs": symbol = '\u265d';
		break;
		case "b.qn": symbol = '\u265b';
		break;
		case "b.kg": symbol = '\u265a';
		break;
		case "b.pn": symbol = '\u265f';
		break;
		case "w.rk": symbol = '\u2656';
		break;
		case "w.kt": symbol = '\u2658';
		break;
		case "w.bs": symbol = '\u2657';
		break;
		case "w.qn": symbol = '\u2655';
		break;
		case "w.kg": symbol = '\u2654';
		break;
		case "w.pn": symbol = '\u2659';
		break;
		}
		
		c[(int) (piece[1].charAt(0)) - 97][Integer.parseInt(piece[1].substring(1))-1] = symbol;
	}
}

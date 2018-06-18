package safebox.util;

import java.util.BitSet;

public class AdjacentPassword {

	
	/**
	 * Adjacent keys.
	 */
	BitSet[] adjacentKeys = new BitSet[127]; 
	
	
	public AdjacentPassword() {
		
	}
	
	/**
	 * Initialize the keyboard adjacent table.
	 */
	public void initialize() {

		// 0 key
		adjacentKeys[(int) '0'] = new BitSet(127);
		adjacentKeys[(int) '0'].set((int)'0');
		adjacentKeys[(int) '0'].set((int)'9');
		adjacentKeys[(int) '0'].set((int)'P');
		adjacentKeys[(int) '0'].set((int)'O');
		//1 KEY
		adjacentKeys[(int) '1'] = new BitSet(127);
		adjacentKeys[(int) '1'].set((int)'1');
		adjacentKeys[(int) '1'].set((int)'2');
		adjacentKeys[(int) '1'].set((int)'Q');
		//2 KEY
		adjacentKeys[(int) '2'] = new BitSet(127);
		adjacentKeys[(int) '2'].set((int)'2');
		adjacentKeys[(int) '2'].set((int)'1');
		adjacentKeys[(int) '2'].set((int)'3');
		adjacentKeys[(int) '2'].set((int)'W');
		adjacentKeys[(int) '2'].set((int)'Q');
		//3 KEY
		adjacentKeys[(int) '3'] = new BitSet(127);
		adjacentKeys[(int) '3'].set((int)'3');
		adjacentKeys[(int) '3'].set((int)'2');
		adjacentKeys[(int) '3'].set((int)'4');
		adjacentKeys[(int) '3'].set((int)'E');
		adjacentKeys[(int) '3'].set((int)'W');
		//4 KEY
		adjacentKeys[(int) '4'] = new BitSet(127);
		adjacentKeys[(int) '4'].set((int)'4');
		adjacentKeys[(int) '4'].set((int)'3');
		adjacentKeys[(int) '4'].set((int)'5');
		adjacentKeys[(int) '4'].set((int)'R');
		adjacentKeys[(int) '4'].set((int)'E');
		//5 KEY
		adjacentKeys[(int) '5'] = new BitSet(127);
		adjacentKeys[(int) '5'].set((int)'5');
		adjacentKeys[(int) '5'].set((int)'4');
		adjacentKeys[(int) '5'].set((int)'6');
		adjacentKeys[(int) '5'].set((int)'T');
		adjacentKeys[(int) '5'].set((int)'R');
		//6 KEY
		adjacentKeys[(int) '6'] = new BitSet(127);
		adjacentKeys[(int) '6'].set((int)'6');
		adjacentKeys[(int) '6'].set((int)'5');
		adjacentKeys[(int) '6'].set((int)'7');
		adjacentKeys[(int) '6'].set((int)'Y');
		adjacentKeys[(int) '6'].set((int)'T');
		//7 KEY
		adjacentKeys[(int) '7'] = new BitSet(127);
		adjacentKeys[(int) '7'].set((int)'7');
		adjacentKeys[(int) '7'].set((int)'6');
		adjacentKeys[(int) '7'].set((int)'8');
		adjacentKeys[(int) '7'].set((int)'U');
		adjacentKeys[(int) '7'].set((int)'Y');
		//8 KEY
		adjacentKeys[(int) '8'] = new BitSet(127);
		adjacentKeys[(int) '8'].set((int)'8');
		adjacentKeys[(int) '8'].set((int)'7');
		adjacentKeys[(int) '8'].set((int)'9');
		adjacentKeys[(int) '8'].set((int)'I');
		adjacentKeys[(int) '8'].set((int)'U');
		//9 KEY
		adjacentKeys[(int) '9'] = new BitSet(127);
		adjacentKeys[(int) '9'].set((int)'9');
		adjacentKeys[(int) '9'].set((int)'8');
		adjacentKeys[(int) '9'].set((int)'0');
		adjacentKeys[(int) '9'].set((int)'O');
		adjacentKeys[(int) '9'].set((int)'I');
		//A KEY
		adjacentKeys[(int) 'A'] = new BitSet(127);
		adjacentKeys[(int) 'A'].set((int)'A');
		adjacentKeys[(int) 'A'].set((int)'S');
		adjacentKeys[(int) 'A'].set((int)'Q');
		adjacentKeys[(int) 'A'].set((int)'Z');
		adjacentKeys[(int) 'A'].set((int)'W');
		//B KEY
		adjacentKeys[(int) 'B'] = new BitSet(127);
		adjacentKeys[(int) 'B'].set((int)'B');
		adjacentKeys[(int) 'B'].set((int)'V');
		adjacentKeys[(int) 'B'].set((int)'N');
		adjacentKeys[(int) 'B'].set((int)'G');
		adjacentKeys[(int) 'B'].set((int)'H');
		//C KEY
		adjacentKeys[(int) 'C'] = new BitSet(127);
		adjacentKeys[(int) 'C'].set((int)'C');
		adjacentKeys[(int) 'C'].set((int)'X');
		adjacentKeys[(int) 'C'].set((int)'V');
		adjacentKeys[(int) 'C'].set((int)'D');
		adjacentKeys[(int) 'C'].set((int)'F');
		//D KEY
		adjacentKeys[(int) 'D'] = new BitSet(127);
		adjacentKeys[(int) 'D'].set((int)'D');
		adjacentKeys[(int) 'D'].set((int)'S');
		adjacentKeys[(int) 'D'].set((int)'F');
		adjacentKeys[(int) 'D'].set((int)'E');
		adjacentKeys[(int) 'D'].set((int)'C');
		adjacentKeys[(int) 'D'].set((int)'R');
		adjacentKeys[(int) 'D'].set((int)'X');
		//E KEY
		adjacentKeys[(int) 'E'] = new BitSet(127);
		adjacentKeys[(int) 'E'].set((int)'E');
		adjacentKeys[(int) 'E'].set((int)'W');
		adjacentKeys[(int) 'E'].set((int)'R');
		adjacentKeys[(int) 'E'].set((int)'3');
		adjacentKeys[(int) 'E'].set((int)'D');
		adjacentKeys[(int) 'E'].set((int)'4');
		adjacentKeys[(int) 'E'].set((int)'S');
		//F KEY
		adjacentKeys[(int) 'F'] = new BitSet(127);
		adjacentKeys[(int) 'F'].set((int)'F');
		adjacentKeys[(int) 'F'].set((int)'D');
		adjacentKeys[(int) 'F'].set((int)'G');
		adjacentKeys[(int) 'F'].set((int)'R');
		adjacentKeys[(int) 'F'].set((int)'V');
		adjacentKeys[(int) 'F'].set((int)'T');
		adjacentKeys[(int) 'F'].set((int)'C');
		//G KEY
		adjacentKeys[(int) 'G'] = new BitSet(127);
		adjacentKeys[(int) 'G'].set((int)'G');
		adjacentKeys[(int) 'G'].set((int)'F');
		adjacentKeys[(int) 'G'].set((int)'H');
		adjacentKeys[(int) 'G'].set((int)'T');
		adjacentKeys[(int) 'G'].set((int)'B');
		adjacentKeys[(int) 'G'].set((int)'Y');
		adjacentKeys[(int) 'G'].set((int)'V');		
		//H KEY
		adjacentKeys[(int) 'H'] = new BitSet(127);
		adjacentKeys[(int) 'H'].set((int)'H');
		adjacentKeys[(int) 'H'].set((int)'G');
		adjacentKeys[(int) 'H'].set((int)'J');
		adjacentKeys[(int) 'H'].set((int)'Y');
		adjacentKeys[(int) 'H'].set((int)'N');
		adjacentKeys[(int) 'H'].set((int)'U');
		adjacentKeys[(int) 'H'].set((int)'B');
		//I KEY
		adjacentKeys[(int) 'I'] = new BitSet(127);
		adjacentKeys[(int) 'I'].set((int)'I');
		adjacentKeys[(int) 'I'].set((int)'U');
		adjacentKeys[(int) 'I'].set((int)'O');
		adjacentKeys[(int) 'I'].set((int)'8');
		adjacentKeys[(int) 'I'].set((int)'K');
		adjacentKeys[(int) 'I'].set((int)'9');
		adjacentKeys[(int) 'I'].set((int)'J');		
		//J KEY
		adjacentKeys[(int) 'J'] = new BitSet(127);
		adjacentKeys[(int) 'J'].set((int)'J');
		adjacentKeys[(int) 'J'].set((int)'H');
		adjacentKeys[(int) 'J'].set((int)'K');
		adjacentKeys[(int) 'J'].set((int)'U');
		adjacentKeys[(int) 'J'].set((int)'M');
		adjacentKeys[(int) 'J'].set((int)'I');
		adjacentKeys[(int) 'J'].set((int)'N');				
		//K KEY
		adjacentKeys[(int) 'K'] = new BitSet(127);
		adjacentKeys[(int) 'K'].set((int)'K');
		adjacentKeys[(int) 'K'].set((int)'J');
		adjacentKeys[(int) 'K'].set((int)'L');
		adjacentKeys[(int) 'K'].set((int)'I');
		adjacentKeys[(int) 'K'].set((int)'O');				
		adjacentKeys[(int) 'K'].set((int)'M');
		//L KEY
		adjacentKeys[(int) 'L'] = new BitSet(127);
		adjacentKeys[(int) 'L'].set((int)'L');
		adjacentKeys[(int) 'L'].set((int)'K');
		adjacentKeys[(int) 'L'].set((int)'O');
		adjacentKeys[(int) 'L'].set((int)'P');
		//M KEY
		adjacentKeys[(int) 'M'] = new BitSet(127);
		adjacentKeys[(int) 'M'].set((int)'M');
		adjacentKeys[(int) 'M'].set((int)'N');
		adjacentKeys[(int) 'M'].set((int)'J');
		adjacentKeys[(int) 'M'].set((int)'K');
		//N KEY
		adjacentKeys[(int) 'N'] = new BitSet(127);
		adjacentKeys[(int) 'N'].set((int)'N');
		adjacentKeys[(int) 'N'].set((int)'B');
		adjacentKeys[(int) 'N'].set((int)'M');
		adjacentKeys[(int) 'N'].set((int)'H');
		adjacentKeys[(int) 'N'].set((int)'J');
		//O KEY
		adjacentKeys[(int) 'O'] = new BitSet(127);
		adjacentKeys[(int) 'O'].set((int)'O');
		adjacentKeys[(int) 'O'].set((int)'I');
		adjacentKeys[(int) 'O'].set((int)'P');
		adjacentKeys[(int) 'O'].set((int)'9');
		adjacentKeys[(int) 'O'].set((int)'L');
		adjacentKeys[(int) 'O'].set((int)'0');
		adjacentKeys[(int) 'O'].set((int)'K');
		//P KEY
		adjacentKeys[(int) 'P'] = new BitSet(127);
		adjacentKeys[(int) 'P'].set((int)'P');
		adjacentKeys[(int) 'P'].set((int)'O');
		adjacentKeys[(int) 'P'].set((int)'0');
		adjacentKeys[(int) 'P'].set((int)'L');
		//Q KEY
		adjacentKeys[(int) 'Q'] = new BitSet(127);
		adjacentKeys[(int) 'Q'].set((int)'Q');
		adjacentKeys[(int) 'Q'].set((int)'W');
		adjacentKeys[(int) 'Q'].set((int)'1');
		adjacentKeys[(int) 'Q'].set((int)'A');
		adjacentKeys[(int) 'Q'].set((int)'2');
		//R KEY
		adjacentKeys[(int) 'R'] = new BitSet(127);
		adjacentKeys[(int) 'R'].set((int)'R');
		adjacentKeys[(int) 'R'].set((int)'E');
		adjacentKeys[(int) 'R'].set((int)'T');
		adjacentKeys[(int) 'R'].set((int)'4');
		adjacentKeys[(int) 'R'].set((int)'F');
		adjacentKeys[(int) 'R'].set((int)'5');
		adjacentKeys[(int) 'R'].set((int)'D');
		//S KEY
		adjacentKeys[(int) 'S'] = new BitSet(127);
		adjacentKeys[(int) 'S'].set((int)'S');
		adjacentKeys[(int) 'S'].set((int)'A');
		adjacentKeys[(int) 'S'].set((int)'D');
		adjacentKeys[(int) 'S'].set((int)'W');
		adjacentKeys[(int) 'S'].set((int)'X');
		adjacentKeys[(int) 'S'].set((int)'E');
		adjacentKeys[(int) 'S'].set((int)'Z');
		//T KEY
		adjacentKeys[(int) 'T'] = new BitSet(127);
		adjacentKeys[(int) 'T'].set((int)'T');
		adjacentKeys[(int) 'T'].set((int)'R');
		adjacentKeys[(int) 'T'].set((int)'Y');
		adjacentKeys[(int) 'T'].set((int)'5');
		adjacentKeys[(int) 'T'].set((int)'G');
		adjacentKeys[(int) 'T'].set((int)'6');
		adjacentKeys[(int) 'T'].set((int)'F');		
		//U KEY
		adjacentKeys[(int) 'U'] = new BitSet(127);
		adjacentKeys[(int) 'U'].set((int)'U');
		adjacentKeys[(int) 'U'].set((int)'Y');
		adjacentKeys[(int) 'U'].set((int)'I');
		adjacentKeys[(int) 'U'].set((int)'7');
		adjacentKeys[(int) 'U'].set((int)'J');
		adjacentKeys[(int) 'U'].set((int)'8');
		adjacentKeys[(int) 'U'].set((int)'H');
		//V KEY
		adjacentKeys[(int) 'V'] = new BitSet(127);
		adjacentKeys[(int) 'V'].set((int)'V');
		adjacentKeys[(int) 'V'].set((int)'C');
		adjacentKeys[(int) 'V'].set((int)'B');
		adjacentKeys[(int) 'V'].set((int)'F');
		adjacentKeys[(int) 'V'].set((int)'G');
		//W KEY
		adjacentKeys[(int) 'W'] = new BitSet(127);
		adjacentKeys[(int) 'W'].set((int)'W');
		adjacentKeys[(int) 'W'].set((int)'Q');
		adjacentKeys[(int) 'W'].set((int)'E');
		adjacentKeys[(int) 'W'].set((int)'2');
		adjacentKeys[(int) 'W'].set((int)'S');
		adjacentKeys[(int) 'W'].set((int)'3');
		adjacentKeys[(int) 'W'].set((int)'A');
		//X KEY
		adjacentKeys[(int) 'X'] = new BitSet(127);
		adjacentKeys[(int) 'X'].set((int)'X');
		adjacentKeys[(int) 'X'].set((int)'Z');
		adjacentKeys[(int) 'X'].set((int)'C');
		adjacentKeys[(int) 'X'].set((int)'S');
		adjacentKeys[(int) 'X'].set((int)'D');
		//Y KEY
		adjacentKeys[(int) 'Y'] = new BitSet(127);
		adjacentKeys[(int) 'Y'].set((int)'Y');
		adjacentKeys[(int) 'Y'].set((int)'T');
		adjacentKeys[(int) 'Y'].set((int)'U');
		adjacentKeys[(int) 'Y'].set((int)'6');
		adjacentKeys[(int) 'Y'].set((int)'H');
		adjacentKeys[(int) 'Y'].set((int)'7');
		adjacentKeys[(int) 'Y'].set((int)'G');
		//Z KEY
		adjacentKeys[(int) 'Z'] = new BitSet(127);
		adjacentKeys[(int) 'Z'].set((int)'Z');
		adjacentKeys[(int) 'Z'].set((int)'X');
		adjacentKeys[(int) 'Z'].set((int)'A');
		adjacentKeys[(int) 'Z'].set((int)'S');

	}

	public boolean isAdjacentPassword(String password) {
		
		String tempPasswordUpper = password.toUpperCase();
		
		for (int i = 1; i < tempPasswordUpper.length(); i++) {
		
			if (!isNeighbourKey (tempPasswordUpper.charAt(i-1), tempPasswordUpper.charAt(i))) {
				return false;
			}
		}		
		return true;
	}
	
	private boolean isNeighbourKey(char key1, char key2) {
	
		try {
			int intKey1 = (int) key1;
			int intKey2 = (int) key2;
			
			if ((intKey1 >= 0 && intKey1 < 127) && (intKey2 >= 0 && intKey2 < 127)) {   
				return adjacentKeys[intKey1].get(intKey2);
			}
		} catch (Exception ex) {
		}
		return false;
	}
	
}

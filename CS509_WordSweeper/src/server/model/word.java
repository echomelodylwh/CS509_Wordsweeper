package server.model;

import java.util.ArrayList;
import server.model.Game;
import server.util.Letters;
import server.util.WordTable;



public class word {
	String text;
	ArrayList<Cell> cells;
		
	
	
	//check if the cells of the word is consistent, yes return true, otherwise return false
	public static boolean isConsistent(ArrayList<Cell> cells){
		
		for(int i=1; i < cells.size(); i++){
			int a = Math.abs(cells.get(i).getPosition().getColumn()-cells.get(i-1).getPosition().getColumn());
			int b = Math.abs(cells.get(i).getPosition().getRow()-cells.get(i-1).getPosition().getRow());
			if(a!= 1 || b!= 1 ){
				return false;
			}		
		}	
		return true;
	}
	

}

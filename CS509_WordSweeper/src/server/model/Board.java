package server.model;

import java.util.Collection;
import java.util.Hashtable;
import java.util.List;
import java.util.Stack;

import util.Location;

public class Board {
	
	int size;
	Hashtable<Location, Cell> table; 
	
	public Board() {
		super();
		size = 7;
		for(int c = 1; c<=size;c++){
			for(int r =1; r<=size; r++){
                Location loc = new Location(c,r);
                Cell cell = new Cell(loc);
				cell.getLetter();
				table.put(loc, cell);	
			}
		}
        
    
	}
	
	public Board(int size) {
		super();
		for(int c = 1; c<=size;c++){
			for(int r =1; r<=size; r++){
				Location loc = new Location(c,r);
                Cell cell = new Cell(loc);
				cell.getLetter();
				table.put(loc, cell);
			}
		}
	}
	
	public int getSize(){
		return this.size;
	}
	
	
	public void resetBoard(){
		Board board = new Board();	
	}
	
	public void resetBoard(int size){
		Board board = new Board(size);	
	}
	
	public String getCellContains(Location l){
		return table.get(l).letter;
	}
	
	public void BonusCell(){
		int c = (int) (Math.random()*size)+1;
		int r = (int) (Math.random()*size)+1;
		table.get(new Location(c,r).hashCode()).setSeleted();	
	} 
	
	public void removeWord(List<Cell> Cells){
		for(Cell c : Cells){
			c.removeLetter();
		}	
	}
	
	public void refreshBoard(){
		for(int c = 1; c<=size;c++){
			int count = 0;
			for(int r =1; r<=size; r++){
				Location l = new Location(c,r);
				if(!table.get(l.hashCode()).hasLetter()){
					while (!table.get(new Location(c,++r).hashCode()).hasLetter())
					table.get(l.hashCode()).letter = table.get(new Location(c,r).hashCode()).getLetter();
					table.get(new Location(c,r).hashCode()).removeLetter();
					
					count++;	
				}			
			}
			for(int x =0; x<count; x++){
				Location r = new Location(c, size-x);
				table.get(r.hashCode()).setLetter();
			}
		}	
	}
	
	
	
	
	
	






	
	

}

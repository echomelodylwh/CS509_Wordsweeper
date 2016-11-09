package server.model;

import java.util.Collection;
import java.util.Hashtable;
import java.util.List;
import java.util.Stack;

import server.util.Location;

public class Board {
	
	int size;
	Collection< Location> coordination;
	Hashtable<Location, Cell> table; 
	
	public Board() {
		super();
		size = 7;
		for(int c = 1; c<=size;c++){
			for(int r =1; r<=size; r++){
				Cell cell = new Cell();
				cell.getLetter();
				cell.location.setColumn(c);
				cell.location.setRow(r);
				Location l = new Location(c,r);
				coordination.add(l);
				table.put(l, cell);	
			}
		}
	}
	
	public Board(int size) {
		super();
		for(int c = 1; c<=size;c++){
			for(int r =1; r<=size; r++){
				Cell cell = new Cell();
				cell.getLetter();
				cell.location.setColumn(c);
				cell.location.setRow(r);
				Location l = new Location(c,r);
				coordination.add(l);
				table.put(l, cell);	
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
			List<String> str = new Stack<>(); 
			for(int r =1; r<=size; r++){
				
				if(table.get(Location(c,r)) != null))
				Cell cell = new Cell();
				cell.getLetter();
				cell.location.setColumn(c);
				cell.location.setRow(r);
				table.put(new Location(c,r), cell);	
			}
		}
		
	}
	
	


}

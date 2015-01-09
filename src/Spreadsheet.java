
public class Spreadsheet {
	
	// private fields

	
	// private methods
	private static int getCol(String location) {
		//TODO		
	}
	
	private static int getRow(String location) {
		//TODO
	}
	
	private static String padOrTruncateDisplayString(Cell cell) {
	    // truncate string to length - 1 and display >
	    String s = cell.getDisplayString();
	    if (s.length() > columnWidth) {
	      s = s.substring(0, columnWidth - 1) + ">";
	    }
	    // if length is odd pad end to even length
	    if (s.length() % 2 == 1) {
	      s += " ";
	    }
	    // justify pad to center in cell
	    while (s.length() < columnWidth) {
	      s = " " + s + " ";
	    }
	    return s;
	}
	
	// constructor
	public Spreadsheet() {
		//TODO
	}
	
	// mutators
	public void setCell(String location, Cell cell) {
		//TODO
	}
	
	// accessors
	public Cell getCell(String location) {
		// TODO
	}
	
	public void print() {
		// TODO				
	}
}

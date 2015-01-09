public class Spreadsheet {
// private fields
  private Cell[][] Ss = new Cell[11][8];
  private static int rows = 11;
  private static int cols = 8;
  private static int columnWidth = 12;
  private static int asciiOffset = 64;
  private String border;
  private String borderRow;
  
// private methods
  private static int getCol(String location) 
  {
    return (int)location.charAt(0)-asciiOffset;
  }
  private static int getRow(String location)
  {
    return Integer.parseInt(location.substring(1));
  }
  private static String padOrTruncateDisplayString(Cell cell)
  {
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
  public Spreadsheet() 
  {
    Cell[][] Cells = new Cell[rows][cols];
    Cells[0][0] = new CellString("");
    
    border = "";
    
    for (int i = 0; i < columnWidth; i++)
    {
      border += "-";
    
    }
    
    borderRow = border + "+";
    
    for (int col = 0; col < cols; col++)
    {
      Cells[rows][cols]= new CellString((asciiOffset + col) + "");
    }
    
    for (int row = 1; row < rows; row++)
    {
      Cells[row][0] = new CellString(row + "");
      for (int column = 1; column < cols; column++)
      {
        Cells[rows][cols] = new CellString("");
        borderRow += border + "+";
      }
    }
  }
// mutators
  public void setCell(String location, Cell cell) 
  {

  }
// accessors
  public Cell getCell(String location) 
  {
    return cell;
  }
  public void print() {
// TODO
  }
}

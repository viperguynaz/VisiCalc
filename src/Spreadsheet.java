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
    
    border = "";
    
    for (int i = 0; i < columnWidth; i++)
    {
      border += "-";
    }
    
    Ss[0][0] = new CellString("");
    
    borderRow = border + "+";
    
    for (int col = 1; col < cols; col++)
    {
      Ss[0][col]= new CellString(((char)asciiOffset + col) + "");
    }
    
    for (int row = 1; row < rows; row++)
    {
      Ss[row][0] = new CellString(row + "");
      for (int column = 1; column < cols; column++)
      {
        Ss[row][column] = new CellString("");
        borderRow += border + "+";
      }
    }
  }
// mutators
  public void setCell(String position, Cell cell)
  {
    cell = Ss[getRow(position)][getCol(position)];
  }
// accessors
  public Cell getCell(String position)
  {
    return Ss[getRow(position)][getCol(position)];
  }
  public void print()
  {
    for (int row = 0; row < rows; row++)
    {
      for(int col = 0; col < cols; col++)
      {
        System.out.print(padOrTruncateDisplayString(Ss[row][col])+ "|");
      }
      System.out.println(borderRow);
    }
  }
}

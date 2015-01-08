public class VisiCalc {

  public static String padOrTruncateDisplayString(Cell cell) {
    // truncate string to length - 1 and display >
    int columnWidth = 12;
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
  
  
 public static void main(String[] args) {
  // create an array of cells
  Cell[] cells = new Cell[12];
  
  // add test values
  cells[0] = new CellString("");
  cells[1] = new CellString("wow");
  cells[2] = new CellString("quot\"es");
  cells[3] = new CellString("wow this is a long string");  
  
  cells[4] = new CellNumeric();
  cells[5] = new CellNumeric("abc");  // handle parse error, should result in empty value
  cells[6] = new CellNumeric("105.12");
  cells[7] = new CellNumeric("3.14159265359");
  
  cells[8] =  new CellDate();
  cells[9] =  new CellDate("43");  // handle parse error, should result in empty value
  cells[10] = new CellDate("1/1/1990");
  cells[11] = new CellDate("12/25/2014");
  
  // print the array
  String rowBorder = "------------|------------|------------";
  System.out.println(padOrTruncateDisplayString(new CellString("row")) + "|" + padOrTruncateDisplayString(new CellString("input")) + "|" + padOrTruncateDisplayString(new CellString("output")));
  System.out.println(rowBorder);
  for (int i = 0; i < cells.length; i++) {
   System.out.println(padOrTruncateDisplayString(new CellString(""+(i+1))) + "|" + padOrTruncateDisplayString(cells[i]) + "| " + cells[i].getInputValue());
   System.out.println(rowBorder);
  }
 }
}

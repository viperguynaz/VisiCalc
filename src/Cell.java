public abstract class Cell {
  
  private String inputString;
  
  public Cell(String input) {
    inputString = input;
  }
  
  // Get the string the user entered for this cell (before validation). Should only be used by subclasses.
  public String getInputString() {
    return inputString;
  }

  // Get the string that is being used to represent this cell's value, after validation.
  public abstract String getInputValue();

  // Get the string that should be displayed in the spreadsheet.
  public abstract String getDisplayString();
}

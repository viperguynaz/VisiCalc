
public class CellString extends Cell {
  
  public CellString() {
    super("");
  }
  
  public CellString(String input) {
    super(input);
  }
  
  public String getInputValue() {
    String inputString = getInputString();
    if (inputString.length() == 0) {
      return "<empty>";
    }
    return inputString = "\"" + inputString + "\"";
  }
  
  public String getDisplayString() {
    String toDisplay = getInputString();
    
    //remove start & end quotes from string
    if (toDisplay.startsWith("\"")) {
      toDisplay = toDisplay.substring(1);
      if (toDisplay.endsWith("\"")) {
        toDisplay = toDisplay.substring(0, toDisplay.length() - 1);
      }
    }
    // escape double quotes in strings
    toDisplay.replaceAll("\"", "\\\"");
    return toDisplay;
  }
}

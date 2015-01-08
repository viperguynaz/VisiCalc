public class CellNumeric extends Cell {
  
  public CellNumeric() {
    super("");
  }
  
  public CellNumeric(String input) {
    super(input);
  }
  
  public String getInputValue() {
    String inputString = getInputString();
    try {
      Double.parseDouble(inputString);
    } catch (Exception e) {
      return "<empty>";
    }
    return inputString;
  }
  
  public String getDisplayString() {
    String inputString = getInputString();
    try {
      Double.parseDouble(inputString);
    } catch (Exception e) {
      return "";
    }
    return inputString;
  }
}

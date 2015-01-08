import java.text.*;
import java.util.*;

public class CellDate extends Cell {
  
  private DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
  
  public CellDate() {
    super("");
  }
  
  public CellDate(String input) {
    super(input);
  }
  
  public String getInputValue() {
    Date date;
    String displayString;
    try {
      date = dateFormat.parse(getInputString()); 
      displayString = dateFormat.format(date);
    } catch (ParseException e) {
      displayString = "<empty>";
    }
    return displayString;
  }
  
  public String getDisplayString() {
    Date date;
    String displayString;
    try {
      date = dateFormat.parse(getInputString()); 
      displayString = dateFormat.format(date);
    } catch (ParseException e) {
      displayString = "";
    }
    return displayString;
  }
}

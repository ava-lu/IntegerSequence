import java.util.NoSuchElementException;
public class Range implements IntegerSequence {
  private int start, end, current;
  //@param start : the starting value (inclusive) which must be <= end.
  //@param end : the ending value which is also inclusive.
  public Range(int start, int end) {
    this.start = start;
    this.end = end;
  }
}

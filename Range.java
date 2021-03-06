import java.util.NoSuchElementException;
public class Range implements IntegerSequence {
  private int start, end, current;
  //@param start : the starting value (inclusive) which must be <= end.
  //@param end : the ending value which is also inclusive.
  public Range(int start, int end) {
    if (start<=end) {
      this.start = start;
      this.end = end;
      this.current = start;
    }
    else {
      throw new IllegalArgumentException();
    }
  }
  public void reset() {
    this.current = this.start;
  }
  public int length() {
    return (this.end - this.start + 1);
  }
  public boolean hasNext() {
    if (current>end)return false;
    else return true;
  }
  public int next() {
    if (hasNext()==false) {
      throw new NoSuchElementException();
    }
    current++;
    return current-1;
  }

}

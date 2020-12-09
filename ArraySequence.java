import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence {
  int currentIndex;
  int[] data;

  public ArraySequence(int[] other) {
    data = new int[other.length];
    for (int i=0; i<other.length; i++) {
      data[i] = other[i];
    }
    currentIndex = 0;
  }
  public ArraySequence(IntegerSequence otherseq) {
    data = new int[otherseq.length()];
    otherseq.reset();
    for (int i=0; i<otherseq.length();i++) {
      data[i] = otherseq.next();
    }
    otherseq.reset();
    currentIndex=0;
  }
  public void reset() {
    currentIndex = 0;
  }
  public int length() {
    return (data.length);
  }
  public boolean hasNext() {
    return(currentIndex<=data.length-1);
  }
  public int next() {
    if (hasNext()==false) {
      throw new NoSuchElementException();
    }
    currentIndex++;
    return data[currentIndex-1];
  }
}

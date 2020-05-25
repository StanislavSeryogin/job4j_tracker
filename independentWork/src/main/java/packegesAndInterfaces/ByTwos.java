package packegesAndInterfaces;

public class ByTwos implements Series {
    int start, val;

    ByTwos() {
        start = 0;
        val = 0;
    }

    public int getNext() {
        val += 2;
        return val;
    }

    public void reset() {
        start = 0;
        val = 0;
    }

    @Override
    public void setReset() {

    }

    public void setStart(int x) {
        start = x;
         val = x;
    }
}

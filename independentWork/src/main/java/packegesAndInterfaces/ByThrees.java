package packegesAndInterfaces;

public class ByThrees implements Series {
    int start, val;

    ByThrees() {
        start = 0;
        val = 0;
    }

    public  int getNext() {
        val += 3;
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

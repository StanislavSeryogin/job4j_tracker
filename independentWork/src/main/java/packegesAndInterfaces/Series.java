package packegesAndInterfaces;

public interface Series {
    int getNext();

    default int[] getNextArray(int n) {
        return getArray(n);
    }

    default int[] skipAndGetNextArray(int skip, int n) {
        getArray(skip);
        return getArray(n);
    }



    private int[] getArray(int n) {
        int[] val = new int[n];
        for (int i = 0; i < n; i++) val[i] = getNext();
        return val;
    }

    void reset();
    void setReset();
}

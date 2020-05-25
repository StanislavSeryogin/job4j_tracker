package methods;

public class ErrorInfo {
    String msgs[] = {
      "Input error",
      "Output error",
      "Out of disk space",
      "Index out of range"
    };
    int howbad[] = {3, 3, 2, 4};

    Err getErrorInfo(int i) {
        if (i >= 0 & i < msgs.length){
            return new Err(msgs[i], howbad[i]);
        } else {
            return new Err("Nonexistent error code", 0);
        }
    }
}

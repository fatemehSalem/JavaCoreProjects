public class ThreadSafeSingletonDoubleCheckLocking {

    private static ThreadSafeSingletonDoubleCheckLocking instance;

    private ThreadSafeSingletonDoubleCheckLocking(){}

    public static ThreadSafeSingletonDoubleCheckLocking getInstanceUsingDoubleCheckLocking() {
        if (instance == null) {
            synchronized (ThreadSafeSingletonDoubleCheckLocking.class) {
                if (instance == null) {
                    instance = new ThreadSafeSingletonDoubleCheckLocking();
                }
            }
        }
        return instance;
    }
}

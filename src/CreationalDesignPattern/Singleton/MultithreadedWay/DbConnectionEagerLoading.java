package CreationalDesignPattern.Singleton.MultithreadedWay;

public class DbConnectionEagerLoading {
    String url;
    String password;
    String userName;

    static DbConnectionEagerLoading instance = new DbConnectionEagerLoading(); // eager loading

    private DbConnectionEagerLoading(){
    }

    public static DbConnectionEagerLoading getInstance(){
        return instance;
    }
}

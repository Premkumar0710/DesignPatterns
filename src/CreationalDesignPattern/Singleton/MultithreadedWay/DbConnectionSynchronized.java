package CreationalDesignPattern.Singleton.MultithreadedWay;

public class DbConnectionSynchronized {
    String url;
    String password;
    String userName;

    static DbConnectionSynchronized instance = null;

    private DbConnectionSynchronized(){
    }

    public static synchronized DbConnectionSynchronized getInstance(){
        if(instance == null){
            instance = new DbConnectionSynchronized();
        }
        return instance;
    }
}

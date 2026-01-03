package CreationalDesignPattern.Singleton.MultithreadedWay;

public class DbConnectionLock {
    String url;
    String password;
    String userName;

    static DbConnectionLock instance = null; // eager loading

    private DbConnectionLock(){
    }

    public static DbConnectionLock getInstance(){
        if(instance == null){
            synchronized (DbConnectionLock.class){
                if(instance == null){
                    instance = new DbConnectionLock();
                }
            }
        }
        return instance;
    }
}

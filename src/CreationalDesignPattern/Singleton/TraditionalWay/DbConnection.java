package CreationalDesignPattern.Singleton.TraditionalWay;

public class DbConnection {
    String url;
    String password;
    String userName;

    static DbConnection instance = null;

    private DbConnection(){

    }

    public static DbConnection getInstance(){
        if(instance == null){
            instance = new DbConnection();
        }
        return instance;
    }
}

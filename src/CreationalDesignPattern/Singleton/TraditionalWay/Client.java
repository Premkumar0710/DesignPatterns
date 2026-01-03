package CreationalDesignPattern.Singleton.TraditionalWay;

public class Client {

    public static void main(String[] args) {

        DbConnection db1 = DbConnection.getInstance();
        DbConnection db2 = DbConnection.getInstance();

        if(db1 == db2){
            System.out.println("Objects are same !!");
        }
        else{
            System.out.println("Objects are different !!");
        }

        System.out.println(db1 + " " + db2);
    }
}

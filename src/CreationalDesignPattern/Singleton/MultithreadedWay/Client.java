package CreationalDesignPattern.Singleton.MultithreadedWay;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {

    public static void main(String[] args) throws InterruptedException {

        Set<DbConnectionSynchronized> dbConnectionSet = new HashSet<>();
        ExecutorService executorService  = Executors.newCachedThreadPool();

        for(int i=0;i<1000;i++){
           executorService.submit(()-> dbConnectionSet.add(DbConnectionSynchronized.getInstance()) );
        }

        Thread.sleep(2000);
        System.out.println("Size of database connections : " + dbConnectionSet.size());
        executorService.shutdown();
    }
}

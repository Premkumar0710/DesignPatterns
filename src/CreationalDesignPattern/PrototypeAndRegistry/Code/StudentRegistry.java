package CreationalDesignPattern.PrototypeAndRegistry.Code;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {

    private final Map<String,Student> map;

    public StudentRegistry(){
        this.map = new HashMap<>();
    }

    public void register(String key, Student value){
        map.put(key,value);
    }

    public Student get(String key){
        return map.get(key);
    }
}

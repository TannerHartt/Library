import demos.HashMapsDemo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class HashMapTest {

    HashMapsDemo test;
    @BeforeEach
    public void setup() {
        test = new HashMapsDemo();
    }

    @Test
    public void insertTest() {
        HashMap<String,Integer> map = new HashMap<>();
        test.insertNameAge(map,"Tanner", 24);
        System.out.println(map);
    }
}

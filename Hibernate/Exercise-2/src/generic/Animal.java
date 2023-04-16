package generic;

import java.io.Serializable;

public class Animal implements Serializable {
    String name;
    int age;
    public void eat(){
        System.out.println("Much Much Much");
    }
}

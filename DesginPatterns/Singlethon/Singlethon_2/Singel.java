package design.pattern.Singlethon;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Singel {
    
    private Integer[] numbers = {1,2,3,4,5,6,7,8,9};
    private List<Integer> list = Arrays.asList(numbers);
    private static Singel instance;

    public static Singel get_instance(){
        if (instance == null) {
            instance = new Singel();
        }
        return instance;
    }

    private Singel() {
        System.out.println("the Object is created");
        Collections.shuffle(list);
        System.out.println(this.hashCode());
    }

    public void printer(){
        for( Integer i : list){
            System.out.print(i.toString() + " ");
        }
        System.out.println();
    }
}

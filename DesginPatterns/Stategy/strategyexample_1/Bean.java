package strategyexample_1;

import java.io.Serializable;

public class Bean implements Serializable {
    
    private int counter;
    private String name;

    public int getCounter() {  return counter; }

    public void setCounter(final int counter) {  this.counter = counter; }

    public String getName() {  return name; }

    public void setName(final String name) {  this.name = name; }
}
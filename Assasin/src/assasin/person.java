
package assasin;


public class person {
    String name;
    person next;

    public person(String name) {
        this.name = name;
        this.next = null;
    }
    
    public person(String name, person next) {
        this.name = name;
        this.next = next;
    }
    
    public String printName(){
        return name;
    }
}

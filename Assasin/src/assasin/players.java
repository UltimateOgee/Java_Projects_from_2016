package assasin;

public class players {

    public person front;
    public person end;
    public int size;

    //constructor
    public players() {

    }

    //add sorted
    public void add(String name) {
        person current = front;
        if (front == null) {
            front = new person(name, front);
            size++;
        } else {
            for (int i = 0; i < size - 1; i++) {
                current = current.next;
            }
            end = new person(name);
            size++;
            end.next = front;
            current.next = end;

        }
    }

    public void remove(String name) {
        person current = front;
        for (int i = 0; i < size - 1; i++) {
            if (current.name.equals(name)) {
                
            }
        }
    }

    public String targetToString(String killer) {
        String target = "";
        person current = front;
        for (int i = 0; i < size; i++) {
            if (current.name.equals(killer)) {
                target = current.next.name;
                break;
            }
            current = current.next;
        }
        return target;
    }

    public String toString() {
        person current = front;
        String str = "[" + current.name + ", ";
        for (int i = 0; i < size; i++) {
            current = current.next;
            str = str + current.name + ", ";
        }
        str = str.substring(0, str.length() - 2) + "]";
        return str;
    }
}

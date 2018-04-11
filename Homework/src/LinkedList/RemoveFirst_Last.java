package LinkedList;

import java.util.LinkedList;

public class RemoveFirst_Last {
    public static void main(String[] args) {
        // adding areas to a list
        LinkedList<String> areas = new LinkedList<>();
        areas.add("Brooklyn");
        areas.add("Queens");
        areas.add("Bronx");
        areas.add("Manhattan");
        areas.removeFirst();
        areas.removeLast();
        System.out.println(areas);
    }
}

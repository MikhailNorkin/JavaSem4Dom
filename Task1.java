//Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
package JavaSem4Dom;

import java.util.LinkedList;
import java.util.Stack;

public class Task1 {
    public static LinkedList<Integer> perev(LinkedList<Integer> ll1) {
        Stack<Integer> sl = new Stack<>();
        LinkedList<Integer> ll2 = new LinkedList<>();
        for (Integer element : ll1) {
            sl.add(element);
        }
        while(!sl.empty()){
            ll2.add(sl.pop());
        }
        return ll2;
    }

    public static void main(String[] args) {
        LinkedList<Integer> ll1 = new LinkedList();
        ll1.add(1);
        ll1.add(2);
        ll1.add(3);
        LinkedList<Integer> ll2 = new LinkedList();
        ll2 = perev(ll1);
        System.out.println(ll2);
    }
}